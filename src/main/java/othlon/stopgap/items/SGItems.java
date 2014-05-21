package othlon.stopgap.items;

/**
 * Created by Jen on 18/05/14.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;
import othlon.stopgap.StopGap;


public class SGItems {


public static Item ingotRed;
public static Item mixRed;
public static Item ingotGlow;
public static Item mixGlow;


    public static void init()
    {

        /* redstone stuff */
        ingotRed = new SGIngot()
                .setUnlocalizedName("Red Ingot")
                .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                .setTextureName("stopgap:red_ingot");

        GameRegistry.registerItem(ingotRed, "stopgap:ingotRed");

        mixRed   = new SGMixture()
                .setUnlocalizedName("Red Mixture")
                .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                .setTextureName("stopgap:red_mix");
        GameRegistry.registerItem(mixRed, "mixRed");


        /* Glowstone stuff*/
        ingotGlow = new SGIngot()
                 .setUnlocalizedName("Glow Ingot")
                .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                 .setTextureName("stopgap:glow_ingot");
        GameRegistry.registerItem(ingotGlow, "ingotGlow");

        mixGlow   = new SGMixture()
                .setUnlocalizedName("Glow Mixture")
                .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                .setTextureName("stopgap:glow_mix");
        GameRegistry.registerItem(mixGlow, "mixGlow");

        /* ore dictionary */
        OreDictionary.registerOre("ingotRedstone", ingotRed);

        OreDictionary.registerOre("ingotGlowstone", ingotGlow);

        //init items

    }

    public static void recipebook()
    {
        //ingredients.init();//red_mixture,red_ingot,yell_mixture,yell_ingot);
	    	/*~~~~~Ingredients for Recipes!~~~~~*/

        // Item Stacks to make Red Mixture
        // recipe result stack
        ItemStack redmix_Stack     = new ItemStack(mixRed);
        ItemStack redingot_Stack   = new ItemStack(ingotRed);
        ItemStack redstone_Stack   = new ItemStack(Items.redstone, 4);
        ItemStack redblock_Stack   = new ItemStack(Blocks.redstone_block, 4);

        // recipe shopping list!
        ItemStack flint_Stack      = new ItemStack(Items.flint);
        ItemStack ironingot_Stack  = new ItemStack(Items.iron_ingot);
        ItemStack sand_Stack       = new ItemStack(Blocks.sand);
        ItemStack reddye_Stack     = new ItemStack(Items.dye, 1 ,1);

        // Item Stacks to make Yellow Mixture
        // recipe result stack
        ItemStack glowmix_Stack    = new ItemStack(mixGlow);
        ItemStack glowingot_Stack  = new ItemStack(ingotGlow);
        ItemStack glowstone_Stack  = new ItemStack(Items.glowstone_dust, 4);
        ItemStack glowblock_Stack  = new ItemStack(Blocks.glowstone, 4);


        // recipe shopping list!
        //ItemStack flint_Stack    = new ItemStack(Item.flint);// stack all ready set
        ItemStack goldingot_Stack  = new ItemStack(Items.gold_ingot);
        ItemStack soulsand_Stack   = new ItemStack(Blocks.soul_sand);
        ItemStack yelldye_Stack    = new ItemStack(Items.dye, 1 ,11);

        //clay shopping list
        ItemStack clayblock_stack   = new ItemStack(Blocks.clay);
        ItemStack clayglob_stack    = new ItemStack(Items.clay_ball, 4);

        ItemStack dirtblock_stack   = new ItemStack(Blocks.dirt);
        ItemStack sandblock_stack   = new ItemStack(Blocks.sand);
        ItemStack waterbucket_stack = new ItemStack(Items.water_bucket);

	    	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	        /*~~~~~ Stop Gap Recipe Book ~~~~~*/

	    //Making: red mixture
        GameRegistry.addShapelessRecipe(redmix_Stack,
                flint_Stack, ironingot_Stack, sand_Stack, reddye_Stack);

        //Making: red ingot
        GameRegistry.addSmelting(mixRed,
                redingot_Stack, 0.2f );

        //Making: Redstone dust
        GameRegistry.addShapelessRecipe(redstone_Stack,
                redingot_Stack);

        //Making: Redstone Block
        GameRegistry.addRecipe(redblock_Stack,
                "xxx",
                "xxx",
                "xxx",
                'x', redingot_Stack);


        //Making: Glow Mixture
        GameRegistry.addShapelessRecipe(glowmix_Stack,
                flint_Stack, goldingot_Stack, soulsand_Stack, yelldye_Stack);

        //Making: Glow Ingot
        GameRegistry.addSmelting(mixGlow,
                glowingot_Stack, 0.2f);

        //Making: Glowstone Dust
        GameRegistry.addShapelessRecipe(glowstone_Stack,
                glowingot_Stack);

        //Making:Glowstone block
        GameRegistry.addRecipe(glowblock_Stack,
                "xx",
                "xx",
                'x', glowingot_Stack);

        /* CLAY RECIPES */

        //Making: clay block
        GameRegistry.addRecipe(clayblock_stack,
                "xxy",
                "xzy",
                "xyy",
                'x', dirtblock_stack,
                'y', sandblock_stack,
                'z', waterbucket_stack);

        //Making: clay globs
        GameRegistry.addShapelessRecipe(clayglob_stack,
                clayblock_stack);



    }
}