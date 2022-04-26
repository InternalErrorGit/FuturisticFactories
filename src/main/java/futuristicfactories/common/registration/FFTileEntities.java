package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFTileEntities implements IFFRegistry<TileEntityType<?>> {


    @Override
    public void register(IForgeRegistry<TileEntityType<?>> registry) {

    }
}
