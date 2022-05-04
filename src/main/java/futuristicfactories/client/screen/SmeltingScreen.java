package futuristicfactories.client.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.smelting.SmeltingContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class SmeltingScreen extends MachineScreen<SmeltingContainer> {
    public SmeltingScreen(SmeltingContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/smelting_machine.png");
    }

    @Override
    protected void drawGuiContainer(MatrixStack matrixStack, float partialTicks, int x, int y) {

    }
}
