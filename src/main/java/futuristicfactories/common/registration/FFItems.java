package futuristicfactories.common.registration;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static futuristicfactories.FuturisticFactories.FUTURISTIC_FACTORIES_TAB;
import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFItems implements IFFRegistry<Item> {

    private static final Logger LOGGER = LogManager.getLogger();
    @ObjectHolder(BLOCK_ORE_COPPER)
    public static BlockItem itemBlockOreCopper;
    @ObjectHolder(BLOCK_ORE_TIN)
    public static BlockItem itemBlockOreTin;
    @ObjectHolder(BLOCK_ORE_OSMIUM)
    public static BlockItem itemBlockOreOsmium;
    @ObjectHolder(BLOCK_ORE_LEAD)
    public static BlockItem itemBlockOreLead;
    @ObjectHolder(BLOCK_COPPER)
    public static BlockItem itemBlockCopper;
    @ObjectHolder(BLOCK_TIN)
    public static BlockItem itemBlockTin;
    @ObjectHolder(BLOCK_OSMIUM)
    public static BlockItem itemBlockOsmium;
    @ObjectHolder(BLOCK_LEAD)
    public static BlockItem itemBlockLead;
    @ObjectHolder(ITEM_INGOT_COPPER)
    public static Item itemIngotCopper;
    @ObjectHolder(ITEM_INGOT_TIN)
    public static Item itemIngotTin;
    @ObjectHolder(ITEM_INGOT_OSMIUM)
    public static Item itemIngotOsmium;
    @ObjectHolder(ITEM_INGOT_LEAD)
    public static Item itemIngotLead;


    @Override
    public void init() {
        LOGGER.info("Initializing items");
        itemBlockOreCopper = new BlockItem(FFBlocks.blockOreCopper, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockOreTin = new BlockItem(FFBlocks.blockOreTin, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockOreOsmium = new BlockItem(FFBlocks.blockOreOsmium, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockOreLead = new BlockItem(FFBlocks.blockOreLead, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockCopper = new BlockItem(FFBlocks.blockCopper, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockTin = new BlockItem(FFBlocks.blockTin, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockOsmium = new BlockItem(FFBlocks.blockOsmium, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemBlockLead = new BlockItem(FFBlocks.blockLead, new Item.Properties().group(FuturisticFactories.FUTURISTIC_FACTORIES_TAB));
        itemIngotCopper = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB)).setRegistryName(ITEM_INGOT_COPPER);
        itemIngotTin = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB)).setRegistryName(ITEM_INGOT_TIN);
        itemIngotOsmium = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB)).setRegistryName(ITEM_INGOT_OSMIUM);
        itemIngotLead = new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB)).setRegistryName(ITEM_INGOT_LEAD);
        LOGGER.info("Initializing items done");
    }

    @Override
    public void register(IForgeRegistry<Item> registry) {
        init();
        LOGGER.info("Registering items");
        registry.register(itemBlockOreCopper.setRegistryName(ITEM_BLOCK_ORE_COPPER));
        registry.register(itemBlockOreTin.setRegistryName(ITEM_BLOCK_ORE_TIN));
        registry.register(itemBlockOreOsmium.setRegistryName(ITEM_BLOCK_ORE_OSMIUM));
        registry.register(itemBlockOreLead.setRegistryName(ITEM_BLOCK_ORE_LEAD));
        registry.register(itemBlockCopper.setRegistryName(ITEM_BLOCK_COPPER));
        registry.register(itemBlockTin.setRegistryName(ITEM_BLOCK_TIN));
        registry.register(itemBlockOsmium.setRegistryName(ITEM_BLOCK_OSMIUM));
        registry.register(itemBlockLead.setRegistryName(ITEM_BLOCK_LEAD));
        registry.register(itemIngotCopper);
        registry.register(itemIngotTin);
        registry.register(itemIngotOsmium);
        registry.register(itemIngotLead);
        LOGGER.info("Registering items done");
    }


}
