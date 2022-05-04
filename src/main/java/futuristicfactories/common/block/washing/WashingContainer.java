package futuristicfactories.common.block.washing;

import futuristicfactories.common.block.machine.MachineContainer;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.IIntArray;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class WashingContainer extends MachineContainer {
    protected WashingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields, int inventorySize) {
        super(id, playerInventory, inventory, fields, inventorySize);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {

    }
}
