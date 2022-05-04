package futuristicfactories.common.data.state;

import futuristicfactories.FuturisticFactories;
import futuristicfactories.common.registry.FFBlockRegistry;
import futuristicfactories.common.registry.IFFRegistryNames;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import static futuristicfactories.FuturisticFactories.MOD_ID;

public class FFBlockStateProvider extends BlockStateProvider implements IFFRegistryNames {
    public FFBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(FFBlockRegistry.ALUMINUM_ORE.get());
        simpleBlock(FFBlockRegistry.COPPER_ORE.get());
        simpleBlock(FFBlockRegistry.LEAD_ORE.get());
        simpleBlock(FFBlockRegistry.NICKEL_ORE.get());
        simpleBlock(FFBlockRegistry.SILVER_ORE.get());
        simpleBlock(FFBlockRegistry.TIN_ORE.get());
        simpleBlock(FFBlockRegistry.ALUMINUM_BLOCK.get());
        simpleBlock(FFBlockRegistry.COPPER_BLOCK.get());
        simpleBlock(FFBlockRegistry.LEAD_BLOCK.get());
        simpleBlock(FFBlockRegistry.NICKEL_BLOCK.get());
        simpleBlock(FFBlockRegistry.SILVER_BLOCK.get());
        simpleBlock(FFBlockRegistry.TIN_BLOCK.get());

        horizontalBlock(FFBlockRegistry.COMBINING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_COMBINING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_COMBINING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_COMBINING_MACHINE + "_top")
        );

        horizontalBlock(FFBlockRegistry.CRUSHING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRUSHING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRUSHING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRUSHING_MACHINE + "_top")
        );

        horizontalBlock(FFBlockRegistry.CRYSTALLIZING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRYSTALLIZING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRYSTALLIZING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_CRYSTALLIZING_MACHINE + "_top")
        );

        horizontalBlock(FFBlockRegistry.PULVERIZING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_PULVERIZING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_PULVERIZING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_PULVERIZING_MACHINE + "_top")
        );

        horizontalBlock(FFBlockRegistry.SMELTING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_SMELTING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_SMELTING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_SMELTING_MACHINE + "_top")
        );

        horizontalBlock(FFBlockRegistry.WASHING_MACHINE.get(),
                FuturisticFactories.location("block/" + REGISTRY_NAME_WASHING_MACHINE + "_side"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_WASHING_MACHINE + "_front"),
                FuturisticFactories.location("block/" + REGISTRY_NAME_WASHING_MACHINE + "_top")
        );

    }
}
