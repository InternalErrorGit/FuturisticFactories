package futuristicfactories.common.block.pulverizing;

import futuristicfactories.common.block.machine.MachineBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PulverizingMachine extends MachineBlock {
    public PulverizingMachine(Properties properties) {
        super(properties);
    }

    @Override
    protected TileEntity createTileEntity() {
        return null;
    }

    @Override
    protected void interactWith(World world, BlockPos pos, PlayerEntity player) {

    }
}
