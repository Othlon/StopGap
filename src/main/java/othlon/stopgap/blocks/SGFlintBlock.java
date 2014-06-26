package othlon.stopgap.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import othlon.stopgap.StopGap;

/**
 * Created by Jen on 26/06/2014.
 */
public class SGFlintBlock extends Block{

    IIcon face;
    public SGFlintBlock() {
        super(Material.anvil);
        this.setHarvestLevel("pickaxe", 0);
        this.setStepSound(soundTypeMetal);
        this.setBlockName("Flint Block");
        this.setCreativeTab(StopGap.getCreativeTab());
        this.setHardness(2.0f);
        this.setResistance(5.0f);
    }

    @Override
    public void registerBlockIcons(IIconRegister flintblock) {
        face = flintblock.registerIcon("stopgap:flint_block");

    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return face;
    }


}
