package futuristicfactories.common.registry;

import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

import static futuristicfactories.FuturisticFactories.FUTURISTIC_FACTORIES_TAB_MATERIALS;

public class FFItemRegistry implements IFFRegistryNames {

    // REGISTRY_NAME_INGOT
    public static final RegistryObject<Item> ALUMINUM_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_INGOT, materialItem());
    public static final RegistryObject<Item> COPPER_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_INGOT, materialItem());
    public static final RegistryObject<Item> LEAD_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_INGOT, materialItem());
    public static final RegistryObject<Item> NICKEL_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_INGOT, materialItem());
    public static final RegistryObject<Item> SILVER_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_INGOT, materialItem());
    public static final RegistryObject<Item> TIN_INGOT = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_INGOT, materialItem());

    // REGISTRY_NAME_NUGGET
    public static final RegistryObject<Item> ALUMINUM_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_NUGGET, materialItem());
    public static final RegistryObject<Item> COPPER_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_NUGGET, materialItem());
    public static final RegistryObject<Item> LEAD_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_NUGGET, materialItem());
    public static final RegistryObject<Item> NICKEL_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_NUGGET, materialItem());
    public static final RegistryObject<Item> SILVER_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_NUGGET, materialItem());
    public static final RegistryObject<Item> TIN_NUGGET = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_NUGGET, materialItem());
    // REGISTRY_NAME_ORE_CHUNK
    public static final RegistryObject<Item> ALUMINUM_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> IRON_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CHUNK, materialItem());
    // REGISTRY_NAME_ORE_CLUMP
    public static final RegistryObject<Item> ALUMINUM_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> IRON_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CLUMP, materialItem());
    // REGISTRY_NAME_ORE_CRYSTAL
    public static final RegistryObject<Item> ALUMINUM_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> IRON_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CRYSTAL, materialItem());
    // REGISTRY_NAME_ORE_TINY_CRYSTAL
    public static final RegistryObject<Item> ALUMINUM_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> IRON_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_TINY_CRYSTAL, materialItem());
    // REGISTRY_NAME_ORE_DUST
    public static final RegistryObject<Item> ALUMINUM_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_DUST, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_DUST, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_DUST, materialItem());
    public static final RegistryObject<Item> IRON_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_DUST, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_DUST, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_DUST, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_DUST, materialItem());
    public static final RegistryObject<Item> TIN_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_DUST, materialItem());
    // REGISTRY_NAME_ORE_DIRTY_DUST
    public static final RegistryObject<Item> ALUMINUM_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> IRON_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> TIN_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_DIRTY_DUST, materialItem());
    // REGISTRY_NAME_ORE_FRAGMENT
    public static final RegistryObject<Item> ALUMINUM_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> IRON_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> TIN_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_FRAGMENT, materialItem());
    // REGISTRY_NAME_ORE_PIECE
    public static final RegistryObject<Item> ALUMINUM_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> IRON_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> TIN_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_PIECE, materialItem());
    // REGISTRY_NAME_ORE_PILE
    public static final RegistryObject<Item> ALUMINUM_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_PILE, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_PILE, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_PILE, materialItem());
    public static final RegistryObject<Item> IRON_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_PILE, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_PILE, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_PILE, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_PILE, materialItem());
    public static final RegistryObject<Item> TIN_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_PILE, materialItem());
    // REGISTRY_NAME_ORE_RESIDUAL
    public static final RegistryObject<Item> ALUMINUM_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> IRON_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_RESIDUAL, materialItem());
    // REGISTRY_NAME_ORE_SAND
    public static final RegistryObject<Item> ALUMINUM_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_SAND, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_SAND, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_SAND, materialItem());
    public static final RegistryObject<Item> IRON_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_SAND, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_SAND, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_SAND, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_SAND, materialItem());
    public static final RegistryObject<Item> TIN_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_SAND, materialItem());
    // REGISTRY_NAME_ORE_SHARD
    public static final RegistryObject<Item> ALUMINUM_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> GOLD_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_GOLD_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> IRON_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_IRON_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> TIN_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_SHARD, materialItem());

    private static Supplier<? extends Item> item(ItemGroup group) {
        return () -> new Item(new Item.Properties().group(group));
    }

    private static Supplier<? extends Item> materialItem() {
        return item(FUTURISTIC_FACTORIES_TAB_MATERIALS);
    }


    public static void register() {
    }
}