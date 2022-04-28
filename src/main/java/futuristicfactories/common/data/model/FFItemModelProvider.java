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

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, REGISTRY_NAME_ALUMINUM_INGOT);
        builder(itemGenerated, REGISTRY_NAME_COPPER_INGOT);
        builder(itemGenerated, REGISTRY_NAME_LEAD_INGOT);
        builder(itemGenerated, REGISTRY_NAME_NICKEL_INGOT);
        builder(itemGenerated, REGISTRY_NAME_SILVER_INGOT);
        builder(itemGenerated, REGISTRY_NAME_TIN_INGOT);

        builder(itemGenerated, REGISTRY_NAME_ALUMINUM_NUGGET);
        builder(itemGenerated, REGISTRY_NAME_COPPER_NUGGET);
        builder(itemGenerated, REGISTRY_NAME_LEAD_NUGGET);
        builder(itemGenerated, REGISTRY_NAME_NICKEL_NUGGET);
        builder(itemGenerated, REGISTRY_NAME_SILVER_NUGGET);
        builder(itemGenerated, REGISTRY_NAME_TIN_NUGGET);
    }

    private ResourceLocation modBlockLoc(String block) {
        return modLoc("block/" + block);
    }

    private void builder(ModelFile itemGenerated, String itemPathAndTexture) {
        getBuilder(itemPathAndTexture).parent(itemGenerated).texture("layer0", "item/" + itemPathAndTexture);
    }
}
