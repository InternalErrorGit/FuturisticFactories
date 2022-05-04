package futuristicfactories.common.block.washing;

import futuristicfactories.common.block.machine.MachineBlock;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class WashingMachine extends MachineBlock {
    public WashingMachine(Properties properties) {
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
