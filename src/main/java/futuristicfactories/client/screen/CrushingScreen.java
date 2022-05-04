package futuristicfactories.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.crushing.CrushingContainer;
import futuristicfactories.common.block.metalpress.MetalPressContainer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CrushingScreen extends MachineScreen<CrushingContainer> {

    public CrushingScreen(CrushingContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
        ySize = 202;
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/crushing_machine.png");
    }

    @Override
    protected int getPlayerInventoryYOffset() {
        return 36;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
        super.drawGuiContainerBackgroundLayer(matrixStack, partialTicks, x, y);
        assert minecraft != null;

        minecraft.getTextureManager().bindTexture(getTexture());
        int posX = (this.width - this.xSize) / 2;
        int posY = (this.height - this.ySize) / 2;
        blit(matrixStack, posX, posY - 18, 0, 0, this.xSize, this.ySize);
        RenderSystem.disableBlend();


        //blit(matrixStack, posX + 79, posY + 35, 176, 14, container.getProgressArrowScale() + 1, 16);

    }
}
