package futuristicfactories.common.generation;

import futuristicfactories.common.registration.FFBlocks;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.ArrayList;

public class WorldGeneration {

    private static final ArrayList<ConfiguredFeature<?, ?>> ores;

    static {
        ores = new ArrayList<>();

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOreAluminum.getDefaultState(),
                                5)
                ).range(64).square().count(5)
        );

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOreCopper.getDefaultState(),
                                5)
                ).range(64).square().count(5)
        );

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOrLead.getDefaultState(),
                                5)
                ).range(64).square().count(5)
        );

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOreNickel.getDefaultState(),
                                5)
                ).range(64).square().count(5)
        );

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOreSilver.getDefaultState(),
                                5)
                ).range(64).square().count(5)
        );

        ores.add(Feature.ORE.withConfiguration(
                        new OreFeatureConfig(
                                OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                                FFBlocks.blockOreTin.getDefaultState(),
                                8)
                ).range(64).square().count(6)
        );


    }


    public static void generateOre(final BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();

        ores.forEach(ore -> {
            generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        });


    }


}
