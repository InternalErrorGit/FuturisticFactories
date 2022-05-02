package futuristicfactories.common.registry;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFItemTags {

    public static final ITag.INamedTag<Item> ORES_ALUMINUM = mod("ores/aluminum");
    public static final ITag.INamedTag<Item> ORES_COPPER = mod("ores/copper");
    public static final ITag.INamedTag<Item> ORES_LEAD = mod("ores/lead");
    public static final ITag.INamedTag<Item> ORES_NICKEL = mod("ores/nickel");
    public static final ITag.INamedTag<Item> ORES_SILVER = mod("ores/silver");
    public static final ITag.INamedTag<Item> ORES_TIN = mod("ores/tin");

    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_ALUMINUM = forge("storage_blocks/aluminum");
    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_COPPER = forge("storage_blocks/copper");
    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_LEAD = forge("storage_blocks/lead");
    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_NICKEL = forge("storage_blocks/nickel");
    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");
    public static final ITag.INamedTag<Item> STORAGE_BLOCKS_TIN = forge("storage_blocks/tin");

    public static final ITag.INamedTag<Item> INGOTS_ALUMINUM = forge("ingots/aluminum");
    public static final ITag.INamedTag<Item> INGOTS_COPPER = forge("ingots/copper");
    public static final ITag.INamedTag<Item> INGOTS_LEAD = forge("ingots/lead");
    public static final ITag.INamedTag<Item> INGOTS_NICKEL = forge("ingots/nickel");
    public static final ITag.INamedTag<Item> INGOTS_SILVER = forge("ingots/silver");
    public static final ITag.INamedTag<Item> INGOTS_TIN = forge("ingots/tin");

    public static final ITag.INamedTag<Item> NUGGETS_ALUMINUM = forge("nuggets/aluminum");
    public static final ITag.INamedTag<Item> NUGGETS_COPPER = forge("nuggets/copper");
    public static final ITag.INamedTag<Item> NUGGETS_LEAD = forge("nuggets/lead");
    public static final ITag.INamedTag<Item> NUGGETS_NICKEL = forge("nuggets/nickel");
    public static final ITag.INamedTag<Item> NUGGETS_SILVER = forge("nuggets/silver");
    public static final ITag.INamedTag<Item> NUGGETS_TIN = forge("nuggets/tin");

    private static ITag.INamedTag<Item> forge(String path) {
        return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
    }

    private static ITag.INamedTag<Item> mod(String path) {
        return ItemTags.makeWrapperTag(new ResourceLocation(MOD_ID, path).toString());

    }
}
