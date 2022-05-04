package futuristicfactories.common.data.model;

import futuristicfactories.common.registry.IFFRegistryNames;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFItemModelProvider extends ItemModelProvider implements IFFRegistryNames {


    public FFItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(REGISTRY_NAME_ALUMINUM_ORE, modBlockLoc(REGISTRY_NAME_ALUMINUM_ORE));
        withExistingParent(REGISTRY_NAME_COPPER_ORE, modBlockLoc(REGISTRY_NAME_COPPER_ORE));
        withExistingParent(REGISTRY_NAME_LEAD_ORE, modBlockLoc(REGISTRY_NAME_LEAD_ORE));
        withExistingParent(REGISTRY_NAME_NICKEL_ORE, modBlockLoc(REGISTRY_NAME_NICKEL_ORE));
        withExistingParent(REGISTRY_NAME_SILVER_ORE, modBlockLoc(REGISTRY_NAME_SILVER_ORE));
        withExistingParent(REGISTRY_NAME_TIN_ORE, modBlockLoc(REGISTRY_NAME_TIN_ORE));

        withExistingParent(REGISTRY_NAME_ALUMINUM_BLOCK, modBlockLoc(REGISTRY_NAME_ALUMINUM_BLOCK));
        withExistingParent(REGISTRY_NAME_COPPER_BLOCK, modBlockLoc(REGISTRY_NAME_COPPER_BLOCK));
        withExistingParent(REGISTRY_NAME_LEAD_BLOCK, modBlockLoc(REGISTRY_NAME_LEAD_BLOCK));
        withExistingParent(REGISTRY_NAME_NICKEL_BLOCK, modBlockLoc(REGISTRY_NAME_NICKEL_BLOCK));
        withExistingParent(REGISTRY_NAME_SILVER_BLOCK, modBlockLoc(REGISTRY_NAME_SILVER_BLOCK));
        withExistingParent(REGISTRY_NAME_TIN_BLOCK, modBlockLoc(REGISTRY_NAME_TIN_BLOCK));

        withExistingParent(REGISTRY_NAME_CRUSHING_MACHINE, modBlockLoc(REGISTRY_NAME_CRUSHING_MACHINE));
        withExistingParent(REGISTRY_NAME_PULVERIZING_MACHINE, modBlockLoc(REGISTRY_NAME_PULVERIZING_MACHINE));
        withExistingParent(REGISTRY_NAME_CRYSTALLIZING_MACHINE, modBlockLoc(REGISTRY_NAME_CRYSTALLIZING_MACHINE));
        withExistingParent(REGISTRY_NAME_COMBINING_MACHINE, modBlockLoc(REGISTRY_NAME_COMBINING_MACHINE));
        withExistingParent(REGISTRY_NAME_SMELTING_MACHINE, modBlockLoc(REGISTRY_NAME_SMELTING_MACHINE));
        withExistingParent(REGISTRY_NAME_WASHING_MACHINE, modBlockLoc(REGISTRY_NAME_WASHING_MACHINE));

        materialItems(REGISTRY_NAME_ALUMINUM_MATERIAL);
        materialItems(REGISTRY_NAME_COPPER_MATERIAL);
        materialItems(REGISTRY_NAME_LEAD_MATERIAL);
        materialItems(REGISTRY_NAME_NICKEL_MATERIAL);
        materialItems(REGISTRY_NAME_SILVER_MATERIAL);
        materialItems(REGISTRY_NAME_TIN_MATERIAL);


    }

    private void materialItems(String registryNameMaterial) {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, REGISTRY_FOLDER_INGOT + registryNameMaterial + REGISTRY_NAME_INGOT);
        builder(itemGenerated, REGISTRY_FOLDER_NUGGET + registryNameMaterial + REGISTRY_NAME_NUGGET);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_CHUNK + registryNameMaterial + REGISTRY_NAME_ORE_CHUNK);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_CLUMP + registryNameMaterial + REGISTRY_NAME_ORE_CLUMP);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_CRYSTAL + registryNameMaterial + REGISTRY_NAME_ORE_CRYSTAL);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_TINY_CRYSTAL + registryNameMaterial + REGISTRY_NAME_ORE_TINY_CRYSTAL);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_DUST + registryNameMaterial + REGISTRY_NAME_ORE_DUST);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_DIRTY_DUST + registryNameMaterial + REGISTRY_NAME_ORE_DIRTY_DUST);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_FRAGMENT + registryNameMaterial + REGISTRY_NAME_ORE_FRAGMENT);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_PIECE + registryNameMaterial + REGISTRY_NAME_ORE_PIECE);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_PILE + registryNameMaterial + REGISTRY_NAME_ORE_PILE);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_RESIDUAL + registryNameMaterial + REGISTRY_NAME_ORE_RESIDUAL);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_SAND + registryNameMaterial + REGISTRY_NAME_ORE_SAND);
        builder(itemGenerated, REGISTRY_FOLDER_ORE_SHARD + registryNameMaterial + REGISTRY_NAME_ORE_SHARD);

    }

    private ResourceLocation modBlockLoc(String block) {
        return modLoc("block/" + block);
    }

    private void builder(ModelFile itemGenerated, String itemPathAndTexture) {
        getBuilder(itemPathAndTexture).parent(itemGenerated).texture("layer0", "item/" + itemPathAndTexture);
    }
}
