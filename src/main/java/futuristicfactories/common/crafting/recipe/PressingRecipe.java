package futuristicfactories.common.crafting.recipe;

import com.google.gson.JsonObject;
import futuristicfactories.common.registry.FFRecipes;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.SingleItemRecipe;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;

public class PressingRecipe extends SingleItemRecipe {

    public PressingRecipe(ResourceLocation recipeId, Ingredient ingredient, ItemStack result) {
        super(FFRecipes.Types.PRESSING, FFRecipes.Serializers.PRESSING.get(), recipeId, "", ingredient, result);
    }

    @Override
    public boolean matches(IInventory inv, World worldIn) {
        return this.ingredient.test(inv.getStackInSlot(0));
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<PressingRecipe> {

        @Override
        public PressingRecipe read(ResourceLocation recipeId, JsonObject json) {
            Ingredient ingredient = Ingredient.deserialize(json.get("ingredient"));
            ResourceLocation itemId = new ResourceLocation(JSONUtils.getString(json, "result"));
            int count = JSONUtils.getInt(json, "count", 1);

            ItemStack result = new ItemStack(ForgeRegistries.ITEMS.getValue(itemId), count);
            return new PressingRecipe(recipeId, ingredient, result);
        }

        @Nullable
        @Override
        public PressingRecipe read(ResourceLocation recipeId, PacketBuffer buffer) {
            Ingredient ingredient = Ingredient.read(buffer);
            ItemStack result = buffer.readItemStack();
            return new PressingRecipe(recipeId, ingredient, result);
        }

        @Override
        public void write(PacketBuffer buffer, PressingRecipe recipe) {
            recipe.ingredient.write(buffer);
            buffer.writeItemStack(recipe.result);
        }
    }

}
