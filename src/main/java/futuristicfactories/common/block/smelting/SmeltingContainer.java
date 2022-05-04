package futuristicfactories.common.block.smelting;

import futuristicfactories.common.block.machine.MachineContainer;
import futuristicfactories.common.block.pulverizing.PulverizingTileEntity;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class SmeltingContainer extends MachineContainer {

    public SmeltingContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id, playerInventory, new SmeltingTileEntity(), new IntArray(buffer.readByte()));
    }



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
