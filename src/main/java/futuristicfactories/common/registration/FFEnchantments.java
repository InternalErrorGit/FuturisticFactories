package futuristicfactories.common.registration;

import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFEnchantments implements IFFRegistry<Enchantment> {

    @Override
    public void register(IForgeRegistry<Enchantment> registry) {

    }

    @Override
    public void init() {

    }
}
