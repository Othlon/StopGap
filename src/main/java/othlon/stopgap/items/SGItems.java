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

public class  SGItems {

public static Item ingotRed;
public static Item mixRed;
public static Item ingotGlow;
public static Item mixGlow;


    public static void init()
    {


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


            ItemStack flintStackA     = new ItemStack(Items.flint);
            ItemStack ironIngotStack  = new ItemStack(Items.iron_ingot);
            ItemStack sandStack       = new ItemStack(Blocks.sand);
            ItemStack redDyeStack     = new ItemStack(Items.dye, 1 ,1);


            ItemStack glowMixStack    = new ItemStack(mixGlow);
            ItemStack glowIngotStack  = new ItemStack(ingotGlow);
            ItemStack glowStoneStack  = new ItemStack(Items.glowstone_dust, 4);
            ItemStack glowBlockStack  = new ItemStack(Blocks.glowstone, 4);

            ItemStack flintStackB     = new ItemStack(Items.flint);
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
        ItemStack flintStackC        = new ItemStack(Items.flint);
       //ItemStack flintBlockStack   = new ItemStack(flintBlock);
        ItemStack gravelStack       = new ItemStack(Blocks.gravel);

        //uses waterBucketStack

        //Wool to string
        ItemStack woolStack         = new ItemStack(Blocks.wool);
        ItemStack stringStack       = new ItemStack(Items.string, 4);

        ItemStack bowlStack         = new ItemStack(Items.bowl);
        ItemStack stickStack        = new ItemStack(Items.stick);

        // slab back!
        //ItemStack woodSlabStack     = new ItemStack(Blocks.wooden_slab);
        //ItemStack woodStack         = new ItemStack(Blocks.planks);

       // ItemStack cobbleSlabStack    = new ItemStack(Blocks.stone_slab,1, 3);
       // ItemStack cobbleStack        = new ItemStack(Blocks.cobblestone);

       // ItemStack stoneSlabStack         = new ItemStack(Blocks.stone_slab,1,0);
        ItemStack sandstoneStack        = new ItemStack(Blocks.sandstone, 1,0);





/* REDSTONE RECIPES */
        if(SGConfig.canMakeOwnRedstone)
        {
	         //Making: red mixture
            GameRegistry.addShapelessRecipe(redMixStack,
                    flintStackA, ironIngotStack, sandStack, redDyeStack);

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
                flintStackB, goldIngotStack, soulSandStack, yellowDyeStack);

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
        GameRegistry.addShapedRecipe(flintStackC,
                "x","y",
                'x', gravelStack, 'y', waterBucketStack
        );

        //MAKING; flint block
       /* GameRegistry.addRecipe(flintBlock,
                "xxx",
                "xxx",
                "xxx",
                'x', flintStackC
        );*/
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
       Block[] results = {Blocks.stone,
                          Blocks.sandstone,
                          Blocks.cobblestone,
                          Blocks.brick_block,
                          Blocks.stonebrick,
                          Blocks.nether_brick,
                          Blocks.quartz_block};

        int[] meta ={0,1,3,4,5,6,7};

        for ( int i = 0; i < meta.length; i++){

            ItemStack slab = new ItemStack(Blocks.stone_slab,1, meta[i]);


            if(meta[i] == 1)
            { //if sandstone set meta data
                GameRegistry.addShapelessRecipe(sandstoneStack, slab, slab);
            }else{ //no meta needed for block
                GameRegistry.addShapelessRecipe(new ItemStack(results[i]), slab, slab);
            }

        }//for

    }//recipe book
}