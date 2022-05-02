package futuristicfactories.common.data.loot;

import futuristicfactories.common.registration.FFRegistration;
import futuristicfactories.common.registry.FFBlockRegistry;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.fml.RegistryObject;

import java.util.stream.Collectors;

public class FFBlockLootTables extends BlockLootTables {

    @Override
    protected void addTables() {

        registerDropSelfLootTable(FFBlockRegistry.ALUMINUM_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.COPPER_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.LEAD_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.NICKEL_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.SILVER_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.TIN_ORE.get());
        registerDropSelfLootTable(FFBlockRegistry.ALUMINUM_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.COPPER_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.LEAD_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.NICKEL_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.SILVER_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.TIN_BLOCK.get());
        registerDropSelfLootTable(FFBlockRegistry.METAL_PRESS.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return FFRegistration.BLOCKS.getEntries().stream()
                .map(RegistryObject::get)
                .collect(Collectors.toList());
    }

}
