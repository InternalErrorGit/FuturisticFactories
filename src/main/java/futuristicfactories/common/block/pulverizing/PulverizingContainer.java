package futuristicfactories.common.block.pulverizing;

import futuristicfactories.common.block.crystallizing.CrystallizingTileEntity;
import futuristicfactories.common.block.machine.MachineContainer;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class PulverizingContainer extends MachineContainer {

    public PulverizingContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id, playerInventory, new PulverizingTileEntity(), new IntArray(buffer.readByte()));
    }


    protected PulverizingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields) {
        super(id, playerInventory, inventory, fields, 13);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {

    }
}
