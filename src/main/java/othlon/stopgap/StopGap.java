package othlon.stopgap;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import net.minecraft.creativetab.CreativeTabs;
import othlon.stopgap.items.SGTab;


@SuppressWarnings("ClassNamePrefixedWithPackageName")
@Mod(modid = StopGap.MODID, name = StopGap.MODNAME, version = StopGap.VERSION )
public class StopGap {

    public static final String MODID   = "StopGap";
    public static final String MODNAME = "StopGap";
    public static final String VERSION = "2.0.5";

    private static CreativeTabs stopGapTab = new SGTab(CreativeTabs.getNextID(),MODID );

    public static CreativeTabs getCreativeTab()
    {
        return stopGapTab;
    }


    @Mod.EventHandler
    public static void preInit( FMLPreInitializationEvent event)
    {

        SGConfig.configurating(event.getSuggestedConfigurationFile());
        othlon.stopgap.backslab.vanilla.SGBSVanilla.okgo(SGConfig.canUnslabCobble, SGConfig.canUnslabWood);
        othlon.stopgap.items.SGItems.init();
        othlon.stopgap.items.SGItems.recipebook();

    }//end pre init
}//StopGap
