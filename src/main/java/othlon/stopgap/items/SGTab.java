package othlon.stopgap.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SGTab extends CreativeTabs{

    public SGTab(int id, String modid)
    {
        super(id, modid);

    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(SGItems.blockFlint);
    }
}
