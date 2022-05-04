package futuristicfactories.client.screen;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.pulverizing.PulverizingContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class PulverizingScreen extends MachineScreen<PulverizingContainer> {
    public PulverizingScreen(PulverizingContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/pulverizing_machine.png");
    }
}
