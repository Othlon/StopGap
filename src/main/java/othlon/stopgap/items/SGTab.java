package othlon.stopgap.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jen on 19/05/14.
 */
public class SGTab extends CreativeTabs{

    public SGTab(int id, String modid)
    {
        super(id, modid);

    }

    @Override
    public Item getTabIconItem()
    {
        return SGItems.mixRed;
    }
}
