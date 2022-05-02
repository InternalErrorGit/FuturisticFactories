package futuristicfactories.common.data.recipe;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.registry.FFBlockRegistry;
import futuristicfactories.common.registry.FFItemsRegistry;
import futuristicfactories.common.registry.FFRecipes;
import futuristicfactories.common.registry.IFFRegistryNames;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SingleItemRecipe;

import java.util.function.Consumer;

public class FFRecipeProvider extends RecipeProvider implements IFFRegistryNames {
    public FFRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {

        addMetalRecipes(FFBlockRegistry.ALUMINUM_ORE.get(), FFBlockRegistry.ALUMINUM_BLOCK.get(), FFItemsRegistry.ALUMINUM_INGOT.get(), FFItemsRegistry.ALUMINUM_NUGGET.get(), REGISTRY_NAME_ALUMINUM_INGOT, consumer);
        addMetalRecipes(FFBlockRegistry.COPPER_ORE.get(), FFBlockRegistry.COPPER_BLOCK.get(), FFItemsRegistry.COPPER_INGOT.get(), FFItemsRegistry.COPPER_NUGGET.get(), REGISTRY_NAME_COPPER_INGOT, consumer);
        addMetalRecipes(FFBlockRegistry.LEAD_ORE.get(), FFBlockRegistry.LEAD_BLOCK.get(), FFItemsRegistry.LEAD_INGOT.get(), FFItemsRegistry.LEAD_NUGGET.get(), REGISTRY_NAME_LEAD_INGOT, consumer);
        addMetalRecipes(FFBlockRegistry.NICKEL_ORE.get(), FFBlockRegistry.NICKEL_BLOCK.get(), FFItemsRegistry.NICKEL_INGOT.get(), FFItemsRegistry.NICKEL_NUGGET.get(), REGISTRY_NAME_NICKEL_INGOT, consumer);
        addMetalRecipes(FFBlockRegistry.SILVER_ORE.get(), FFBlockRegistry.SILVER_BLOCK.get(), FFItemsRegistry.SILVER_INGOT.get(), FFItemsRegistry.SILVER_NUGGET.get(), REGISTRY_NAME_SILVER_INGOT, consumer);
        addMetalRecipes(FFBlockRegistry.TIN_ORE.get(), FFBlockRegistry.TIN_BLOCK.get(), FFItemsRegistry.TIN_INGOT.get(), FFItemsRegistry.TIN_NUGGET.get(), REGISTRY_NAME_TIN_INGOT, consumer);

    }

    private void addMetalRecipes(Block ore, Block block, Item ingot, Item nugget, String ingotRegistryName, Consumer<IFinishedRecipe> consumer) {

        ShapelessRecipeBuilder.shapelessRecipe(ingot, 9).addIngredient(block).addCriterion("has_item", hasItem(ingot)).build(consumer);

        ShapedRecipeBuilder.shapedRecipe(block).key('i', ingot).patternLine("iii").patternLine("iii").patternLine("iii").addCriterion("has_item", hasItem(ingot)).build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ore), ingot, 0.7f, 200).addCriterion("has_item", hasItem(ore)).build(consumer, FuturisticFactories.location(ingotRegistryName + "_smelting"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ore), ingot, 0.7f, 100).addCriterion("has_item", hasItem(ore)).build(consumer, FuturisticFactories.location(ingotRegistryName + "_blasting"));


    }


}
