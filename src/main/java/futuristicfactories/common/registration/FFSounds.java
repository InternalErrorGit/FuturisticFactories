package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFSounds implements IFFRegistry<SoundEvent> {

    @Override
    public void register(IForgeRegistry<SoundEvent> registry) {

    }

    @Override
    public void init() {

    }
}
