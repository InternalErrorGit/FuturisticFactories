package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFContainers implements IFFRegistry<ContainerType<?>> {

    @Override
    public void register(IForgeRegistry<ContainerType<?>> registry) {

    }

    @Override
    public void init() {

    }
}
