package futuristicfactories.client.screen;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.washing.WashingContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class WashingScreen extends MachineScreen<WashingContainer> {
    public WashingScreen(WashingContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/washing_machine.png");
    }
}
