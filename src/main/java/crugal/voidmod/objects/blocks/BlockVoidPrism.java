package crugal.voidmod.objects.blocks;

import crugal.voidmod.Main;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockVoidPrism
  extends BlockBase
{
  public BlockVoidPrism(String name, Material material)
  {
    super(name, material);
    
    setSoundType(SoundType.METAL);
    setHardness(10.0F);
    setResistance(30.0F);
    setHarvestLevel("pickaxe", 3);
    setLightLevel(1.0F);
    setCreativeTab(Main.tabVoid);
  }
}
