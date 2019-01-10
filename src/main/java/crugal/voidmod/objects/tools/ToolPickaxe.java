package crugal.voidmod.objects.tools;

import crugal.voidmod.Main;
import crugal.voidmod.init.ItemInit;
import crugal.voidmod.proxy.CommonProxy;
import crugal.voidmod.util.interfaces.IHasModel;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe
  extends ItemPickaxe
  implements IHasModel
{
  public ToolPickaxe(String name, ToolMaterial material)
  {
    super(material);
    
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.MATERIALS);
    
    ItemInit.ITEMS.add(this);
    setCreativeTab(Main.tabVoid);
  }
  
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(this, 0, "inventory");
  }
}
