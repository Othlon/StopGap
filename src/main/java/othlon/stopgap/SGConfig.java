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


    public static void void configurating(File confile)
    {
        Configuration config = new Configuration(confile);
        config.load();

        canMakeOwnRedstone  = config.get("","",true,"").getBoolean();
        canMakeOwnGlowstone = config.get("","",true,"").getBoolean();
        canCraftClayBlock   = config.get("","",true,"").getBoolean();
        canCraftClayBalls   = config.get("","",true,"").getBoolean();
    }

}
