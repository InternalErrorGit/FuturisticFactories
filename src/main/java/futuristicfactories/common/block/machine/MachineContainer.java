package futuristicfactories.common.block.machine;

import futuristicfactories.common.registry.FFContainerTypeRegistry;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIntArray;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public abstract class MachineContainer extends Container {

    private final IInventory inventory;
    private IIntArray fields;
    private final int inventorySize;


    protected MachineContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields, int inventorySize) {
        super(FFContainerTypeRegistry.CRUSHING_MACHINE.get(), id);

        this.inventory = inventory;
        this.fields = fields;
        this.inventorySize = inventorySize;

        addInventorySlots(inventory);
        addPlayerInventorySlots(playerInventory);


    }



    protected abstract void addInventorySlots(IInventory inventory);
    protected abstract void addPlayerInventorySlots(PlayerInventory playerInventory);

    @Override
    public boolean canInteractWith(PlayerEntity player) {
        return inventory.isUsableByPlayer(player);
    }

    @Override
    public ItemStack transferStackInSlot(PlayerEntity playerInventory, int index) {
        ItemStack itemStack = ItemStack.EMPTY;

        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack transferStack = slot.getStack();
            itemStack = transferStack.copy();

            final int playerInventoryEnd = inventorySize + 27;
            final int playerHotbarEnd = playerInventoryEnd + 9;

            if (index == 1) {
                if (!this.mergeItemStack(transferStack, inventorySize, playerHotbarEnd, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onSlotChange(transferStack, itemStack);
            } else if (index != 0) {
                if (!mergeItemStack(transferStack, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (mergeItemStack(transferStack, inventorySize, playerHotbarEnd, false)) {
                return ItemStack.EMPTY;
            }

            if (transferStack.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
            if (transferStack.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }
            slot.onTake(playerInventory, transferStack);
        }
        return itemStack;
    }
}
