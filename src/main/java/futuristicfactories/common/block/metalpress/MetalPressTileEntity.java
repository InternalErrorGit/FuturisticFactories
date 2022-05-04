package futuristicfactories.common.block.metalpress;

import futuristicfactories.common.crafting.recipe.PressingRecipe;
import futuristicfactories.common.registry.FFRecipes;
import futuristicfactories.common.registry.FFTileEntityRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;

public class MetalPressTileEntity extends LockableTileEntity implements ISidedInventory, ITickableTileEntity {

    static final int WORK_TIME = 2 * 20;

    private int progress = 0;

    private final IIntArray fields = new IIntArray() {
        @Override
        public int get(int index) {
            switch (index) {
                case 0:
                    return progress;
                default:
                    return 0;
            }
        }

        @Override
        public void set(int index, int value) {
            switch (index) {
                case 0:
                    progress = value;
                    break;
                default:
                    break;
            }
        }

        @Override
        public int size() {
            return 1;
        }
    };

    private NonNullList<ItemStack> items;

    private final LazyOptional<? extends IItemHandler>[] handlers;

    public MetalPressTileEntity() {
        super(FFTileEntityRegistry.METAL_PRESS.get());
        handlers = SidedInvWrapper.create(this, Direction.DOWN, Direction.UP, Direction.NORTH);
        items = NonNullList.withSize(2, ItemStack.EMPTY);
    }

    void encodeExtraData(PacketBuffer buffer) {
        buffer.writeByte(fields.size());
    }

    @Override
    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.futuristicfactories.metal_press");
    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return new MetalPressContainer(id, player, this, this.fields);
    }

    @Override
    public int[] getSlotsForFace(Direction side) {
        return new int[]{0, 1};
    }

    @Override
    public boolean canInsertItem(int index, ItemStack itemStackIn, @Nullable Direction direction) {
        return canInsertItem(index, itemStackIn, direction);
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, Direction direction) {
        return canExtractItem(index, stack, direction);
    }

    @Override
    public int getSizeInventory() {
        return 2;
    }

    @Override
    public boolean isEmpty() {
        return getStackInSlot(0).isEmpty() && getStackInSlot(1).isEmpty();
    }

    @Override
    public ItemStack getStackInSlot(int index) {
        return items.get(index);
    }

    @Override
    public ItemStack decrStackSize(int index, int count) {
        return ItemStackHelper.getAndSplit(items, index, count);
    }

    @Override
    public ItemStack removeStackFromSlot(int index) {
        return ItemStackHelper.getAndRemove(items, index);
    }

    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        items.set(index, stack);
    }

    @Override
    public boolean isUsableByPlayer(PlayerEntity player) {
        return world != null && world.getTileEntity(pos) == this && player.getDistanceSq(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5) <= 64;
    }

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public void tick() {
        if (world == null || !world.isRemote) {
            return;
        }

        PressingRecipe recipe = getRecipe();
        if (recipe != null) {
            doWork(recipe);
        } else {
            stopWork();
        }

    }

    @Nullable
    public PressingRecipe getRecipe() {
        if (world == null || getStackInSlot(0).isEmpty()) {
            return null;
        }
        return Objects.requireNonNull(world.getRecipeManager().getRecipe(FFRecipes.Types.PRESSING, this, world).orElse(null));
    }

    private ItemStack getWorkOutput(@Nullable PressingRecipe recipe) {
        if (recipe != null) return recipe.getCraftingResult(this);
        return ItemStack.EMPTY;
    }

    private void doWork(PressingRecipe recipe) {
        assert world != null;

        ItemStack current = getStackInSlot(1);
        ItemStack output = getWorkOutput(recipe);

        if (!current.isEmpty()) {
            int newCount = current.getCount() + output.getCount();

            if (!ItemStack.areItemStacksEqual(current, output) || newCount > output.getMaxStackSize()) {
                stopWork();
                return;
            }
        }

        if (progress < WORK_TIME) {
            progress++;
        }

        if (progress >= WORK_TIME) {
            finishWork(recipe, current, output);
        }

    }

    private void stopWork() {
        progress = 0;
    }

    private void finishWork(PressingRecipe recipe, ItemStack current, ItemStack output) {
        if (!current.isEmpty()) {
            current.grow(output.getCount());
        } else {
            setInventorySlotContents(1, output);
        }

        progress = 0;

        decrStackSize(0, 1);
    }

    @Override
    public void read(BlockState state, CompoundNBT nbt) {
        super.read(state, nbt);
        items = NonNullList.withSize(2, ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(nbt, items);

        this.progress = nbt.getInt("Progress");
    }

    @Override
    public CompoundNBT write(CompoundNBT compound) {
        super.write(compound);
        ItemStackHelper.saveAllItems(compound, items);
        compound.putInt("Progress", progress);
        return compound;
    }

    @Nullable
    @Override
    public SUpdateTileEntityPacket getUpdatePacket() {
        CompoundNBT tags = getUpdateTag();
        ItemStackHelper.saveAllItems(tags, items);
        return new SUpdateTileEntityPacket(pos, 1, tags);
    }

    @Override
    public CompoundNBT getUpdateTag() {
        CompoundNBT tags = super.getUpdateTag();
        tags.putInt("progress", progress);
        return tags;
    }

    @Override
    @Nonnull
    public <T> LazyOptional<T> getCapability(Capability<T> cap, @Nullable Direction side) {
        if (!removed && side != null && cap == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (side == Direction.UP) {
                return handlers[0].cast();
            } else if (side == Direction.DOWN) {
                return handlers[1].cast();
            } else {
                return handlers[2].cast();
            }
        } else {
            return super.getCapability(cap, side);
        }
    }

    @Override
    public void remove() {
        super.remove();

        for (LazyOptional<? extends IItemHandler> handler : handlers) {
            handler.invalidate();
        }
    }
}
