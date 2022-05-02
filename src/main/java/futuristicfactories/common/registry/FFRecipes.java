package futuristicfactories.common.registry;

import futuristicfactories.common.crafting.recipe.PressingRecipe;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.SingleItemRecipe;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.RegistryObject;

import javax.naming.PartialResultException;

import static futuristicfactories.FuturisticFactories.MOD_ID;
import static futuristicfactories.common.registry.FFRecipes.Serializers.PRESSING;

public class FFRecipes implements IFFRegistryNames {

    public static class Types {
        public static final IRecipeType<PressingRecipe> PRESSING = IRecipeType.register(MOD_ID + "pressing");
    }

    public static class Serializers {
        public static final RegistryObject<IRecipeSerializer<PressingRecipe>> PRESSING = FFRegistration.RECIPE_SERIALIZERS.register("pressing", PressingRecipe.Serializer::new);

    }


    public static void register() {

    }




}
