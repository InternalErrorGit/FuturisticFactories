package futuristicfactories.common.block.smelting;

import futuristicfactories.common.block.machine.MachineContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.IIntArray;

public class SmeltingContainer extends MachineContainer {
    protected SmeltingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields, int inventorySize) {
        super(id, playerInventory, inventory, fields, inventorySize);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {

    }
}
