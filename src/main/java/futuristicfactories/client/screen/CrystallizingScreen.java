package futuristicfactories.client.screen;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.crystallizing.CrystallizingContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CrystallizingScreen extends MachineScreen<CrystallizingContainer> {
    public CrystallizingScreen(CrystallizingContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/crystallizing_machine.png");
    }

}
