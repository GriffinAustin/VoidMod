package crugal.voidmod.objects.blocks;

import crugal.voidmod.Main;
import crugal.voidmod.init.ItemInit;
import java.util.Random;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockVoidEssenceOre
  extends BlockBase
{
  public BlockVoidEssenceOre(String name, Material material)
  {
    super(name, material);
    
    setSoundType(SoundType.METAL);
    setHardness(10.0F);
    setResistance(30.0F);
    setHarvestLevel("pickaxe", 3);
    setLightLevel(1.0F);
    setCreativeTab(Main.tabVoid);
  }
  
  public Item func_180660_a(IBlockState state, Random rand, int fortune)
  {
    return ItemInit.VOID_DUST;
  }
  
  public int func_149745_a(Random rand)
  {
    int max = 2;
    int min = 1;
    return rand.nextInt(max) + min;
  }
}
