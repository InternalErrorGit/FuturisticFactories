package futuristicfactories.common.registry;

import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public interface IFFRegistry<T extends IForgeRegistryEntry<T>> {

    String BLOCK_ORE_COPPER = "block_copper_ore";
    String BLOCK_ORE_TIN = "block_tin_ore";
    String BLOCK_ORE_OSMIUM = "block_osmium_ore";
    String BLOCK_ORE_LEAD = "block_lead_ore";
    String BLOCK_COPPER = "block_copper";
    String BLOCK_TIN = "block_tin";
    String BLOCK_OSMIUM = "block_osmium";
    String BLOCK_LEAD = "block_lead";

    String ITEM_BLOCK_ORE_COPPER = "item_block_copper_ore";
    String ITEM_BLOCK_ORE_TIN = "item_block_tin_ore";
    String ITEM_BLOCK_ORE_OSMIUM = "item_block_osmium_ore";
    String ITEM_BLOCK_ORE_LEAD = "item_block_lead_ore";
    String ITEM_BLOCK_COPPER = "item_block_copper";
    String ITEM_BLOCK_TIN = "item_block_tin";
    String ITEM_BLOCK_OSMIUM = "item_block_osmium";
    String ITEM_BLOCK_LEAD = "item_block_lead";
    String ITEM_INGOT_COPPER = "item_ingot_copper";
    String ITEM_INGOT_TIN = "item_ingot_tin";
    String ITEM_INGOT_OSMIUM = "item_ingot_osmium";
    String ITEM_INGOT_LEAD = "item_ingot_lead";

    void register(IForgeRegistry<T> registry);

    void init();

}
