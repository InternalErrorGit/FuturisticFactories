package futuristicfactories.common.registry;

import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

import static futuristicfactories.FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS;

public class FFItemsRegistry implements IFFRegistryNames {

    public static final RegistryObject<Item> ALUMINUM_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> LEAD_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> NICKEL_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> TIN_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_INGOT, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));

    public static final RegistryObject<Item> ALUMINUM_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> LEAD_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> NICKEL_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> SILVER_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));
    public static final RegistryObject<Item> TIN_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_NUGGET, () -> new Item(new Item.Properties().group(FUTURISTIC_FACTORIES_TAB_MATERIALS)));


    public static void register() {
    }
}