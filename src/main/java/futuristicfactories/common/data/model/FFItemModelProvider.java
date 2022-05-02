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

        withExistingParent(REGISTRY_NAME_METAL_PRESS, modBlockLoc(REGISTRY_NAME_METAL_PRESS));

        materialItems(REGISTRY_NAME_ALUMINUM_MATERIAL);
        materialItems(REGISTRY_NAME_COPPER_MATERIAL);
        materialItems(REGISTRY_NAME_LEAD_MATERIAL);
        materialItems(REGISTRY_NAME_NICKEL_MATERIAL);
        materialItems(REGISTRY_NAME_SILVER_MATERIAL);
        materialItems(REGISTRY_NAME_TIN_MATERIAL);


    }

    private void materialItems(String registryNameMaterial) {
        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_INGOT);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_NUGGET);

        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_CHUNK);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_CLUMP);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_CRYSTAL);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_TINY_CRYSTAL);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_DUST);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_DIRTY_DUST);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_FRAGMENT);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_PIECE);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_PILE);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_RESIDUAL);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_SAND);
        builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_SHARD);

     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_ORE_RESIDUAL);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_SWORD);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_AXE);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_PICKAXE);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_SHOVEL);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_HOE);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_HELMET);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_CHESTPLATE);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_PANTS);
     //   builder(itemGenerated, registryNameMaterial + REGISTRY_NAME_BOOTS);
    }

    private ResourceLocation modBlockLoc(String block) {
        return modLoc("block/" + block);
    }

    private void builder(ModelFile itemGenerated, String itemPathAndTexture) {
        getBuilder(itemPathAndTexture).parent(itemGenerated).texture("layer0", "item/" + itemPathAndTexture);
    }
}
