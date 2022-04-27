package futuristicfactories.common.registration;

import futuristicfactories.common.block.IFFMaterial;
import futuristicfactories.common.registry.IFFRegistry;
import net.minecraft.block.AbstractBlock;
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
    @ObjectHolder(BLOCK_ORE_LEAD)
    public static Block blockOrLead;
    @ObjectHolder(BLOCK_ORE_NICKEL)
    public static Block blockOreNickel;
    @ObjectHolder(BLOCK_ORE_SILVER)
    public static Block blockOreSilver;
    @ObjectHolder(BLOCK_ORE_TIN)
    public static Block blockOreTin;
    @ObjectHolder(BLOCK_COPPER)
    public static Block blockCopper;
    @ObjectHolder(BLOCK_LEAD)
    public static Block blockLead;
    @ObjectHolder(BLOCK_NICKEL)
    public static Block blockNickel;
    @ObjectHolder(BLOCK_SILVER)
    public static Block blockSilver;
    @ObjectHolder(BLOCK_TIN)
    public static Block blockTin;


    @Override
    public void init() {
        LOGGER.info("Initializing blocks");

        blockOreCopper = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_ORE_COPPER)).setRegistryName(BLOCK_ORE_COPPER);
        blockOrLead = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_ORE_LEAD)).setRegistryName(BLOCK_ORE_LEAD);
        blockOreNickel = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_ORE_NICKEL)).setRegistryName(BLOCK_ORE_NICKEL);
        blockOreSilver = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_ORE_SILVER)).setRegistryName(BLOCK_ORE_SILVER);
        blockOreTin = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_ORE_TIN)).setRegistryName(BLOCK_ORE_TIN);
        blockCopper = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_COPPER)).setRegistryName(BLOCK_COPPER);
        blockLead = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_LEAD)).setRegistryName(BLOCK_LEAD);
        blockNickel = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_NICKEL)).setRegistryName(BLOCK_NICKEL);
        blockSilver = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_SILVER)).setRegistryName(BLOCK_SILVER);
        blockTin = new Block(AbstractBlock.Properties.create(IFFMaterial.MATERIAL_BLOCK_TIN)).setRegistryName(BLOCK_TIN);


        LOGGER.info("Initializing blocks done");
    }

    @Override
    public void register(IForgeRegistry<Block> registry) {
        init();
        LOGGER.info("Registering blocks");

        registry.register(blockOreCopper);
        registry.register(blockOrLead);
        registry.register(blockOreNickel);
        registry.register(blockOreSilver);
        registry.register(blockOreTin);
        registry.register(blockCopper);
        registry.register(blockLead);
        registry.register(blockNickel);
        registry.register(blockSilver);
        registry.register(blockTin);

        LOGGER.info("Registering blocks done");
    }
}
