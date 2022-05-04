package futuristicfactories.common.block.machine;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public abstract class MachineTileEntity<RecipeType> extends LockableTileEntity implements ISidedInventory, ITickableTileEntity {

    protected static int WORK_TIME = 0;
    protected final int inventorySize;
    private final LazyOptional<? extends IItemHandler>[] handlers;
    protected int progress = 0;
    protected final IIntArray fields = new IIntArray() {
        @Override
        public int get(int index) {
            if (index == 0) {
                return progress;
            }
            return 0;
        }

        @Override
        public void set(int index, int value) {
            if (index == 0) {
                progress = value;
            }
        }

        @Override
        public int size() {
            return 1;
        }
    };
    private NonNullList<ItemStack> items;

    public <T extends MachineTileEntity<?>> MachineTileEntity(int inventorySize, TileEntityType<T> tileEntityType) {
        super(tileEntityType);
        handlers = SidedInvWrapper.create(this, Direction.DOWN, Direction.UP, Direction.NORTH);
        items = NonNullList.withSize(inventorySize, ItemStack.EMPTY);
        this.inventorySize = inventorySize;
        setWorkTime();
    }

    public void encodeExtraData(PacketBuffer buffer) {
        buffer.writeByte(fields.size());
    }

    protected abstract void setWorkTime();

    @Override
    protected ITextComponent getDefaultName() {
        return getTranslation();
    }

    protected abstract ITextComponent getTranslation();

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
    public boolean canInsertItem(int index, ItemStack itemStackIn, @Nullable Direction direction) {
        return true;
    }

    @Override
    public boolean canExtractItem(int index, ItemStack stack, Direction direction) {
        return true;
    }

    @Override
    public int getSizeInventory() {
        return inventorySize;
    }

    @Override
    public boolean isEmpty() {
        return items.stream().allMatch(ItemStack::isEmpty);
    }

    protected abstract void doWork(RecipeType recipe);

    protected abstract void stopWork();

    protected abstract void finishWork(ItemStack current, ItemStack output);

    @Override
    public void clear() {
        items.clear();
    }

    @Override
    public void tick() {
        if (world == null || !world.isRemote) {
            return;
        }

        RecipeType recipe = getRecipe();
        if (recipe != null) {
            doWork(recipe);
        } else {
            stopWork();
        }

    }

    @Override
    public int[] getSlotsForFace(Direction side) {
        return new int[]{0, 1};
    }

    @Nullable
    public RecipeType getRecipe() {
        if (world == null || getStackInSlot(0).isEmpty()) {
            return null;
        }
        return null; // Objects.requireNonNull(world.getRecipeManager().getRecipe(FFRecipes.Types.PRESSING, this, world).orElse(null));
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
