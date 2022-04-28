package futuristicfactories.common.data.tag;

import futuristicfactories.common.registry.FFBlockRegistry;
import futuristicfactories.common.registry.FFBlockTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockTagProvider extends BlockTagsProvider {

    public FFBlockTagProvider(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {

        getOrCreateBuilder(FFBlockTags.ORES_ALUMINUM).add(FFBlockRegistry.ALUMINUM_ORE.get());
        getOrCreateBuilder(FFBlockTags.ORES_COPPER).add(FFBlockRegistry.COPPER_ORE.get());
        getOrCreateBuilder(FFBlockTags.ORES_LEAD).add(FFBlockRegistry.LEAD_ORE.get());
        getOrCreateBuilder(FFBlockTags.ORES_NICKEL).add(FFBlockRegistry.NICKEL_ORE.get());
        getOrCreateBuilder(FFBlockTags.ORES_SILVER).add(FFBlockRegistry.SILVER_ORE.get());
        getOrCreateBuilder(FFBlockTags.ORES_TIN).add(FFBlockRegistry.TIN_ORE.get());

        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_ALUMINUM);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_COPPER);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_LEAD);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_NICKEL);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_SILVER);
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(FFBlockTags.ORES_TIN);

        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_ALUMINUM).add(FFBlockRegistry.ALUMINUM_BLOCK.get());
        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_COPPER).add(FFBlockRegistry.COPPER_BLOCK.get());
        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_LEAD).add(FFBlockRegistry.LEAD_BLOCK.get());
        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_NICKEL).add(FFBlockRegistry.NICKEL_BLOCK.get());
        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_SILVER).add(FFBlockRegistry.SILVER_BLOCK.get());
        getOrCreateBuilder(FFBlockTags.STORAGE_BLOCKS_TIN).add(FFBlockRegistry.TIN_BLOCK.get());

        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_ALUMINUM);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_COPPER);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_LEAD);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_NICKEL);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_SILVER);
        getOrCreateBuilder(Tags.Blocks.STORAGE_BLOCKS).addTag(FFBlockTags.STORAGE_BLOCKS_TIN);

    }
}
