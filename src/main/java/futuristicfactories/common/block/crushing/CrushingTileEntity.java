package futuristicfactories.common.block.crushing;

import futuristicfactories.common.block.machine.MachineTileEntity;
import futuristicfactories.common.block.metalpress.MetalPressContainer;
import futuristicfactories.common.crafting.recipe.PressingRecipe;
import futuristicfactories.common.registry.FFTileEntityRegistry;
import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CrushingTileEntity extends MachineTileEntity<PressingRecipe> {
    public CrushingTileEntity() {
        super(10, FFTileEntityRegistry.CRUSHING_MACHINE.get());
    }

    @Override
    protected void setWorkTime() {
        WORK_TIME = 20 * 3;
    }

    @Override
    protected ITextComponent getTranslation() {
        return new TranslationTextComponent("");
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
        return new CrushingContainer(id, player, this, this.fields);
    }
}
