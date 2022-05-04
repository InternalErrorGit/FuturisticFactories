package futuristicfactories.common.registry;

import futuristicfactories.client.screen.*;
import futuristicfactories.common.block.combining.CombiningContainer;
import futuristicfactories.common.block.crushing.CrushingContainer;
import futuristicfactories.common.block.crystallizing.CrystallizingContainer;
import futuristicfactories.common.block.pulverizing.PulverizingContainer;
import futuristicfactories.common.block.smelting.SmeltingContainer;
import futuristicfactories.common.block.washing.WashingContainer;
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


    public static final RegistryObject<ContainerType<CrushingContainer>> CRUSHING_MACHINE = register(REGISTRY_NAME_CRUSHING_MACHINE, CrushingContainer::new);
    public static final RegistryObject<ContainerType<PulverizingContainer>> PULVERIZING_MACHINE = register(REGISTRY_NAME_PULVERIZING_MACHINE, PulverizingContainer::new);
    public static final RegistryObject<ContainerType<CrystallizingContainer>> CRYSTALLIZING_MACHINE = register(REGISTRY_NAME_CRYSTALLIZING_MACHINE, CrystallizingContainer::new);
    public static final RegistryObject<ContainerType<CombiningContainer>> COMBINING_MACHINE = register(REGISTRY_NAME_COMBINING_MACHINE, CombiningContainer::new);
    public static final RegistryObject<ContainerType<SmeltingContainer>> SMELTING_MACHINE = register(REGISTRY_NAME_SMELTING_MACHINE, SmeltingContainer::new);
    public static final RegistryObject<ContainerType<WashingContainer>> WASHING_MACHINE = register(REGISTRY_NAME_WASHING_MACHINE, WashingContainer::new);


    public static void register() {

    }

    @OnlyIn(Dist.CLIENT)
    public static void registerScreens(FMLClientSetupEvent event) {
        ScreenManager.registerFactory(CRUSHING_MACHINE.get(), CrushingScreen::new);
        ScreenManager.registerFactory(PULVERIZING_MACHINE.get(), PulverizingScreen::new);
        ScreenManager.registerFactory(CRYSTALLIZING_MACHINE.get(), CrystallizingScreen::new);
        ScreenManager.registerFactory(COMBINING_MACHINE.get(), CombiningScreen::new);
        ScreenManager.registerFactory(SMELTING_MACHINE.get(), SmeltingScreen::new);
        ScreenManager.registerFactory(WASHING_MACHINE.get(), WashingScreen::new);
    }

    private static <T extends Container> RegistryObject<ContainerType<T>> register(String name, IContainerFactory<T> factory) {
        return FFRegistration.CONTAINERS.register(name, () -> IForgeContainerType.create(factory));
    }


}
