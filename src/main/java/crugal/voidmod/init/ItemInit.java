package crugal.voidmod.init;

import crugal.voidmod.objects.ItemBase;
import crugal.voidmod.objects.tools.ToolAxe;
import crugal.voidmod.objects.tools.ToolPickaxe;
import crugal.voidmod.objects.tools.ToolSpade;
import crugal.voidmod.objects.tools.ToolSword;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
  public static final List<Item> ITEMS = new ArrayList();
  public static final Item.ToolMaterial MATERIAL_VOID = EnumHelper.addToolMaterial("material_void", 3, 2048, 16.0F, 5.0F, 10);
  public static final Item VOID_WAND = new ItemBase("void_wand");
  public static final Item VOID_DUST = new ItemBase("void_dust");
  public static final Item VOID_INGOT = new ItemBase("void_ingot");
  public static final ItemSword VOID_SWORD = new ToolSword("void_sword", MATERIAL_VOID);
  public static final ItemSpade VOID_SHOVEL = new ToolSpade("void_shovel", MATERIAL_VOID);
  public static final ItemPickaxe VOID_PICKAXE = new ToolPickaxe("void_pickaxe", MATERIAL_VOID);
  public static final ItemAxe VOID_AXE = new ToolAxe("void_axe", MATERIAL_VOID);
}
