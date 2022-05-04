package futuristicfactories.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public interface IFFMaterial {

    Material MATERIAL_ALUMINUM_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_COPPER_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_LEAD_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_NICKEL_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_SILVER_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_TIN_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_ALUMINUM_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_COPPER_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_LEAD_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_NICKEL_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_SILVER_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_TIN_BLOCK = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_MACHINE = new Material.Builder(MaterialColor.GRAY).build();


    static AbstractBlock.Properties oreProperties(Material material) {
        return AbstractBlock.Properties.create(material).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.STONE).hardnessAndResistance(3, 10);
    }

    static AbstractBlock.Properties machineProperties(Material material) {
        return AbstractBlock.Properties.create(material).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.METAL).hardnessAndResistance(4, 20);
    }

    static AbstractBlock.Properties blockProperties(Material material) {
        return AbstractBlock.Properties.create(material).harvestTool(ToolType.PICKAXE).harvestLevel(2).setRequiresTool().sound(SoundType.METAL).hardnessAndResistance(3, 10);
    }


}
