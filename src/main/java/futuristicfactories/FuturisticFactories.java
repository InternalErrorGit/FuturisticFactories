package futuristicfactories;

import futuristicfactories.common.generation.WorldGeneration;
import futuristicfactories.common.registration.FFRegistration;
import futuristicfactories.common.registry.FFBlockRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FuturisticFactories.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FuturisticFactories {
    public static final String MOD_ID = "futuristicfactories";

    public static final Logger logger = LogManager.getLogger(MOD_ID);

    public static ResourceLocation location(String path) {
        return new ResourceLocation(MOD_ID, path);
    }

    public static final ItemGroup FUTURISTIC_FACTORIES_TAB_MATERIALS = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FFBlockRegistry.COPPER_ORE.get());
        }
    };

    public static final ItemGroup FUTURISTIC_FACTORIES_TAB_MACHINES = new ItemGroup(MOD_ID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(FFBlockRegistry.METAL_PRESS.get());
        }
    };

    public FuturisticFactories() {

        FFRegistration.register();

        MinecraftForge.EVENT_BUS.register(this);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, WorldGeneration::generateOre);

    }

}
