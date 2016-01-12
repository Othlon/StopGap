package othlon.stopgap.backslab.vanilla;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;


public class SGBSVanilla {


    public static void okgo(boolean okStone, boolean okWood) {

       if(okStone) {
           Block[] stoneResults = {Blocks.stone,
                   Blocks.cobblestone,
                   Blocks.brick_block,
                   Blocks.stonebrick,
                   Blocks.nether_brick,
                   Blocks.quartz_block};

           int[] meta = {0, 3, 4, 5, 6, 7};

           for (int i = 0; i < meta.length; i++) {

               ItemStack slab = new ItemStack(Blocks.stone_slab, 1, meta[i]);
               ItemStack block = new ItemStack(stoneResults[i]);
               GameRegistry.addShapelessRecipe(block, slab, slab);

           }//for
       }
        if(okWood)
        {
            //WOODEN SLAB BACK
            for (int i = 0; i < 6; i++) {

                ItemStack woodSlab = new ItemStack(Blocks.wooden_slab, 1, i);
                ItemStack woodBlock = new ItemStack(Blocks.planks, 1, i);
                GameRegistry.addShapelessRecipe(woodBlock, woodSlab, woodSlab);
            }
        }

    }
}
