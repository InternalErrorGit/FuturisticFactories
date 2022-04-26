package futuristicfactories;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public interface IFFProxy {

    default void eventInit() {

    }

    default void clientInit(FMLClientSetupEvent event) {

    }

    default void syncInit() {

    }
}
