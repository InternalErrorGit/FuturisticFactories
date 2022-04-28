package futuristicfactories.common.registry;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.IFFMaterial;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class FFBlockRegistry implements IFFRegistryNames {
    public static final RegistryObject<Block> ALUMINUM_ORE = register(REGISTRY_NAME_ALUMINUM_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_ALUMINUM_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> COPPER_ORE = register(REGISTRY_NAME_COPPER_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_COPPER_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> LEAD_ORE = register(REGISTRY_NAME_LEAD_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_LEAD_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> NICKEL_ORE = register(REGISTRY_NAME_NICKEL_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_NICKEL_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> SILVER_ORE = register(REGISTRY_NAME_SILVER_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_SILVER_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> TIN_ORE = register(REGISTRY_NAME_TIN_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_TIN_ORE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = register(REGISTRY_NAME_ALUMINUM_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_ALUMINUM_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> COPPER_BLOCK = register(REGISTRY_NAME_COPPER_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_COPPER_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> LEAD_BLOCK = register(REGISTRY_NAME_LEAD_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_LEAD_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> NICKEL_BLOCK = register(REGISTRY_NAME_NICKEL_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_NICKEL_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> SILVER_BLOCK = register(REGISTRY_NAME_SILVER_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_SILVER_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> TIN_BLOCK = register(REGISTRY_NAME_TIN_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_TIN_BLOCK)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> METAL_PRESS = register(REGISTRY_NAME_METAL_PRESS, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_METAL_PRESS)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);

    public static void register() {
    }

    private static RegistryObject<Block> registerNoItem(String name, Supplier<Block> block) {
        return FFRegistration.BLOCKS.register(name, block);
    }

    private static RegistryObject<Block> register(String name, Supplier<Block> block, ItemGroup itemGroup) {
        RegistryObject<Block> ret = registerNoItem(name, block);
        FFRegistration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(itemGroup)));
        return ret;
    }
}
