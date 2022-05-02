package futuristicfactories.common.registry;

import futuristicfactories.common.registration.FFRegistration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

import static futuristicfactories.FuturisticFactories.FUTURISTIC_FACTORIES_TAB_EQUIPMENT;
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
    public static final RegistryObject<Item> LEAD_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CHUNK, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CHUNK = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CHUNK, materialItem());
    // REGISTRY_NAME_ORE_CLUMP
    public static final RegistryObject<Item> ALUMINUM_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CLUMP, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CLUMP = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CLUMP, materialItem());
    // REGISTRY_NAME_ORE_CRYSTAL
    public static final RegistryObject<Item> ALUMINUM_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_CRYSTAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_CRYSTAL, materialItem());
    // REGISTRY_NAME_ORE_TINY_CRYSTAL
    public static final RegistryObject<Item> ALUMINUM_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_TINY_CRYSTAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_TINY_CRYSTAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_TINY_CRYSTAL, materialItem());
    // REGISTRY_NAME_ORE_DUST
    public static final RegistryObject<Item> ALUMINUM_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_DUST, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_DUST, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_DUST, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_DUST, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_DUST, materialItem());
    public static final RegistryObject<Item> TIN_ORE_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_DUST, materialItem());
    // REGISTRY_NAME_ORE_DIRTY_DUST
    public static final RegistryObject<Item> ALUMINUM_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_DIRTY_DUST, materialItem());
    public static final RegistryObject<Item> TIN_ORE_DIRTY_DUST = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_DIRTY_DUST, materialItem());
    // REGISTRY_NAME_ORE_FRAGMENT
    public static final RegistryObject<Item> ALUMINUM_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_FRAGMENT, materialItem());
    public static final RegistryObject<Item> TIN_ORE_FRAGMENT = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_FRAGMENT, materialItem());
    // REGISTRY_NAME_ORE_PIECE
    public static final RegistryObject<Item> ALUMINUM_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_PIECE, materialItem());
    public static final RegistryObject<Item> TIN_ORE_PIECE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_PIECE, materialItem());
    // REGISTRY_NAME_ORE_PILE
    public static final RegistryObject<Item> ALUMINUM_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_PILE, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_PILE, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_PILE, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_PILE, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_PILE, materialItem());
    public static final RegistryObject<Item> TIN_ORE_PILE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_PILE, materialItem());
    // REGISTRY_NAME_ORE_RESIDUAL
    public static final RegistryObject<Item> ALUMINUM_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_RESIDUAL, materialItem());
    public static final RegistryObject<Item> TIN_ORE_RESIDUAL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_RESIDUAL, materialItem());
    // REGISTRY_NAME_ORE_SAND
    public static final RegistryObject<Item> ALUMINUM_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_SAND, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_SAND, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_SAND, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_SAND, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_SAND, materialItem());
    public static final RegistryObject<Item> TIN_ORE_SAND = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_SAND, materialItem());
    // REGISTRY_NAME_ORE_SHARD
    public static final RegistryObject<Item> ALUMINUM_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> COPPER_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> LEAD_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> NICKEL_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> SILVER_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_ORE_SHARD, materialItem());
    public static final RegistryObject<Item> TIN_ORE_SHARD = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_ORE_SHARD, materialItem());
    // REGISTRY_NAME_SWORD
   // public static final RegistryObject<Item> ALUMINUM_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_SWORD, materialItem());
   // public static final RegistryObject<Item> COPPER_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_SWORD, materialItem());
   // public static final RegistryObject<Item> LEAD_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_SWORD, materialItem());
   // public static final RegistryObject<Item> NICKEL_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_SWORD, materialItem());
   // public static final RegistryObject<Item> SILVER_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_SWORD, materialItem());
   // public static final RegistryObject<Item> TIN_SWORD = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_SWORD, materialItem());
   // // REGISTRY_NAME_AXE
   // public static final RegistryObject<Item> ALUMINUM_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_AXE, materialItem());
   // public static final RegistryObject<Item> COPPER_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_AXE, materialItem());
   // public static final RegistryObject<Item> LEAD_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_AXE, materialItem());
   // public static final RegistryObject<Item> NICKEL_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_AXE, materialItem());
   // public static final RegistryObject<Item> SILVER_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_AXE, materialItem());
   // public static final RegistryObject<Item> TIN_AXE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_AXE, materialItem());
   // // REGISTRY_NAME_PICKAXE
   // public static final RegistryObject<Item> ALUMINUM_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_PICKAXE, materialItem());
   // public static final RegistryObject<Item> COPPER_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_PICKAXE, materialItem());
   // public static final RegistryObject<Item> LEAD_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_PICKAXE, materialItem());
   // public static final RegistryObject<Item> NICKEL_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_PICKAXE, materialItem());
   // public static final RegistryObject<Item> SILVER_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_PICKAXE, materialItem());
   // public static final RegistryObject<Item> TIN_PICKAXE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_PICKAXE, materialItem());
   // // REGISTRY_NAME_SHOVEL
   // public static final RegistryObject<Item> ALUMINUM_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_SHOVEL, materialItem());
   // public static final RegistryObject<Item> COPPER_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_SHOVEL, materialItem());
   // public static final RegistryObject<Item> LEAD_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_SHOVEL, materialItem());
   // public static final RegistryObject<Item> NICKEL_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_SHOVEL, materialItem());
   // public static final RegistryObject<Item> SILVER_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_SHOVEL, materialItem());
   // public static final RegistryObject<Item> TIN_SHOVEL = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_SHOVEL, materialItem());
   // // REGISTRY_NAME_HOE
   // public static final RegistryObject<Item> ALUMINUM_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_HOE, materialItem());
   // public static final RegistryObject<Item> COPPER_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_HOE, materialItem());
   // public static final RegistryObject<Item> LEAD_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_HOE, materialItem());
   // public static final RegistryObject<Item> NICKEL_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_HOE, materialItem());
   // public static final RegistryObject<Item> SILVER_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_HOE, materialItem());
   // public static final RegistryObject<Item> TIN_HOE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_HOE, materialItem());
   // // REGISTRY_NAME_HELMET
   // public static final RegistryObject<Item> ALUMINUM_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_HELMET, materialItem());
   // public static final RegistryObject<Item> COPPER_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_HELMET, materialItem());
   // public static final RegistryObject<Item> LEAD_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_HELMET, materialItem());
   // public static final RegistryObject<Item> NICKEL_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_HELMET, materialItem());
   // public static final RegistryObject<Item> SILVER_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_HELMET, materialItem());
   // public static final RegistryObject<Item> TIN_HELMET = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_HELMET, materialItem());
   // // REGISTRY_NAME_CHESTPLATE
   // public static final RegistryObject<Item> ALUMINUM_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_CHESTPLATE, materialItem());
   // public static final RegistryObject<Item> COPPER_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_CHESTPLATE, materialItem());
   // public static final RegistryObject<Item> LEAD_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_CHESTPLATE, materialItem());
   // public static final RegistryObject<Item> NICKEL_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_CHESTPLATE, materialItem());
   // public static final RegistryObject<Item> SILVER_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_CHESTPLATE, materialItem());
   // public static final RegistryObject<Item> TIN_CHESTPLATE = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_CHESTPLATE, materialItem());
   // // REGISTRY_NAME_PANTS
   // public static final RegistryObject<Item> ALUMINUM_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_PANTS, materialItem());
   // public static final RegistryObject<Item> COPPER_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_PANTS, materialItem());
   // public static final RegistryObject<Item> LEAD_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_PANTS, materialItem());
   // public static final RegistryObject<Item> NICKEL_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_PANTS, materialItem());
   // public static final RegistryObject<Item> SILVER_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_PANTS, materialItem());
   // public static final RegistryObject<Item> TIN_PANTS = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_PANTS, materialItem());
   // // REGISTRY_NAME_BOOTS
   // public static final RegistryObject<Item> ALUMINUM_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_ALUMINUM_BOOTS, materialItem());
   // public static final RegistryObject<Item> COPPER_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_COPPER_BOOTS, materialItem());
   // public static final RegistryObject<Item> LEAD_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_LEAD_BOOTS, materialItem());
   // public static final RegistryObject<Item> NICKEL_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_NICKEL_BOOTS, materialItem());
   // public static final RegistryObject<Item> SILVER_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_SILVER_BOOTS, materialItem());
   // public static final RegistryObject<Item> TIN_BOOTS = FFRegistration.ITEMS.register(REGISTRY_NAME_TIN_BOOTS, materialItem());

    private static Supplier<? extends Item> item(ItemGroup group) {
        return () -> new Item(new Item.Properties().group(group));
    }

    private static Supplier<? extends Item> materialItem() {
        return item(FUTURISTIC_FACTORIES_TAB_MATERIALS);
    }

    private static Supplier<? extends Item> equipmentItem() {
        return item(FUTURISTIC_FACTORIES_TAB_EQUIPMENT);
    }


    public static void register() {
    }
}