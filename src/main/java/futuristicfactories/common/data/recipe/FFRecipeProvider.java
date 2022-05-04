package futuristicfactories.common.data.recipe;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.registry.IFFRegistryNames;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.block.Block;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Consumer;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class FFRecipeProvider extends RecipeProvider implements IFFRegistryNames {
    public FFRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        //  addMaterialRecipes(consumer, REGISTRY_NAME_ALUMINUM_INGOT, true, FFBlockRegistry.ALUMINUM_ORE.get(), FFBlockRegistry.ALUMINUM_BLOCK.get(), FFItemRegistry.ALUMINUM_INGOT.get(), FFItemRegistry.ALUMINUM_NUGGET.get(), FFItemRegistry.ALUMINUM_SWORD.get(), FFItemRegistry.ALUMINUM_AXE.get(), FFItemRegistry.ALUMINUM_PICKAXE.get(), FFItemRegistry.ALUMINUM_SHOVEL.get(), FFItemRegistry.ALUMINUM_HOE.get(), FFItemRegistry.ALUMINUM_HELMET.get(), FFItemRegistry.ALUMINUM_CHESTPLATE.get(), FFItemRegistry.ALUMINUM_PANTS.get(), FFItemRegistry.ALUMINUM_BOOTS.get());
        //  addMaterialRecipes(consumer, REGISTRY_NAME_COPPER_INGOT, true, FFBlockRegistry.COPPER_ORE.get(), FFBlockRegistry.COPPER_BLOCK.get(), FFItemRegistry.COPPER_INGOT.get(), FFItemRegistry.COPPER_NUGGET.get(), FFItemRegistry.COPPER_SWORD.get(), FFItemRegistry.COPPER_AXE.get(), FFItemRegistry.COPPER_PICKAXE.get(), FFItemRegistry.COPPER_SHOVEL.get(), FFItemRegistry.COPPER_HOE.get(), FFItemRegistry.COPPER_HELMET.get(), FFItemRegistry.COPPER_CHESTPLATE.get(), FFItemRegistry.COPPER_PANTS.get(), FFItemRegistry.COPPER_BOOTS.get());
        //  addMaterialRecipes(consumer, REGISTRY_NAME_LEAD_INGOT, true, FFBlockRegistry.LEAD_ORE.get(), FFBlockRegistry.LEAD_BLOCK.get(), FFItemRegistry.LEAD_INGOT.get(), FFItemRegistry.LEAD_NUGGET.get(), FFItemRegistry.LEAD_SWORD.get(), FFItemRegistry.LEAD_AXE.get(), FFItemRegistry.LEAD_PICKAXE.get(), FFItemRegistry.LEAD_SHOVEL.get(), FFItemRegistry.LEAD_HOE.get(), FFItemRegistry.LEAD_HELMET.get(), FFItemRegistry.LEAD_CHESTPLATE.get(), FFItemRegistry.LEAD_PANTS.get(), FFItemRegistry.LEAD_BOOTS.get());
        //  addMaterialRecipes(consumer, REGISTRY_NAME_NICKEL_INGOT, true, FFBlockRegistry.NICKEL_ORE.get(), FFBlockRegistry.NICKEL_BLOCK.get(), FFItemRegistry.NICKEL_INGOT.get(), FFItemRegistry.NICKEL_NUGGET.get(), FFItemRegistry.NICKEL_SWORD.get(), FFItemRegistry.NICKEL_AXE.get(), FFItemRegistry.NICKEL_PICKAXE.get(), FFItemRegistry.NICKEL_SHOVEL.get(), FFItemRegistry.NICKEL_HOE.get(), FFItemRegistry.NICKEL_HELMET.get(), FFItemRegistry.NICKEL_CHESTPLATE.get(), FFItemRegistry.NICKEL_PANTS.get(), FFItemRegistry.NICKEL_BOOTS.get());
        //  addMaterialRecipes(consumer, REGISTRY_NAME_SILVER_INGOT, true, FFBlockRegistry.SILVER_ORE.get(), FFBlockRegistry.SILVER_BLOCK.get(), FFItemRegistry.SILVER_INGOT.get(), FFItemRegistry.SILVER_NUGGET.get(), FFItemRegistry.SILVER_SWORD.get(), FFItemRegistry.SILVER_AXE.get(), FFItemRegistry.SILVER_PICKAXE.get(), FFItemRegistry.SILVER_SHOVEL.get(), FFItemRegistry.SILVER_HOE.get(), FFItemRegistry.SILVER_HELMET.get(), FFItemRegistry.SILVER_CHESTPLATE.get(), FFItemRegistry.SILVER_PANTS.get(), FFItemRegistry.SILVER_BOOTS.get());
        //  addMaterialRecipes(consumer, REGISTRY_NAME_TIN_INGOT, true, FFBlockRegistry.TIN_ORE.get(), FFBlockRegistry.TIN_BLOCK.get(), FFItemRegistry.TIN_INGOT.get(), FFItemRegistry.TIN_NUGGET.get(), FFItemRegistry.TIN_SWORD.get(), FFItemRegistry.TIN_AXE.get(), FFItemRegistry.TIN_PICKAXE.get(), FFItemRegistry.TIN_SHOVEL.get(), FFItemRegistry.TIN_HOE.get(), FFItemRegistry.TIN_HELMET.get(), FFItemRegistry.TIN_CHESTPLATE.get(), FFItemRegistry.TIN_PANTS.get(), FFItemRegistry.TIN_BOOTS.get());
    }

    private void addArmorRecipes(Consumer<IFinishedRecipe> consumer, Item ingot, Item helmet, Item chestplate, Item pants, Item boots) {
        ShapedRecipeBuilder
                .shapedRecipe(helmet)
                .key('i', ingot)
                .patternLine("iii")
                .patternLine("i i")
                .patternLine("   ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(chestplate)
                .key('i', ingot)
                .patternLine("i i")
                .patternLine("iii")
                .patternLine("iii")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(pants)
                .key('i', ingot)
                .patternLine("iii")
                .patternLine("i i")
                .patternLine("i i")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(boots)
                .key('i', ingot)
                .patternLine("   ")
                .patternLine("i i")
                .patternLine("i i")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
    }

    private void addToolRecipes(Consumer<IFinishedRecipe> consumer, Item ingot, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe) {

        ShapedRecipeBuilder
                .shapedRecipe(sword)
                .key('i', ingot)
                .key('s', Items.STICK)
                .patternLine(" i ")
                .patternLine(" i ")
                .patternLine(" s ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(axe)
                .key('i', ingot)
                .key('s', Items.STICK)
                .patternLine("ii ")
                .patternLine("is ")
                .patternLine(" s ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(pickaxe)
                .key('i', ingot)
                .key('s', Items.STICK)
                .patternLine("iii")
                .patternLine(" s ")
                .patternLine(" s ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(shovel)
                .key('i', ingot)
                .key('s', Items.STICK)
                .patternLine(" i ")
                .patternLine(" s ")
                .patternLine(" s ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);
        ShapedRecipeBuilder
                .shapedRecipe(hoe)
                .key('i', ingot)
                .key('s', Items.STICK)
                .patternLine("ii ")
                .patternLine(" s ")
                .patternLine(" s ")
                .addCriterion("has_item", hasItem(ingot))
                .build(consumer);


    }

    private void addMaterialRecipes(Consumer<IFinishedRecipe> consumer, String ingotRegistryName, boolean hasOre, Block ore, Block block, Item ingot, Item nugget, Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item pants, Item boots) {

        if (hasOre) {
            CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ore), ingot, 0.7f, 200).addCriterion("has_item", hasItem(ore)).build(consumer, FuturisticFactories.location(ingotRegistryName + "_smelting"));
            CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ore), ingot, 0.7f, 100).addCriterion("has_item", hasItem(ore)).build(consumer, FuturisticFactories.location(ingotRegistryName + "_blasting"));
        }

        ShapedRecipeBuilder.shapedRecipe(block).key('i', ingot).patternLine("iii").patternLine("iii").patternLine("iii").addCriterion("has_item", hasItem(ingot)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(nugget, 9).addIngredient(ingot).addCriterion("has_item", hasItem(ingot)).build(consumer);
        ShapedRecipeBuilder.shapedRecipe(ingot).key('n', nugget).patternLine("nnn").patternLine("nnn").patternLine("nnn").addCriterion("has_item", hasItem(ingot)).build(consumer);
        ShapelessRecipeBuilder.shapelessRecipe(ingot, 9).addIngredient(block).addCriterion("has_item", hasItem(ingot)).build(consumer);

        addArmorRecipes(consumer, ingot, helmet, chestplate, pants, boots);
        addToolRecipes(consumer, ingot, sword, axe, pickaxe, shovel, hoe);


    }

}
