package crugal.voidmod.init;

import crugal.voidmod.objects.blocks.BlockVoidEssenceOre;
import crugal.voidmod.objects.blocks.BlockVoidPrism;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
  public static final List<Block> BLOCKS = new ArrayList();
  public static final Block VOID_PRISM_BLOCK = new BlockVoidPrism("void_prism_block", Material.IRON);
  public static final Block VOID_ESSENCE_ORE = new BlockVoidEssenceOre("void_essence_ore", Material.IRON);
}
