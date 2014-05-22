package othlon.stopgap;

/**
 * Created by Jen on 20/05/14.
 */

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

public class SGConfig {

    //class members

    public static boolean canMakeOwnRedstone;

    public static boolean canMakeOwnGlowstone;

    public static boolean canCraftClayBlock;

    public static boolean canCraftClayBalls;


    public static void configurating(File confile)
    {
        Configuration config = new Configuration(confile);

        if(config.hasChanged())config.save();

        config.load();

        canMakeOwnRedstone  = config.get("Do you want to be able to make"," your own redstone?",true,"").getBoolean(true);
        canMakeOwnGlowstone = config.get("Do you want to be able to make"," your own glowstone?",true,"").getBoolean(true);
        canCraftClayBlock   = config.get("Do you want to be able to make"," blocks of clay?",true,"").getBoolean(true);
        canCraftClayBalls   = config.get("Do you want to be able to make"," balls of clay from crafting a block of clay?",true,"").getBoolean(true);
    }

}
