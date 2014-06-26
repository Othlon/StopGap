package othlon.stopgap.items;

/**
 * Created by Jen on 18/05/14.
 */

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;

import othlon.stopgap.SGConfig;
import othlon.stopgap.blocks.SGFlintBlock;

public class  SGItems {

public static Item ingotRed;
public static Item mixRed;
public static Item ingotGlow;
public static Item mixGlow;
public static Block blockFlint;


    public static void init()
    {

        blockFlint = new SGFlintBlock();
        GameRegistry.registerBlock(blockFlint, "stopgap:BlockFlint");


/* REDSTONE */
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

         OreDictionary.registerOre("ingotRedstone", ingotRed);

/* GLOWSTONE */
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

            OreDictionary.registerOre("ingotGlowstone", ingotGlow);


    }

    public static void recipebook()
    {
	    	/*~~~~~Ingredients for Recipes!~~~~~*/


            ItemStack redMixStack     = new ItemStack(mixRed);
            ItemStack redIngotStack   = new ItemStack(ingotRed);
            ItemStack redStoneStack   = new ItemStack(Items.redstone, 4);
            ItemStack redBlockStack   = new ItemStack(Blocks.redstone_block, 4);


            ItemStack flintStack      = new ItemStack(Items.flint);
            ItemStack ironIngotStack  = new ItemStack(Items.iron_ingot);
            ItemStack sandStack       = new ItemStack(Blocks.sand);
            ItemStack redDyeStack     = new ItemStack(Items.dye, 1 ,1);


            ItemStack glowMixStack    = new ItemStack(mixGlow);
            ItemStack glowIngotStack  = new ItemStack(ingotGlow);
            ItemStack glowStoneStack  = new ItemStack(Items.glowstone_dust, 4);
            ItemStack glowBlockStack  = new ItemStack(Blocks.glowstone, 4);

           //flint also used here
            ItemStack goldIngotStack  = new ItemStack(Items.gold_ingot);
            ItemStack soulSandStack   = new ItemStack(Blocks.soul_sand);
            ItemStack yellowDyeStack  = new ItemStack(Items.dye, 1 ,11);



        //clay shopping list
        ItemStack clayBallStack     = new ItemStack(Items.clay_ball, 4);
        ItemStack clayBlockStack    = new ItemStack(Blocks.clay);

        ItemStack dirtBlockStack    = new ItemStack(Blocks.dirt);
        ItemStack sandBlockStack    = new ItemStack(Blocks.sand);
        ItemStack waterBucketStack  = new ItemStack(Items.water_bucket);

        //flint stacks
        ItemStack flintsStack       = new ItemStack(Items.flint, 9);
        ItemStack flintBlockStack   = new ItemStack(blockFlint);
        ItemStack gravelStack       = new ItemStack(Blocks.gravel);

        //uses waterBucketStack

        //Wool to string
        ItemStack woolStack         = new ItemStack(Blocks.wool);
        ItemStack stringStack       = new ItemStack(Items.string, 4);

        ItemStack bowlStack         = new ItemStack(Items.bowl);
        ItemStack stickStack        = new ItemStack(Items.stick);





/* REDSTONE RECIPES */
        if(SGConfig.canMakeOwnRedstone)
        {
	         //Making: red mixture
            GameRegistry.addShapelessRecipe(redMixStack,
                    flintStack, ironIngotStack, sandStack, redDyeStack);

            //Making: red ingot
             GameRegistry.addSmelting(mixRed, redIngotStack, 0.2f );

             //Making: Redstone dust
            GameRegistry.addShapelessRecipe(redStoneStack,
                redIngotStack);

            //Making: Redstone Block
            GameRegistry.addRecipe(redBlockStack,
                "xxx",
                "xxx",
                "xxx",
                'x', redIngotStack);
        }
/* GLOWSTONE RECIPES */
        if(SGConfig.canMakeOwnGlowstone)
        //Making: Glow Mixture
        GameRegistry.addShapelessRecipe(glowMixStack,
                flintStack, goldIngotStack, soulSandStack, yellowDyeStack);

        //Making: Glow Ingot
        GameRegistry.addSmelting(mixGlow,
                glowIngotStack, 0.2f);

        //Making: Glowstone Dust
        GameRegistry.addShapelessRecipe(glowStoneStack,
                glowIngotStack);

        //Making:Glowstone block
        GameRegistry.addRecipe(glowBlockStack,
                "xx",
                "xx",
                'x', glowIngotStack);


/* CLAY RECIPES */
        if(SGConfig.canCraftClayBlock)
        {
            //Making: clay block
            GameRegistry.addRecipe(clayBlockStack,
                "xxy",
                "xzy",
                "xyy",
                'x', dirtBlockStack,
                'y', sandBlockStack,
                'z', waterBucketStack);
        }

        if(SGConfig.canCraftClayBalls)
        {
            //Making: clay balls
            GameRegistry.addShapelessRecipe(clayBallStack,
                clayBlockStack);
        }
/* FLINT RECIPES */

        //Making: flint from gravel and water
        GameRegistry.addShapedRecipe(flintStack,
                "x","y",
                'x', gravelStack, 'y', waterBucketStack
        );

        //MAKING; flint block
        GameRegistry.addRecipe(flintBlockStack,
                "xxx",
                "xxx",
                "xxx",
                'x', flintStack
        );

        //making: flint from block
        GameRegistry.addRecipe(flintsStack, flintBlockStack);


/* WOOL AND STRING RECIPES */

        //Making: wool back to string
        GameRegistry.addShapedRecipe(stringStack,
                "x",
                "y",
                "z",
                'x', woolStack,
                'y', stickStack,
                'z', bowlStack
                );
/* SLAB BACK BITCHES */
       Block[] stoneResults = {Blocks.stone,
                          Blocks.cobblestone,
                          Blocks.brick_block,
                          Blocks.stonebrick,
                          Blocks.nether_brick,
                          Blocks.quartz_block};

        int[] meta ={0,3,4,5,6,7};

        for ( int i = 0; i < meta.length; i++){

            ItemStack slab = new ItemStack(Blocks.stone_slab,1, meta[i]);
            ItemStack block = new ItemStack(stoneResults[i]);
            GameRegistry.addShapelessRecipe(block, slab, slab);

        }//for
        //WOODEN SLAB BACK
       for( int i = 0; i < 6; i++){

           ItemStack woodSlab = new ItemStack(Blocks.wooden_slab, 1, i);
           ItemStack woodBlock = new ItemStack(Blocks.planks,1, i);
           GameRegistry.addShapelessRecipe(woodBlock, woodSlab, woodSlab);
       }
    }//recipe book
}