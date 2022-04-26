package futuristicfactories;

import futuristicfactories.client.ClientProxy;
import futuristicfactories.common.ServerProxy;
import futuristicfactories.common.data.FFLoot;
import futuristicfactories.common.data.FFRecipes;
import futuristicfactories.common.registration.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.fluid.Fluid;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(FuturisticFactories.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FuturisticFactories {
    public static final String MODID = "futuristicfactories";

    private static final Logger LOGGER = LogManager.getLogger();
    private static final FFBlocks blockRegistry = new FFBlocks();
    private static final FFItems itemRegistry = new FFItems();
    private static final FFFluids fluidRegistry = new FFFluids();
    private static final FFTileEntities tileEntityRegistry = new FFTileEntities();
    private static final FFSounds soundRegistry = new FFSounds();
    private static final FFContainers containerRegistry = new FFContainers();

    public static IFFProxy PROXY = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);


    public static ResourceLocation location(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static final ItemGroup FUTURISTIC_FACTORIES_TAB = new ItemGroup(MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.DIRT);
        }
    };

    public FuturisticFactories() {
        PROXY.eventInit();
    }

    @SubscribeEvent
    public void registerRegistry(RegistryEvent.NewRegistry e) {
        PROXY.syncInit();
    }

    @SubscribeEvent
    public static void registerMethodTypes(final RegistryEvent.Register<Block> evt) {

    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> evt) {
        final IForgeRegistry<Block> registry = evt.getRegistry();
        blockRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> evt) {
        final IForgeRegistry<Item> registry = evt.getRegistry();
        itemRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerTileEntities(final RegistryEvent.Register<TileEntityType<?>> evt) {
        final IForgeRegistry<TileEntityType<?>> registry = evt.getRegistry();
        tileEntityRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerFluids(final RegistryEvent.Register<Fluid> evt) {
        final IForgeRegistry<Fluid> registry = evt.getRegistry();
        fluidRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerContainers(final RegistryEvent.Register<ContainerType<?>> evt) {
        final IForgeRegistry<ContainerType<?>> registry = evt.getRegistry();
        containerRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerSounds(final RegistryEvent.Register<SoundEvent> evt) {
        final IForgeRegistry<SoundEvent> registry = evt.getRegistry();
        soundRegistry.register(registry);
    }

    @SubscribeEvent
    public static void registerGenerators(final GatherDataEvent event) {
        final DataGenerator generator = event.getGenerator();
        generator.addProvider(new FFLoot(generator));
        generator.addProvider(new FFRecipes(generator));
    }


    /*
    public FuturisticFactories() {
        BLOCKS.register("copperOreBlock",() -> new OreBlock());

        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    private void enqueueIMC(final InterModEnqueueEvent event) {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("FuturisticFactories", "helloworld", () -> {
            LOGGER.info("Hello world from the MDK");
            return "Hello world";
        });
    }

    private void processIMC(final InterModProcessEvent event) {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m -> m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }

     */
}
