package crugal.voidmod.objects;

import crugal.voidmod.Main;
import crugal.voidmod.init.ItemInit;
import crugal.voidmod.proxy.CommonProxy;
import crugal.voidmod.util.interfaces.IHasModel;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase
  extends Item
  implements IHasModel
{
  public ItemBase(String name)
  {
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.MATERIALS);
    
    ItemInit.ITEMS.add(this);
    //setCreativeTab(Main.tabVoid); // CHECK
  }
  
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
  }
}
