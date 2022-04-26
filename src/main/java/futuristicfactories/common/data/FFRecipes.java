package futuristicfactories.common.data;

import futuristicfactories.common.registration.FFBlocks;
import futuristicfactories.common.registration.FFItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;

import java.util.function.Consumer;

import static net.minecraft.data.ShapedRecipeBuilder.shapedRecipe;

public class FFRecipes extends RecipeProvider {
    public FFRecipes(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        shapedRecipe(FFBlocks.blockCopper)
                .patternLine("iii")
                .patternLine("iii")
                .patternLine("iii")
                .key('i', FFItems.itemIngotCopper)
                .build(consumer);


    }
}
