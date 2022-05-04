package futuristicfactories.common.block.crystallizing;

import futuristicfactories.common.block.crushing.CrushingTileEntity;
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
public class CrystallizingContainer extends MachineContainer {

    public CrystallizingContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id, playerInventory, new CrystallizingTileEntity(), new IntArray(buffer.readByte()));
    }


    protected CrystallizingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields) {
        super(id, playerInventory, inventory, fields, 13);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {

    }
}
