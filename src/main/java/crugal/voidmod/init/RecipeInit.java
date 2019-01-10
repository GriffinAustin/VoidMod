package crugal.voidmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeInit
{
  public static void init()
  {
    GameRegistry.addSmelting(ItemInit.VOID_DUST, new ItemStack(ItemInit.VOID_INGOT, 1), 3.0F);
  }
}
