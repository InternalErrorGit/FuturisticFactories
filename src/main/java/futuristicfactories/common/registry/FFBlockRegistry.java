package futuristicfactories.common.registry;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.IFFMaterial;
import futuristicfactories.common.block.combining.CombiningMachine;
import futuristicfactories.common.block.crushing.CrushingMachine;
import futuristicfactories.common.block.crystallizing.CrystallizingMachine;
import futuristicfactories.common.block.pulverizing.PulverizingMachine;
import futuristicfactories.common.block.smelting.SmeltingMachine;
import futuristicfactories.common.block.washing.WashingMachine;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

import static futuristicfactories.FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS;

public class FFBlockRegistry implements IFFRegistryNames {
    public static final RegistryObject<Block> ALUMINUM_ORE = register(REGISTRY_NAME_ALUMINUM_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_ALUMINUM_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> COPPER_ORE = register(REGISTRY_NAME_COPPER_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_COPPER_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> LEAD_ORE = register(REGISTRY_NAME_LEAD_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_LEAD_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> NICKEL_ORE = register(REGISTRY_NAME_NICKEL_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_NICKEL_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> SILVER_ORE = register(REGISTRY_NAME_SILVER_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_SILVER_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> TIN_ORE = register(REGISTRY_NAME_TIN_ORE, () -> new Block(IFFMaterial.oreProperties(IFFMaterial.MATERIAL_TIN_ORE)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> ALUMINUM_BLOCK = register(REGISTRY_NAME_ALUMINUM_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_ALUMINUM_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> COPPER_BLOCK = register(REGISTRY_NAME_COPPER_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_COPPER_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> LEAD_BLOCK = register(REGISTRY_NAME_LEAD_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_LEAD_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> NICKEL_BLOCK = register(REGISTRY_NAME_NICKEL_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_NICKEL_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> SILVER_BLOCK = register(REGISTRY_NAME_SILVER_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_SILVER_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);
    public static final RegistryObject<Block> TIN_BLOCK = register(REGISTRY_NAME_TIN_BLOCK, () -> new Block(IFFMaterial.blockProperties(IFFMaterial.MATERIAL_TIN_BLOCK)), FUTURISTIC_FACTORIES_TAB_MATERIALS);

    public static final RegistryObject<CrushingMachine> CRUSHING_MACHINE = register(REGISTRY_NAME_CRUSHING_MACHINE, () -> new CrushingMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);
    public static final RegistryObject<PulverizingMachine> PULVERIZING_MACHINE = register(REGISTRY_NAME_PULVERIZING_MACHINE, () -> new PulverizingMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);
    public static final RegistryObject<CrystallizingMachine> CRYSTALLIZING_MACHINE = register(REGISTRY_NAME_CRYSTALLIZING_MACHINE, () -> new CrystallizingMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);
    public static final RegistryObject<CombiningMachine> COMBINING_MACHINE = register(REGISTRY_NAME_COMBINING_MACHINE, () -> new CombiningMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);
    public static final RegistryObject<SmeltingMachine> SMELTING_MACHINE = register(REGISTRY_NAME_SMELTING_MACHINE, () -> new SmeltingMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);
    public static final RegistryObject<WashingMachine> WASHING_MACHINE = register(REGISTRY_NAME_WASHING_MACHINE, () -> new WashingMachine(IFFMaterial.machineProperties(IFFMaterial.MATERIAL_MACHINE)), FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MACHINES);

    public static void register() {
    }

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return FFRegistration.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, ItemGroup group) {
        RegistryObject<T> ret = registerNoItem(name, block);
        FFRegistration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(group)));
        return ret;
    }
}
