package crugal.voidmod;

import crugal.voidmod.init.ItemInit;
import crugal.voidmod.init.RecipeInit;
import crugal.voidmod.proxy.CommonProxy;
import crugal.voidmod.world.ModWorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid="vm", name="VoidMod", version="1.0", acceptedMinecraftVersions="[1.12.2]")
public class Main
{
  @Mod.Instance
  public static Main instance;
  @SidedProxy(clientSide="crugal.voidmod.proxy.ClientProxy", serverSide="crugal.voidmod.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.EventHandler
  public static void PreInit(FMLPreInitializationEvent event)
  {
    RecipeInit.init();
    GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
  }
  
  public static CreativeTabs tabVoid = new CreativeTabs("tab_void")
  {
	
	@Override
    public ItemStack getTabIconItem()
    {
      return new ItemStack(ItemInit.VOID_DUST);
    }
  };
  
  @Mod.EventHandler
  public static void init(FMLInitializationEvent event) {}
  
  @Mod.EventHandler
  public static void PostInit(FMLPostInitializationEvent event) {}
}
