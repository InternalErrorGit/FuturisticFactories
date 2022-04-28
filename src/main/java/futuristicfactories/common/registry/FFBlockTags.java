package futuristicfactories.common.registry;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockTags {

    public static final ITag.INamedTag<Block> ORES_ALUMINUM = mod("ores/aluminum");
    public static final ITag.INamedTag<Block> ORES_COPPER = mod("ores/copper");
    public static final ITag.INamedTag<Block> ORES_LEAD = mod("ores/lead");
    public static final ITag.INamedTag<Block> ORES_NICKEL = mod("ores/nickel");
    public static final ITag.INamedTag<Block> ORES_SILVER = mod("ores/silver");
    public static final ITag.INamedTag<Block> ORES_TIN = mod("ores/tin");

    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_ALUMINUM = forge("storage_blocks/aluminum");
    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_COPPER = forge("storage_blocks/copper");
    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_LEAD = forge("storage_blocks/lead");
    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NICKEL = forge("storage_blocks/nickel");
    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_SILVER = forge("storage_blocks/silver");
    public static final ITag.INamedTag<Block> STORAGE_BLOCKS_TIN = forge("storage_blocks/tin");

    private static ITag.INamedTag<Block> forge(String path) {
        return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
    }

    private static ITag.INamedTag<Block> mod(String path) {
        return BlockTags.makeWrapperTag(new ResourceLocation(MOD_ID, path).toString());

    }
}
