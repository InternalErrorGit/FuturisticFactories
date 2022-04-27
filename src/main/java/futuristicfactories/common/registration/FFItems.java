package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static futuristicfactories.FuturisticFactories.*;

@ObjectHolder(MODID)
public class FFItems implements IFFRegistry<Item> {

    private static final Logger LOGGER = LogManager.getLogger();
    @ObjectHolder(ITEM_BLOCK_ORE_ALUMINUM)
    public static BlockItem itemBlockOreAluminum;
    @ObjectHolder(ITEM_BLOCK_ORE_COPPER)
    public static BlockItem itemBlockOreCopper;
    @ObjectHolder(ITEM_BLOCK_ORE_LEAD)
    public static BlockItem itemBlockOreLead;
    @ObjectHolder(ITEM_BLOCK_ORE_NICKEL)
    public static BlockItem itemBlockOreNickel;
    @ObjectHolder(ITEM_BLOCK_ORE_SILVER)
    public static BlockItem itemBlockOreSilver;
    @ObjectHolder(ITEM_BLOCK_ORE_TIN)
    public static BlockItem itemBlockOreTin;
    @ObjectHolder(ITEM_BLOCK_COPPER)
    public static BlockItem itemBlockCopper;
    @ObjectHolder(ITEM_BLOCK_ALUMINUM)
    public static BlockItem itemBlockAluminum;
    @ObjectHolder(ITEM_BLOCK_LEAD)
    public static BlockItem itemBlockLead;
    @ObjectHolder(ITEM_BLOCK_NICKEL)
    public static BlockItem itemBlockNickel;
    @ObjectHolder(ITEM_BLOCK_SILVER)
    public static BlockItem itemBlockSilver;
    @ObjectHolder(ITEM_BLOCK_TIN)
    public static BlockItem itemBlockTin;
    
    @ObjectHolder(BLOCK_MACHINE_SMELTER)
    public static BlockItem itemBlockMachineSmelter;

    @ObjectHolder(ITEM_NUGGET_ALUMINUM)
    public static Item itemNuggetAluminum;
    @ObjectHolder(ITEM_NUGGET_COPPER)
    public static Item itemNuggetCopper;
    @ObjectHolder(ITEM_NUGGET_LEAD)
    public static Item itemNuggetLead;
    @ObjectHolder(ITEM_NUGGET_NICKEL)
    public static Item itemNuggetNickel;
    @ObjectHolder(ITEM_NUGGET_SILVER)
    public static Item itemNuggetSilver;
    @ObjectHolder(ITEM_NUGGET_TIN)
    public static Item itemNuggetTin;
    @ObjectHolder(ITEM_INGOT_ALUMINUM)
    public static Item itemIngotAluminum;
    @ObjectHolder(ITEM_INGOT_COPPER)
    public static Item itemIngotCopper;
    @ObjectHolder(ITEM_INGOT_LEAD)
    public static Item itemIngotLead;
    @ObjectHolder(ITEM_INGOT_NICKEL)
    public static Item itemIngotNickel;
    @ObjectHolder(ITEM_INGOT_SILVER)
    public static Item itemIngotSilver;
    @ObjectHolder(ITEM_INGOT_TIN)
    public static Item itemIngotTin;


    @Override
    public void init() {
        LOGGER.info("Initializing items");

        itemBlockOreAluminum = new BlockItem(FFBlocks.blockOreAluminum, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockOreCopper = new BlockItem(FFBlocks.blockOreCopper, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockOreLead = new BlockItem(FFBlocks.blockOrLead, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockOreNickel = new BlockItem(FFBlocks.blockOreNickel, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockOreSilver = new BlockItem(FFBlocks.blockOreSilver, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockOreTin = new BlockItem(FFBlocks.blockOreTin, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockAluminum = new BlockItem(FFBlocks.blockAluminum, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockCopper = new BlockItem(FFBlocks.blockCopper, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockLead = new BlockItem(FFBlocks.blockLead, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockNickel = new BlockItem(FFBlocks.blockNickel, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockSilver = new BlockItem(FFBlocks.blockSilver, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));
        itemBlockTin = new BlockItem(FFBlocks.blockTin, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS));

        itemBlockMachineSmelter = new BlockItem(FFBlocks.blockMachineSmelter, new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MACHINES));

        itemNuggetAluminum = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_ALUMINUM);
        itemNuggetCopper = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_COPPER);
        itemNuggetLead = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_LEAD);
        itemNuggetNickel = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_NICKEL);
        itemNuggetSilver = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_SILVER);
        itemNuggetTin = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_NUGGET_TIN);
        itemIngotAluminum = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_ALUMINUM);
        itemIngotCopper = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_COPPER);
        itemIngotLead = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_LEAD);
        itemIngotNickel = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_NICKEL);
        itemIngotSilver = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_SILVER);
        itemIngotTin = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)).setRegistryName(ITEM_INGOT_TIN);

        LOGGER.info("Initializing items done");
    }

    @Override
    public void register(IForgeRegistry<Item> registry) {
        init();
        LOGGER.info("Registering items");

        registry.register(itemBlockOreAluminum.setRegistryName(ITEM_BLOCK_ORE_ALUMINUM));
        registry.register(itemBlockOreCopper.setRegistryName(ITEM_BLOCK_ORE_COPPER));
        registry.register(itemBlockOreLead.setRegistryName(ITEM_BLOCK_ORE_LEAD));
        registry.register(itemBlockOreNickel.setRegistryName(ITEM_BLOCK_ORE_NICKEL));
        registry.register(itemBlockOreSilver.setRegistryName(ITEM_BLOCK_ORE_SILVER));
        registry.register(itemBlockOreTin.setRegistryName(ITEM_BLOCK_ORE_TIN));
        registry.register(itemBlockAluminum.setRegistryName(ITEM_BLOCK_ALUMINUM));
        registry.register(itemBlockCopper.setRegistryName(ITEM_BLOCK_COPPER));
        registry.register(itemBlockLead.setRegistryName(ITEM_BLOCK_LEAD));
        registry.register(itemBlockNickel.setRegistryName(ITEM_BLOCK_NICKEL));
        registry.register(itemBlockSilver.setRegistryName(ITEM_BLOCK_SILVER));
        registry.register(itemBlockTin.setRegistryName(ITEM_BLOCK_TIN));

        registry.register(itemBlockMachineSmelter.setRegistryName(ITEM_BLOCK_MACHINE_SMELTER));

        registry.register(itemNuggetAluminum);
        registry.register(itemNuggetCopper);
        registry.register(itemNuggetLead);
        registry.register(itemNuggetNickel);
        registry.register(itemNuggetSilver);
        registry.register(itemNuggetTin);
        registry.register(itemIngotAluminum);
        registry.register(itemIngotCopper);
        registry.register(itemIngotLead);
        registry.register(itemIngotNickel);
        registry.register(itemIngotSilver);
        registry.register(itemIngotTin);


        LOGGER.info("Registering items done");
    }


}
