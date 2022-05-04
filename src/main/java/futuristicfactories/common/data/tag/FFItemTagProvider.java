package futuristicfactories.common.data.tag;

import futuristicfactories.common.registry.FFBlockTags;
import futuristicfactories.common.registry.FFItemRegistry;
import futuristicfactories.common.registry.FFItemTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

import static futuristicfactories.FuturisticFactories.MOD_ID;


public class FFItemTagProvider extends ItemTagsProvider {
    public FFItemTagProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {

        copy(FFBlockTags.ORES_ALUMINUM, FFItemTags.ORES_ALUMINUM);
        copy(FFBlockTags.ORES_COPPER, FFItemTags.ORES_COPPER);
        copy(FFBlockTags.ORES_LEAD, FFItemTags.ORES_LEAD);
        copy(FFBlockTags.ORES_NICKEL, FFItemTags.ORES_NICKEL);
        copy(FFBlockTags.ORES_SILVER, FFItemTags.ORES_SILVER);
        copy(FFBlockTags.ORES_TIN, FFItemTags.ORES_TIN);

        copy(Tags.Blocks.ORES, Tags.Items.ORES);

        copy(FFBlockTags.STORAGE_BLOCKS_ALUMINUM, FFItemTags.STORAGE_BLOCKS_ALUMINUM);
        copy(FFBlockTags.STORAGE_BLOCKS_COPPER, FFItemTags.STORAGE_BLOCKS_COPPER);
        copy(FFBlockTags.STORAGE_BLOCKS_LEAD, FFItemTags.STORAGE_BLOCKS_LEAD);
        copy(FFBlockTags.STORAGE_BLOCKS_NICKEL, FFItemTags.STORAGE_BLOCKS_NICKEL);
        copy(FFBlockTags.STORAGE_BLOCKS_SILVER, FFItemTags.STORAGE_BLOCKS_SILVER);
        copy(FFBlockTags.STORAGE_BLOCKS_TIN, FFItemTags.STORAGE_BLOCKS_TIN);

        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        getOrCreateBuilder(FFItemTags.INGOTS_ALUMINUM).add(FFItemRegistry.ALUMINUM_INGOT.get());
        getOrCreateBuilder(FFItemTags.INGOTS_COPPER).add(FFItemRegistry.COPPER_INGOT.get());
        getOrCreateBuilder(FFItemTags.INGOTS_LEAD).add(FFItemRegistry.LEAD_INGOT.get());
        getOrCreateBuilder(FFItemTags.INGOTS_NICKEL).add(FFItemRegistry.NICKEL_INGOT.get());
        getOrCreateBuilder(FFItemTags.INGOTS_SILVER).add(FFItemRegistry.SILVER_INGOT.get());
        getOrCreateBuilder(FFItemTags.INGOTS_TIN).add(FFItemRegistry.TIN_INGOT.get());

        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_ALUMINUM);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_COPPER);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_LEAD);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_NICKEL);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_SILVER);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(FFItemTags.INGOTS_TIN);

        getOrCreateBuilder(FFItemTags.NUGGETS_ALUMINUM).add(FFItemRegistry.ALUMINUM_NUGGET.get());
        getOrCreateBuilder(FFItemTags.NUGGETS_COPPER).add(FFItemRegistry.COPPER_NUGGET.get());
        getOrCreateBuilder(FFItemTags.NUGGETS_LEAD).add(FFItemRegistry.LEAD_NUGGET.get());
        getOrCreateBuilder(FFItemTags.NUGGETS_NICKEL).add(FFItemRegistry.NICKEL_NUGGET.get());
        getOrCreateBuilder(FFItemTags.NUGGETS_SILVER).add(FFItemRegistry.SILVER_NUGGET.get());
        getOrCreateBuilder(FFItemTags.NUGGETS_TIN).add(FFItemRegistry.TIN_NUGGET.get());

        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_ALUMINUM);
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_COPPER);
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_LEAD);
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_NICKEL);
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_SILVER);
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(FFItemTags.NUGGETS_TIN);
    }
}
