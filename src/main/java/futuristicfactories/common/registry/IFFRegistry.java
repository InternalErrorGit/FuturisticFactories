package futuristicfactories.common.registry;

import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public interface IFFRegistry<T extends IForgeRegistryEntry<T>> {

    String BLOCK_ORE_COPPER = "block_ore_copper";
    String BLOCK_ORE_LEAD = "block_ore_lead";
    String BLOCK_ORE_NICKEL = "block_ore_nickel";
    String BLOCK_ORE_SILVER = "block_ore_silver";
    String BLOCK_ORE_TIN = "block_ore_tin";
    String BLOCK_COPPER = "block_copper";
    String BLOCK_LEAD = "block_lead";
    String BLOCK_NICKEL = "block_nickel";
    String BLOCK_SILVER = "block_silver";
    String BLOCK_TIN = "block_tin";

    String ITEM_BLOCK_ORE_COPPER = "item_block_ore_copper";
    String ITEM_BLOCK_ORE_LEAD = "item_block_ore_lead";
    String ITEM_BLOCK_ORE_NICKEL = "item_block_ore_nickel";
    String ITEM_BLOCK_ORE_SILVER = "item_block_ore_silver";
    String ITEM_BLOCK_ORE_TIN = "item_block_ore_tin";
    String ITEM_BLOCK_COPPER = "item_block_copper";
    String ITEM_BLOCK_LEAD = "item_block_lead";
    String ITEM_BLOCK_NICKEL = "item_block_nickel";
    String ITEM_BLOCK_SILVER = "item_block_silver";
    String ITEM_BLOCK_TIN = "item_block_tin";
    String ITEM_NUGGET_COPPER = "item_nugget_copper";
    String ITEM_NUGGET_LEAD = "item_nugget_lead";
    String ITEM_NUGGET_NICKEL = "item_nugget_nickel";
    String ITEM_NUGGET_SILVER = "item_nugget_silver";
    String ITEM_NUGGET_TIN = "item_nugget_tin";
    String ITEM_INGOT_COPPER = "item_ingot_copper";
    String ITEM_INGOT_LEAD = "item_ingot_lead";
    String ITEM_INGOT_NICKEL = "item_ingot_nickel";
    String ITEM_INGOT_SILVER = "item_ingot_silver";
    String ITEM_INGOT_TIN = "item_ingot_tin";

    void register(IForgeRegistry<T> registry);

    void init();

}
