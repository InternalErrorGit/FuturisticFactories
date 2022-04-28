package futuristicfactories.common.data;

import futuristicfactories.common.data.loot.FFLootTableProvider;
import futuristicfactories.common.data.model.FFItemModelProvider;
import futuristicfactories.common.data.recipe.FFRecipeProvider;
import futuristicfactories.common.data.state.FFBlockStateProvider;
import futuristicfactories.common.data.tag.FFBlockTagProvider;
import futuristicfactories.common.data.tag.FFItemTagProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

import static futuristicfactories.FuturisticFactories.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class FFDataGeneratos {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(new FFBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(new FFItemModelProvider(generator, existingFileHelper));
        FFBlockTagProvider blockTagProvider = new FFBlockTagProvider(generator, existingFileHelper);
        generator.addProvider(blockTagProvider);
        generator.addProvider(new FFItemTagProvider(generator, blockTagProvider, existingFileHelper));

        generator.addProvider(new FFLootTableProvider(generator));
        generator.addProvider(new FFRecipeProvider(generator));

    }


}
