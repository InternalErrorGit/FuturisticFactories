package futuristicfactories.common.block.metalpress;

import futuristicfactories.common.registry.FFContainerTypeRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

import javax.annotation.Nullable;

public class MetalPressContainer extends Container {

    private final IInventory inventory;
    private IIntArray fields;

    public MetalPressContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id,playerInventory,new MetalPressTileEntity(), new IntArray(buffer.readByte()));
    }

    public MetalPressContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields) {
        super(FFContainerTypeRegistry.METAL_PRESS.get(), id);

        this.inventory = inventory;
        this.fields = fields;

        addSlot(new Slot(this.inventory, 0, 56, 35));
        addSlot(new Slot(this.inventory, 1, 116, 35) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return false;
            }
        });

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 9; x++) {
                int index = x + y * 9;
                int posX = 8 + x * 18;
                int posY = 84 + y * 18;
                addSlot(new Slot(playerInventory, index + 9, posX, posY));
            }
        }
        for (int x = 0; x < 9; x++) {
            int posX = 8 + x * 18;
            addSlot(new Slot(playerInventory, x, posX, 142));
        }
    }

    public int getProgressArrowScale() {
        int progress = fields.get(0);
        if (progress != 0) {
            return progress * 24 / MetalPressTileEntity.WORK_TIME;
        }
        return 0;
    }

    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return inventory.isUsableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerInventory, int index) {
        ItemStack itemStack = ItemStack.EMPTY;

        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {

            ItemStack itemStack1 = slot.getStack();
            itemStack = itemStack1.copy();

            final int inventorySize = 2;
            final int playerInventoryEnd = inventorySize + 27;
            final int playerHotbarEnd = playerInventoryEnd + 9;

            if (index == 1) {
                if (!this.mergeItemStack(itemStack1, inventorySize, playerHotbarEnd, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(itemStack1, itemStack);
            } else if (index != 0) {
                if (!mergeItemStack(itemStack1, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (mergeItemStack(itemStack1, inventorySize, playerHotbarEnd, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
            if (itemStack1.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTake(playerInventory, itemStack1);
        }
        return itemStack;

    }
}
