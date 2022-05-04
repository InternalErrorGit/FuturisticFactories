package futuristicfactories.common.data.lang;

import futuristicfactories.common.registry.FFBlockRegistry;
import futuristicfactories.common.registry.FFItemRegistry;
import futuristicfactories.common.registry.IFFRegistryNames;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFLanguageProvider extends LanguageProvider implements IFFRegistryNames {
    public FFLanguageProvider(DataGenerator gen, String locale) {
        super(gen, MOD_ID, locale);
    }

    private void addEN_US(Item item, String registryName) {
        String translation = registryName.trim().toLowerCase(Locale.ROOT);

        translation = translation.replace('_', ' ');
        translation = translation.substring(0, 1).toUpperCase(Locale.ROOT) + translation.substring(1);

        add(item, translation);
    }

    private void addEN_US(Block block, String registryName) {
        String translation = registryName.trim().toLowerCase(Locale.ROOT);

        translation = translation.replace('_', ' ');
        translation = translation.substring(0, 1).toUpperCase(Locale.ROOT) + translation.substring(1);

        add(block, translation);
    }

    @Override
    protected void addTranslations() {

        addEN_US(FFBlockRegistry.ALUMINUM_ORE.get(), REGISTRY_NAME_ALUMINUM_ORE);
        addEN_US(FFBlockRegistry.COPPER_ORE.get(), REGISTRY_NAME_COPPER_ORE);
        addEN_US(FFBlockRegistry.LEAD_ORE.get(), REGISTRY_NAME_LEAD_ORE);
        addEN_US(FFBlockRegistry.NICKEL_ORE.get(), REGISTRY_NAME_NICKEL_ORE);
        addEN_US(FFBlockRegistry.SILVER_ORE.get(), REGISTRY_NAME_SILVER_ORE);
        addEN_US(FFBlockRegistry.TIN_ORE.get(), REGISTRY_NAME_TIN_ORE);
        addEN_US(FFBlockRegistry.ALUMINUM_BLOCK.get(), REGISTRY_NAME_ALUMINUM_BLOCK);
        addEN_US(FFBlockRegistry.COPPER_BLOCK.get(), REGISTRY_NAME_COPPER_BLOCK);
        addEN_US(FFBlockRegistry.LEAD_BLOCK.get(), REGISTRY_NAME_LEAD_BLOCK);
        addEN_US(FFBlockRegistry.NICKEL_BLOCK.get(), REGISTRY_NAME_NICKEL_BLOCK);
        addEN_US(FFBlockRegistry.SILVER_BLOCK.get(), REGISTRY_NAME_SILVER_BLOCK);
        addEN_US(FFBlockRegistry.TIN_BLOCK.get(), REGISTRY_NAME_TIN_BLOCK);
        addEN_US(FFItemRegistry.ALUMINUM_INGOT.get(), REGISTRY_NAME_ALUMINUM_INGOT);
        addEN_US(FFItemRegistry.COPPER_INGOT.get(), REGISTRY_NAME_COPPER_INGOT);
        addEN_US(FFItemRegistry.LEAD_INGOT.get(), REGISTRY_NAME_LEAD_INGOT);
        addEN_US(FFItemRegistry.NICKEL_INGOT.get(), REGISTRY_NAME_NICKEL_INGOT);
        addEN_US(FFItemRegistry.SILVER_INGOT.get(), REGISTRY_NAME_SILVER_INGOT);
        addEN_US(FFItemRegistry.TIN_INGOT.get(), REGISTRY_NAME_TIN_INGOT);
        addEN_US(FFItemRegistry.ALUMINUM_NUGGET.get(), REGISTRY_NAME_ALUMINUM_NUGGET);
        addEN_US(FFItemRegistry.COPPER_NUGGET.get(), REGISTRY_NAME_COPPER_NUGGET);
        addEN_US(FFItemRegistry.LEAD_NUGGET.get(), REGISTRY_NAME_LEAD_NUGGET);
        addEN_US(FFItemRegistry.NICKEL_NUGGET.get(), REGISTRY_NAME_NICKEL_NUGGET);
        addEN_US(FFItemRegistry.SILVER_NUGGET.get(), REGISTRY_NAME_SILVER_NUGGET);
        addEN_US(FFItemRegistry.TIN_NUGGET.get(), REGISTRY_NAME_TIN_NUGGET);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_CHUNK.get(), REGISTRY_NAME_ALUMINUM_ORE_CHUNK);
        addEN_US(FFItemRegistry.COPPER_ORE_CHUNK.get(), REGISTRY_NAME_COPPER_ORE_CHUNK);
        addEN_US(FFItemRegistry.LEAD_ORE_CHUNK.get(), REGISTRY_NAME_LEAD_ORE_CHUNK);
        addEN_US(FFItemRegistry.NICKEL_ORE_CHUNK.get(), REGISTRY_NAME_NICKEL_ORE_CHUNK);
        addEN_US(FFItemRegistry.SILVER_ORE_CHUNK.get(), REGISTRY_NAME_SILVER_ORE_CHUNK);
        addEN_US(FFItemRegistry.TIN_ORE_CHUNK.get(), REGISTRY_NAME_TIN_ORE_CHUNK);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_CLUMP.get(), REGISTRY_NAME_ALUMINUM_ORE_CLUMP);
        addEN_US(FFItemRegistry.COPPER_ORE_CLUMP.get(), REGISTRY_NAME_COPPER_ORE_CLUMP);
        addEN_US(FFItemRegistry.LEAD_ORE_CLUMP.get(), REGISTRY_NAME_LEAD_ORE_CLUMP);
        addEN_US(FFItemRegistry.NICKEL_ORE_CLUMP.get(), REGISTRY_NAME_NICKEL_ORE_CLUMP);
        addEN_US(FFItemRegistry.SILVER_ORE_CLUMP.get(), REGISTRY_NAME_SILVER_ORE_CLUMP);
        addEN_US(FFItemRegistry.TIN_ORE_CLUMP.get(), REGISTRY_NAME_TIN_ORE_CLUMP);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_CRYSTAL.get(), REGISTRY_NAME_ALUMINUM_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.COPPER_ORE_CRYSTAL.get(), REGISTRY_NAME_COPPER_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.LEAD_ORE_CRYSTAL.get(), REGISTRY_NAME_LEAD_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.NICKEL_ORE_CRYSTAL.get(), REGISTRY_NAME_NICKEL_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.SILVER_ORE_CRYSTAL.get(), REGISTRY_NAME_SILVER_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.TIN_ORE_CRYSTAL.get(), REGISTRY_NAME_TIN_ORE_CRYSTAL);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_ALUMINUM_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.COPPER_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_COPPER_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.LEAD_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_LEAD_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.NICKEL_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_NICKEL_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.SILVER_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_SILVER_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.TIN_ORE_TINY_CRYSTAL.get(), REGISTRY_NAME_TIN_ORE_TINY_CRYSTAL);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_DUST.get(), REGISTRY_NAME_ALUMINUM_ORE_DUST);
        addEN_US(FFItemRegistry.COPPER_ORE_DUST.get(), REGISTRY_NAME_COPPER_ORE_DUST);
        addEN_US(FFItemRegistry.LEAD_ORE_DUST.get(), REGISTRY_NAME_LEAD_ORE_DUST);
        addEN_US(FFItemRegistry.NICKEL_ORE_DUST.get(), REGISTRY_NAME_NICKEL_ORE_DUST);
        addEN_US(FFItemRegistry.SILVER_ORE_DUST.get(), REGISTRY_NAME_SILVER_ORE_DUST);
        addEN_US(FFItemRegistry.TIN_ORE_DUST.get(), REGISTRY_NAME_TIN_ORE_DUST);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_DIRTY_DUST.get(), REGISTRY_NAME_ALUMINUM_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.COPPER_ORE_DIRTY_DUST.get(), REGISTRY_NAME_COPPER_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.LEAD_ORE_DIRTY_DUST.get(), REGISTRY_NAME_LEAD_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.NICKEL_ORE_DIRTY_DUST.get(), REGISTRY_NAME_NICKEL_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.SILVER_ORE_DIRTY_DUST.get(), REGISTRY_NAME_SILVER_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.TIN_ORE_DIRTY_DUST.get(), REGISTRY_NAME_TIN_ORE_DIRTY_DUST);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_FRAGMENT.get(), REGISTRY_NAME_ALUMINUM_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.COPPER_ORE_FRAGMENT.get(), REGISTRY_NAME_COPPER_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.LEAD_ORE_FRAGMENT.get(), REGISTRY_NAME_LEAD_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.NICKEL_ORE_FRAGMENT.get(), REGISTRY_NAME_NICKEL_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.SILVER_ORE_FRAGMENT.get(), REGISTRY_NAME_SILVER_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.TIN_ORE_FRAGMENT.get(), REGISTRY_NAME_TIN_ORE_FRAGMENT);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_PIECE.get(), REGISTRY_NAME_ALUMINUM_ORE_PIECE);
        addEN_US(FFItemRegistry.COPPER_ORE_PIECE.get(), REGISTRY_NAME_COPPER_ORE_PIECE);
        addEN_US(FFItemRegistry.LEAD_ORE_PIECE.get(), REGISTRY_NAME_LEAD_ORE_PIECE);
        addEN_US(FFItemRegistry.NICKEL_ORE_PIECE.get(), REGISTRY_NAME_NICKEL_ORE_PIECE);
        addEN_US(FFItemRegistry.SILVER_ORE_PIECE.get(), REGISTRY_NAME_SILVER_ORE_PIECE);
        addEN_US(FFItemRegistry.TIN_ORE_PIECE.get(), REGISTRY_NAME_TIN_ORE_PIECE);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_PILE.get(), REGISTRY_NAME_ALUMINUM_ORE_PILE);
        addEN_US(FFItemRegistry.COPPER_ORE_PILE.get(), REGISTRY_NAME_COPPER_ORE_PILE);
        addEN_US(FFItemRegistry.LEAD_ORE_PILE.get(), REGISTRY_NAME_LEAD_ORE_PILE);
        addEN_US(FFItemRegistry.NICKEL_ORE_PILE.get(), REGISTRY_NAME_NICKEL_ORE_PILE);
        addEN_US(FFItemRegistry.SILVER_ORE_PILE.get(), REGISTRY_NAME_SILVER_ORE_PILE);
        addEN_US(FFItemRegistry.TIN_ORE_PILE.get(), REGISTRY_NAME_TIN_ORE_PILE);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_RESIDUAL.get(), REGISTRY_NAME_ALUMINUM_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.COPPER_ORE_RESIDUAL.get(), REGISTRY_NAME_COPPER_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.LEAD_ORE_RESIDUAL.get(), REGISTRY_NAME_LEAD_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.NICKEL_ORE_RESIDUAL.get(), REGISTRY_NAME_NICKEL_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.SILVER_ORE_RESIDUAL.get(), REGISTRY_NAME_SILVER_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.TIN_ORE_RESIDUAL.get(), REGISTRY_NAME_TIN_ORE_RESIDUAL);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_SAND.get(), REGISTRY_NAME_ALUMINUM_ORE_SAND);
        addEN_US(FFItemRegistry.COPPER_ORE_SAND.get(), REGISTRY_NAME_COPPER_ORE_SAND);
        addEN_US(FFItemRegistry.LEAD_ORE_SAND.get(), REGISTRY_NAME_LEAD_ORE_SAND);
        addEN_US(FFItemRegistry.NICKEL_ORE_SAND.get(), REGISTRY_NAME_NICKEL_ORE_SAND);
        addEN_US(FFItemRegistry.SILVER_ORE_SAND.get(), REGISTRY_NAME_SILVER_ORE_SAND);
        addEN_US(FFItemRegistry.TIN_ORE_SAND.get(), REGISTRY_NAME_TIN_ORE_SAND);
        addEN_US(FFItemRegistry.ALUMINUM_ORE_SHARD.get(), REGISTRY_NAME_ALUMINUM_ORE_SHARD);
        addEN_US(FFItemRegistry.COPPER_ORE_SHARD.get(), REGISTRY_NAME_COPPER_ORE_SHARD);
        addEN_US(FFItemRegistry.LEAD_ORE_SHARD.get(), REGISTRY_NAME_LEAD_ORE_SHARD);
        addEN_US(FFItemRegistry.NICKEL_ORE_SHARD.get(), REGISTRY_NAME_NICKEL_ORE_SHARD);
        addEN_US(FFItemRegistry.SILVER_ORE_SHARD.get(), REGISTRY_NAME_SILVER_ORE_SHARD);
        addEN_US(FFItemRegistry.TIN_ORE_SHARD.get(), REGISTRY_NAME_TIN_ORE_SHARD);

        addEN_US(FFBlockRegistry.CRUSHING_MACHINE.get(), REGISTRY_NAME_CRUSHING_MACHINE);


        //   add(FFItemRegistry.ALUMINUM_SWORD.get(), REGISTRY_NAME_ALUMINUM_SWORD);
        //   add(FFItemRegistry.COPPER_SWORD.get(), REGISTRY_NAME_COPPER_SWORD);
        //   add(FFItemRegistry.LEAD_SWORD.get(), REGISTRY_NAME_LEAD_SWORD);
        //   add(FFItemRegistry.NICKEL_SWORD.get(), REGISTRY_NAME_NICKEL_SWORD);
        //   add(FFItemRegistry.SILVER_SWORD.get(), REGISTRY_NAME_SILVER_SWORD);
        //   add(FFItemRegistry.TIN_SWORD.get(), REGISTRY_NAME_TIN_SWORD);
        //   add(FFItemRegistry.ALUMINUM_AXE.get(), REGISTRY_NAME_ALUMINUM_AXE);
        //   add(FFItemRegistry.COPPER_AXE.get(), REGISTRY_NAME_COPPER_AXE);
        //   add(FFItemRegistry.LEAD_AXE.get(), REGISTRY_NAME_LEAD_AXE);
        //   add(FFItemRegistry.NICKEL_AXE.get(), REGISTRY_NAME_NICKEL_AXE);
        //   add(FFItemRegistry.SILVER_AXE.get(), REGISTRY_NAME_SILVER_AXE);
        //   add(FFItemRegistry.TIN_AXE.get(), REGISTRY_NAME_TIN_AXE);
        //   add(FFItemRegistry.ALUMINUM_PICKAXE.get(), REGISTRY_NAME_ALUMINUM_PICKAXE);
        //   add(FFItemRegistry.COPPER_PICKAXE.get(), REGISTRY_NAME_COPPER_PICKAXE);
        //   add(FFItemRegistry.LEAD_PICKAXE.get(), REGISTRY_NAME_LEAD_PICKAXE);
        //   add(FFItemRegistry.NICKEL_PICKAXE.get(), REGISTRY_NAME_NICKEL_PICKAXE);
        //   add(FFItemRegistry.SILVER_PICKAXE.get(), REGISTRY_NAME_SILVER_PICKAXE);
        //   add(FFItemRegistry.TIN_PICKAXE.get(), REGISTRY_NAME_TIN_PICKAXE);
        //   add(FFItemRegistry.ALUMINUM_SHOVEL.get(), REGISTRY_NAME_ALUMINUM_SHOVEL);
        //   add(FFItemRegistry.COPPER_SHOVEL.get(), REGISTRY_NAME_COPPER_SHOVEL);
        //   add(FFItemRegistry.LEAD_SHOVEL.get(), REGISTRY_NAME_LEAD_SHOVEL);
        //   add(FFItemRegistry.NICKEL_SHOVEL.get(), REGISTRY_NAME_NICKEL_SHOVEL);
        //   add(FFItemRegistry.SILVER_SHOVEL.get(), REGISTRY_NAME_SILVER_SHOVEL);
        //   add(FFItemRegistry.TIN_SHOVEL.get(), REGISTRY_NAME_TIN_SHOVEL);
        //   add(FFItemRegistry.ALUMINUM_HOE.get(), REGISTRY_NAME_ALUMINUM_HOE);
        //   add(FFItemRegistry.COPPER_HOE.get(), REGISTRY_NAME_COPPER_HOE);
        //   add(FFItemRegistry.LEAD_HOE.get(), REGISTRY_NAME_LEAD_HOE);
        //   add(FFItemRegistry.NICKEL_HOE.get(), REGISTRY_NAME_NICKEL_HOE);
        //   add(FFItemRegistry.SILVER_HOE.get(), REGISTRY_NAME_SILVER_HOE);
        //   add(FFItemRegistry.TIN_HOE.get(), REGISTRY_NAME_TIN_HOE);
        //   add(FFItemRegistry.ALUMINUM_HELMET.get(), REGISTRY_NAME_ALUMINUM_HELMET);
        //   add(FFItemRegistry.COPPER_HELMET.get(), REGISTRY_NAME_COPPER_HELMET);
        //   add(FFItemRegistry.LEAD_HELMET.get(), REGISTRY_NAME_LEAD_HELMET);
        //   add(FFItemRegistry.NICKEL_HELMET.get(), REGISTRY_NAME_NICKEL_HELMET);
        //   add(FFItemRegistry.SILVER_HELMET.get(), REGISTRY_NAME_SILVER_HELMET);
        //   add(FFItemRegistry.TIN_HELMET.get(), REGISTRY_NAME_TIN_HELMET);
        //   add(FFItemRegistry.ALUMINUM_CHESTPLATE.get(), REGISTRY_NAME_ALUMINUM_CHESTPLATE);
        //   add(FFItemRegistry.COPPER_CHESTPLATE.get(), REGISTRY_NAME_COPPER_CHESTPLATE);
        //   add(FFItemRegistry.LEAD_CHESTPLATE.get(), REGISTRY_NAME_LEAD_CHESTPLATE);
        //   add(FFItemRegistry.NICKEL_CHESTPLATE.get(), REGISTRY_NAME_NICKEL_CHESTPLATE);
        //   add(FFItemRegistry.SILVER_CHESTPLATE.get(), REGISTRY_NAME_SILVER_CHESTPLATE);
        //   add(FFItemRegistry.TIN_CHESTPLATE.get(), REGISTRY_NAME_TIN_CHESTPLATE);
        //   add(FFItemRegistry.ALUMINUM_PANTS.get(), REGISTRY_NAME_ALUMINUM_PANTS);
        //   add(FFItemRegistry.COPPER_PANTS.get(), REGISTRY_NAME_COPPER_PANTS);
        //   add(FFItemRegistry.LEAD_PANTS.get(), REGISTRY_NAME_LEAD_PANTS);
        //   add(FFItemRegistry.NICKEL_PANTS.get(), REGISTRY_NAME_NICKEL_PANTS);
        //   add(FFItemRegistry.SILVER_PANTS.get(), REGISTRY_NAME_SILVER_PANTS);
        //   add(FFItemRegistry.TIN_PANTS.get(), REGISTRY_NAME_TIN_PANTS);
        //   add(FFItemRegistry.ALUMINUM_BOOTS.get(), REGISTRY_NAME_ALUMINUM_BOOTS);
        //   add(FFItemRegistry.COPPER_BOOTS.get(), REGISTRY_NAME_COPPER_BOOTS);
        //   add(FFItemRegistry.LEAD_BOOTS.get(), REGISTRY_NAME_LEAD_BOOTS);
        //   add(FFItemRegistry.NICKEL_BOOTS.get(), REGISTRY_NAME_NICKEL_BOOTS);
        //   add(FFItemRegistry.SILVER_BOOTS.get(), REGISTRY_NAME_SILVER_BOOTS);
        //   add(FFItemRegistry.TIN_BOOTS.get(), REGISTRY_NAME_TIN_BOOTS);

    }
}
