package futuristicfactories.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.metalpress.MetalPressContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class MetalPressScreen extends ContainerScreen<MetalPressContainer> {

    public static final ResourceLocation TEXTURE = FuturisticFactories.location("textures/gui/metal_press.png");

    public MetalPressScreen(MetalPressContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(MatrixStack matrixStack, int x, int y, float partialTicks) {
        renderBackground(matrixStack);
        super.render(matrixStack, x, y, partialTicks);
        renderHoveredTooltip(matrixStack, x, y);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
        if (minecraft == null)
            return;


        RenderSystem.color4f(1, 1, 1, 1);
        minecraft.getTextureManager().bindTexture(TEXTURE);

        int posX = (width - xSize) / 2;
        int posY = (height - ySize) / 2;

        blit(matrixStack, posX, posY, 0, 0, width, height);

        blit(matrixStack, posX + 79, posY + 35, 176, 14, container.getProgressArrowScale() + 1, 16);
    }
}
