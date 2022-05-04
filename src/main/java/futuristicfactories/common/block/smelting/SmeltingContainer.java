package futuristicfactories.common.block.smelting;

import futuristicfactories.common.block.machine.MachineContainer;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.IIntArray;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SmeltingContainer extends MachineContainer {
    protected SmeltingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields, int inventorySize) {
        super(id, playerInventory, inventory, fields, inventorySize);
    }

    @Override
    protected void addInventorySlots(@Nullable IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(@Nullable PlayerInventory playerInventory) {

    }
}
