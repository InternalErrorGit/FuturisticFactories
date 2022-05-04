package futuristicfactories.common.block.crushing;

import futuristicfactories.common.block.machine.MachineBlock;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class CrushingMachine extends MachineBlock {
    public CrushingMachine(Properties properties) {
        super(properties);
    }

    @Override
    protected TileEntity createTileEntity() {
        return new CrushingTileEntity();
    }

    @Override
    protected void interactWith(World world, BlockPos pos, PlayerEntity player) {
        TileEntity tileEntity = world.getTileEntity(pos);
        if (tileEntity instanceof CrushingTileEntity && player instanceof ServerPlayerEntity) {
            CrushingTileEntity te = (CrushingTileEntity) tileEntity;
            NetworkHooks.openGui((ServerPlayerEntity) player, te, te::encodeExtraData);
        }
    }
}
