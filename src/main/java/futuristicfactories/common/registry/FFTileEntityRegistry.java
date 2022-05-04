package futuristicfactories.common.registry;

import futuristicfactories.common.block.crushing.CrushingTileEntity;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class FFTileEntityRegistry implements IFFRegistryNames {

    public static void register() {

    }

    public static final RegistryObject<TileEntityType<CrushingTileEntity>> CRUSHING_MACHINE = register(REGISTRY_NAME_CRUSHING, CrushingTileEntity::new, FFBlockRegistry.CRUSHING_MACHINE);

    private static <T extends TileEntity> RegistryObject<TileEntityType<T>> register(String registryName, Supplier<T> factory, RegistryObject<? extends Block> block) {
        return FFRegistration.TILE_ENTITIES.register(registryName, () -> TileEntityType.Builder.create(factory, block.get()).build(null));
    }

    public static final RegistryObject<TileEntityType<CrushingTileEntity>> PULVERIZING_MACHINE = register(REGISTRY_NAME_PULVERIZING, CrushingTileEntity::new, FFBlockRegistry.PULVERIZING_MACHINE);
    public static final RegistryObject<TileEntityType<CrushingTileEntity>> CRYSTALLIZING_MACHINE = register(REGISTRY_NAME_CRYSTALLIZING, CrushingTileEntity::new, FFBlockRegistry.CRYSTALLIZING_MACHINE);
    public static final RegistryObject<TileEntityType<CrushingTileEntity>> COMBINING_MACHINE = register(REGISTRY_NAME_COMBINING, CrushingTileEntity::new, FFBlockRegistry.COMBINING_MACHINE);
    public static final RegistryObject<TileEntityType<CrushingTileEntity>> SMELTING_MACHINE = register(REGISTRY_NAME_SMELTING, CrushingTileEntity::new, FFBlockRegistry.SMELTING_MACHINE);
    public static final RegistryObject<TileEntityType<CrushingTileEntity>> WASHING_MACHINE = register(REGISTRY_NAME_WASHING, CrushingTileEntity::new, FFBlockRegistry.WASHING_MACHINE);






}
