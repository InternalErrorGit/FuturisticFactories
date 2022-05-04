package futuristicfactories.common.block.crushing;

import futuristicfactories.common.block.machine.MachineContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IIntArray;
import net.minecraft.util.IntArray;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CrushingContainer extends MachineContainer {

    public CrushingContainer(int id, PlayerInventory playerInventory, PacketBuffer buffer) {
        this(id, playerInventory, new CrushingTileEntity(), new IntArray(buffer.readByte()));
    }

    public CrushingContainer(int id, PlayerInventory playerInventory, IInventory inventory, IIntArray fields) {
        super(id, playerInventory, inventory, fields, 10);
    }

    @Override
    protected void addInventorySlots(IInventory inventory) {

        addSlot(new Slot(inventory, 0, 7, 69));
        addSlot(new Slot(inventory, 1, 25, 69));
        addSlot(new Slot(inventory, 2, 43, 69));

        addSlot(new Slot(inventory, 2, 37, 33));


        addSlot(new Slot(inventory, 1, 116, 35) {
            @Override
            public boolean isItemValid(ItemStack stack) {
                return false;
            }
        });
    }


    @Override
    protected void addPlayerInventorySlots(PlayerInventory playerInventory) {
        int invYOffset = 36;

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
}
