package futuristicfactories.common.registry;

import futuristicfactories.common.block.crushing.CrushingTileEntity;
import futuristicfactories.common.block.metalpress.MetalPressTileEntity;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class FFTileEntityRegistry implements IFFRegistryNames {

    public static final RegistryObject<TileEntityType<MetalPressTileEntity>> METAL_PRESS = register(REGISTRY_NAME_METAL_PRESS, MetalPressTileEntity::new, FFBlockRegistry.METAL_PRESS);
    public static final RegistryObject<TileEntityType<CrushingTileEntity>> CRUSHING_MACHINE = register(REGISTRY_NAME_CRUSHING, CrushingTileEntity::new, FFBlockRegistry.CRUSHING_MACHINE);

    public static void register() {

    }
    private static <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String registryName, Supplier<T> factory, RegistryObject<? extends Block> block) {
        return FFRegistration.TILE_ENTITIES.register(registryName, () -> TileEntityType.Builder.create(factory, block.get()).build(null));
    }


}
