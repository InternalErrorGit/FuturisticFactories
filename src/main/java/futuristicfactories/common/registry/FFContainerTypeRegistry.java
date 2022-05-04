package futuristicfactories.common.registry;

import futuristicfactories.client.screen.CrushingScreen;
import futuristicfactories.client.screen.MetalPressScreen;
import futuristicfactories.common.block.crushing.CrushingContainer;
import futuristicfactories.common.block.metalpress.MetalPressContainer;
import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.network.IContainerFactory;

public class FFContainerTypeRegistry implements IFFRegistryNames {

    public static final RegistryObject<ContainerType<MetalPressContainer>> METAL_PRESS = register(REGISTRY_NAME_METAL_PRESS, MetalPressContainer::new);

    public static final RegistryObject<ContainerType<CrushingContainer>> CRUSHING_MACHINE = register(REGISTRY_NAME_CRUSHING_MACHINE, CrushingContainer::new);


    public static void register() {

    }

    @OnlyIn(Dist.CLIENT)
    public static void registerScreens(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(METAL_PRESS.get(), MetalPressScreen::new);
        ScreenManager.registerFactory(CRUSHING_MACHINE.get(), CrushingScreen::new);
    }

    private static <T extends Container> RegistryObject<ContainerType<T>> register(String name, IContainerFactory<T> factory) {
        return FFRegistration.CONTAINERS.register(name, () -> IForgeContainerType.create(factory));
    }


}
