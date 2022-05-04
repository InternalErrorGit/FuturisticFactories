package futuristicfactories.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import futuristicfactories.common.block.machine.MachineContainer;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class MachineScreen<T extends MachineContainer> extends ContainerScreen<T> {

    public MachineScreen(T screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    public void render(MatrixStack matrixStack, int x, int y, float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, x, y, partialTicks);
        this.renderHoveredTooltip(matrixStack, x, y);
    }

    protected abstract ResourceLocation getTexture();

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int x, int y) {
        if (minecraft == null)
            return;
        RenderSystem.color4f(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        drawGuiContainer(matrixStack,partialTicks,x,y);
    }

    protected abstract void drawGuiContainer(MatrixStack matrixStack, float partialTicks, int x, int y);
}
