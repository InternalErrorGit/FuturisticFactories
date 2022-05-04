package futuristicfactories.client.screen;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.block.combining.CombiningContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class CombiningScreen extends MachineScreen<CombiningContainer> {
    public CombiningScreen(CombiningContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);
    }

    @Override
    protected ResourceLocation getTexture() {
        return FuturisticFactories.location("textures/gui/combining_machine.png");
    }

}
