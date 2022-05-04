package futuristicfactories.common.block.combining;

import futuristicfactories.common.block.machine.MachineBlock;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class CombiningMachine extends MachineBlock {
    public CombiningMachine(Properties properties) {
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
