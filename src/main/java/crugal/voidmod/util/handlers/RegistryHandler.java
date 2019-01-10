package crugal.voidmod.util.handlers;

import crugal.voidmod.init.BlockInit;
import crugal.voidmod.init.ItemInit;
import crugal.voidmod.util.interfaces.IHasModel;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@Mod.EventBusSubscriber
public class RegistryHandler
{
  @SubscribeEvent
  public static void onItemRegister(RegistryEvent.Register<Item> event)
  {
    //event.getRegistry().registerAll((IForgeRegistryEntry[])ItemInit.ITEMS.toArray(new Item[0]));
    event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
  }
  
  @SubscribeEvent
  public static void onBlockRegister(RegistryEvent.Register<Block> event)
  {
    //event.getRegistry().registerAll((IForgeRegistryEntry[])BlockInit.BLOCKS.toArray(new Block[0]));
	  event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
  }
  
  @SubscribeEvent
  public static void onModelRegister(ModelRegistryEvent event)
  {
    for (Item item : ItemInit.ITEMS) {
      if ((item instanceof IHasModel)) {
        ((IHasModel)item).registerModels();
      }
    }
    for (Block block : BlockInit.BLOCKS) {
      if ((block instanceof IHasModel)) {
        ((IHasModel)block).registerModels();
      }
    }
  }
}
