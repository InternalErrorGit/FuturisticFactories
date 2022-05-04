package futuristicfactories.common.block.combining;

import futuristicfactories.common.block.machine.MachineContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CombiningContainer extends MachineContainer {

    public CombiningContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id, playerInventory, new CombiningTileEntity(), new IntArray(buffer.readByte()));
    }

    protected CombiningContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields) {
        super(id, playerInventory, inventory, fields, 13);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

    }

    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {

    }
}
