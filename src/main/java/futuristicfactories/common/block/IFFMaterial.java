package futuristicfactories.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public interface IFFMaterial {

    Material MATERIAL_COPPER_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_TIN_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_OSMIUM_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_LEAD_ORE = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_COPPER = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_TIN = new Material.Builder(MaterialColor.GRAY).build();
    Material MATERIAL_OSMIUM = new Material.Builder(MaterialColor.RED).build();
    Material MATERIAL_LEAD = new Material.Builder(MaterialColor.GRAY).build();

}
