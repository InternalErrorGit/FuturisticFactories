package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.fluid.Fluid;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFFluids implements IFFRegistry<Fluid> {

    @Override
    public void register(IForgeRegistry<Fluid> registry) {

    }

    @Override
    public void init() {

    }
}
