package othlon.stopgap;



import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class SGConfig {

    //class members

    public static boolean canMakeOwnRedstone;

    public static boolean canMakeOwnGlowstone;

    public static boolean canCraftClayBlock;

    public static boolean canCraftClayBalls;

    public static boolean canPanFlint;

    public static boolean canCraftFlintBlock = true;

    public static boolean canSpinString;

    public static boolean canUnslabWood;

    public static boolean canUnslabCobble;

    public static boolean canSticksSromSaplings;




    public static void configurating(File confile)
    {
        Configuration config = new Configuration(confile);



        config.load();

        canMakeOwnRedstone  = config.get("Do you want to be able to make: ",
                                         "DIY redstone",true,"").getBoolean(true);

        canMakeOwnGlowstone = config.get("Do you want to be able to make: ",
                                         "DIY glowstone",true,"").getBoolean(true);

        canCraftClayBlock   = config.get("Do you want to be able to make: ",
                                         "craft clay block ",true,"").getBoolean(true);

        canCraftClayBalls   = config.get("Do you want to be able to make: ",
                                         "clay block to clay balls ",true,"").getBoolean(true);

        canPanFlint         = config.get("Do you want to be able to make: ",
                                         "flint = water bucket + gravel",true,"").getBoolean(true);

       //  canCraftFlintBlock  = config.get("Do you want to be able to make: ",
                                         //"Flint Block",true,"").getBoolean(true);

        canSpinString       = config.get("Do you want to be able to make: ",
                                         "string = wool/stick/bowl ",true,"").getBoolean(true);

        canUnslabWood       = config.get("SLAB BACK!",
                                         "Wood: 2 slabs = orginal block ",true,"").getBoolean(true);

        canUnslabCobble     = config.get("SLAB BACK!",
                                         "Stone/Bricks: 2 slabs = orginal block ",true,"").getBoolean(true);
        canSticksSromSaplings     = config.get("Sticks From Saplings",
                "crafted sapling = 1 stick",true,"").getBoolean(true);

        if(config.hasChanged())config.save();
    }

}
