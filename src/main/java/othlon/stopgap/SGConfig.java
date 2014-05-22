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


    public initConf(Configuration config)
    {
        Configuration.get();
    }

}
