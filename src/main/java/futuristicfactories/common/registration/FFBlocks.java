package futuristicfactories.common.registration;

import futuristicfactories.common.block.IFFMaterial;
import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static futuristicfactories.FuturisticFactories.MODID;

@ObjectHolder(MODID)
public class FFBlocks implements IFFRegistry<Block> {
    private static final Logger LOGGER = LogManager.getLogger();
    @ObjectHolder(BLOCK_ORE_COPPER)
    public static Block blockOreCopper;

    @ObjectHolder(BLOCK_ORE_TIN)
    public static Block blockOreTin;

    @ObjectHolder(BLOCK_ORE_OSMIUM)
    public static Block blockOreOsmium;

    @ObjectHolder(BLOCK_ORE_LEAD)
    public static Block blockOreLead;

    @ObjectHolder(BLOCK_COPPER)
    public static Block blockCopper;

    @ObjectHolder(BLOCK_TIN)
    public static Block blockTin;

    @ObjectHolder(BLOCK_OSMIUM)
    public static Block blockOsmium;

    @ObjectHolder(BLOCK_LEAD)
    public static Block blockLead;

    @Override
    public void init() {
        LOGGER.info("Initializing blocks");
        blockOreCopper = new Block(Block.Properties.create(IFFMaterial.MATERIAL_COPPER_ORE)).setRegistryName(BLOCK_ORE_COPPER);
        blockOreTin = new Block(Block.Properties.create(IFFMaterial.MATERIAL_TIN_ORE)).setRegistryName(BLOCK_ORE_TIN);
        blockOreOsmium = new Block(Block.Properties.create(IFFMaterial.MATERIAL_OSMIUM_ORE)).setRegistryName(BLOCK_ORE_OSMIUM);
        blockOreLead = new Block(Block.Properties.create(IFFMaterial.MATERIAL_LEAD_ORE)).setRegistryName(BLOCK_ORE_LEAD);
        blockCopper = new Block(Block.Properties.create(IFFMaterial.MATERIAL_COPPER)).setRegistryName(BLOCK_COPPER);
        blockTin = new Block(Block.Properties.create(IFFMaterial.MATERIAL_TIN)).setRegistryName(BLOCK_TIN);
        blockOsmium = new Block(Block.Properties.create(IFFMaterial.MATERIAL_OSMIUM)).setRegistryName(BLOCK_OSMIUM);
        blockLead = new Block(Block.Properties.create(IFFMaterial.MATERIAL_LEAD)).setRegistryName(BLOCK_LEAD);
        LOGGER.info("Initializing blocks done");
    }

    @Override
    public void register(IForgeRegistry<Block> registry) {
        init();
        LOGGER.info("Registering blocks");
        registry.register(blockOreCopper);
        registry.register(blockOreTin);
        registry.register(blockOreOsmium);
        registry.register(blockOreLead);
        registry.register(blockCopper);
        registry.register(blockTin);
        registry.register(blockOsmium);
        registry.register(blockLead);
        LOGGER.info("Registering blocks done");
    }
}
