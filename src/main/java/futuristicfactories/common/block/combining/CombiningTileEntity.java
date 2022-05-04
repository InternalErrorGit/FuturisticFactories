package futuristicfactories.common.block.combining;

import futuristicfactories.common.block.machine.MachineTileEntity;
import futuristicfactories.common.crafting.recipe.PressingRecipe;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

public class CombiningTileEntity extends MachineTileEntity<PressingRecipe> {
    @Override
    protected void setWorkTime() {

    }

    @Override
    protected ITextComponent getTranslation() {
        return null;
    }

    @Override
    protected void doWork(PressingRecipe recipe) {

    }

    @Override
    protected void stopWork() {

    }

    @Override
    protected void finishWork(ItemStack current, ItemStack output) {

    }

    @Override
    protected Container createMenu(int id, PlayerInventory player) {
        return null;
    }
}
