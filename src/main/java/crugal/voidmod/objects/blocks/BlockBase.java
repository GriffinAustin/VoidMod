package crugal.voidmod.objects.blocks;

import crugal.voidmod.Main;
import crugal.voidmod.init.BlockInit;
import crugal.voidmod.init.ItemInit;
import crugal.voidmod.proxy.CommonProxy;
import crugal.voidmod.util.interfaces.IHasModel;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase
  extends Block
  implements IHasModel
{
  public BlockBase(String name, Material material)
  {
    super(material);
    setUnlocalizedName(name);
    setRegistryName(name);
    setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    
    BlockInit.BLOCKS.add(this);
    ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(getRegistryName()));
    setCreativeTab(Main.tabVoid);
  }
  
  public void registerModels()
  {
    Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
  }
}
