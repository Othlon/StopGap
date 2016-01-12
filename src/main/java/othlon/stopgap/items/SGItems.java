package othlon.stopgap.items;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;

import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import othlon.stopgap.SGConfig;
import othlon.stopgap.blocks.SGFlintBlock;

public class  SGItems {

public static Item  ingotRed;
public static Item  mixRed;
public static Item  ingotGlow;
public static Item  mixGlow;
public static Block blockFlint;


    public static void init()
    {

        blockFlint = new SGFlintBlock();


        GameRegistry.registerBlock(blockFlint, "stopgap:BlockFlint");


         /* REDSTONE */
        if(SGConfig.canMakeOwnRedstone) {
            ingotRed = new SGIngot()
                    .setUnlocalizedName("Red Ingot")
                    .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                    .setTextureName("stopgap:red_ingot");

            GameRegistry.registerItem(ingotRed, "stopgap:ingotRed");

            mixRed = new SGMixture()
                    .setUnlocalizedName("Red Mixture")
                    .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                    .setTextureName("stopgap:red_mix");
            GameRegistry.registerItem(mixRed, "mixRed");

            OreDictionary.registerOre("ingotRedstone", ingotRed);
        }

/* GLOWSTONE */
        if(SGConfig.canMakeOwnGlowstone) {
            ingotGlow = new SGIngot()
                    .setUnlocalizedName("Glow Ingot")
                    .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                    .setTextureName("stopgap:glow_ingot");
            GameRegistry.registerItem(ingotGlow, "ingotGlow");

            mixGlow = new SGMixture()
                    .setUnlocalizedName("Glow Mixture")
                    .setCreativeTab(othlon.stopgap.StopGap.getCreativeTab())
                    .setTextureName("stopgap:glow_mix");
            GameRegistry.registerItem(mixGlow, "mixGlow");

            OreDictionary.registerOre("ingotGlowstone", ingotGlow);

        }
   }// init

   public static void recipebook()
   {
	    	/*~~~~~Ingredients for Recipes!~~~~~*/


            ItemStack redMixStack    = new ItemStack(mixRed);
            ItemStack redIngotStack  = new ItemStack(ingotRed);

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
        ItemStack clayBlocksStack    = new ItemStack(Blocks.clay, 4);

        ItemStack dirtBlockStack    = new ItemStack(Blocks.dirt);
        ItemStack sandBlockStack    = new ItemStack(Blocks.sand);
        ItemStack waterBucketStack  = new ItemStack(Items.water_bucket);

        //flint stacks
        ItemStack flintsStack       = new ItemStack(Items.flint, 9);
        ItemStack flintBlockStack   = new ItemStack(blockFlint);
        ItemStack gravelStack       = new ItemStack(Blocks.gravel);

        //uses waterBucketStack

        //Wool to string
        ItemStack woolStack         = new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE);
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
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(redStoneStack, "ingotRedstone"));

            //Making: Redstone Block
            GameRegistry.addRecipe(
                    new ShapedOreRecipe(redBlockStack,
                "xxx",
                "xxx",
                "xxx",
                'x', "ingotRedstone"));
        }
/* GLOWSTONE RECIPES */
        if(SGConfig.canMakeOwnGlowstone) {
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
        }

/* CLAY RECIPES */
        if(SGConfig.canCraftClayBlock)
        {
            //Making: clay block
            GameRegistry.addRecipe(clayBlocksStack,
                "xxy",
                "xzy",
                "xyy",
                'x', dirtBlockStack,
                'y', sandBlockStack,
                'z', waterBucketStack);

            GameRegistry.addRecipe(clayBlocksStack,
                    "xxy",
                    "xzy",
                    "xyy",
                    'x', sandBlockStack,
                    'y', dirtBlockStack,
                    'z', waterBucketStack);
        }

        if(SGConfig.canCraftClayBalls)
        {
            //Making: clay balls
            GameRegistry.addShapelessRecipe(clayBallStack,
                clayBlockStack);
        }
/* FLINT RECIPES */
        if(SGConfig.canPanFlint) {
            //Making: flint from gravel and water
            GameRegistry.addShapedRecipe(flintStack,
                    "x", "y",
                    'x', gravelStack, 'y', waterBucketStack
            );
        }

       if(SGConfig.canCraftFlintBlock) {
           //MAKING; flint block
           GameRegistry.addRecipe(flintBlockStack,
                   "xxx",
                   "xxx",
                   "xxx",
                   'x', flintStack
           );


        //making: flint from block
        GameRegistry.addShapelessRecipe(flintsStack, flintBlockStack);
       }

/* WOOL AND STRING RECIPES */
        if(SGConfig.canSpinString) {
            //Making: wool back to string
            GameRegistry.addRecipe(new ShapedOreRecipe(stringStack,
                    "x",
                    "y",
                    "z",
                    'x', woolStack,
                    'y', "stickWood",
                    'z', bowlStack
            ));
        }
//SAPLING STICKS

       if(SGConfig.canSticksSromSaplings) {

               GameRegistry.addRecipe(new ShapelessOreRecipe(stickStack, "treeSapling"));

       }

//NETHER WART?
   }//recipe book
}//end class