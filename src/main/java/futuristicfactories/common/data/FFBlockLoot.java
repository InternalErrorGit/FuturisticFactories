package futuristicfactories.common.data;

import futuristicfactories.common.registration.FFBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static futuristicfactories.FuturisticFactories.MODID;

public class FFBlockLoot extends BlockLootTables {

    @Override
    protected void addTables() {
        registerDropSelfLootTable(FFBlocks.blockOreCopper);
        registerDropSelfLootTable(FFBlocks.blockOrLead);
        registerDropSelfLootTable(FFBlocks.blockOreNickel);
        registerDropSelfLootTable(FFBlocks.blockOreSilver);
        registerDropSelfLootTable(FFBlocks.blockOreTin);
        registerDropSelfLootTable(FFBlocks.blockCopper);
        registerDropSelfLootTable(FFBlocks.blockLead);
        registerDropSelfLootTable(FFBlocks.blockNickel);
        registerDropSelfLootTable(FFBlocks.blockSilver);
        registerDropSelfLootTable(FFBlocks.blockTin);


    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return StreamSupport.stream(ForgeRegistries.BLOCKS.spliterator(), false).filter(b -> b.getRegistryName().getNamespace().equals(MODID)).collect(Collectors.toList());
    }
}
