package crugal.voidmod.world;

import crugal.voidmod.init.BlockInit;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen
  implements IWorldGenerator
{
  int chunkSize = 16;
  
  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
  {
    if (world.provider.getDimension() == 0) {
      generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }
  
  private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
  {
    int minCluster = 1;
    int maxCluster = 3;
    
    generateOre(BlockInit.VOID_ESSENCE_ORE.getDefaultState(), world, random, chunkX * this.chunkSize, chunkZ * this.chunkSize, 8, 64, random.nextInt(maxCluster) + minCluster, 64);
  }
  
  private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
  {
    int deltaY = maxY - minY;
    for (int i = 0; i < chances; i++)
    {
      BlockPos pos = new BlockPos(x + random.nextInt(this.chunkSize), minY + random.nextInt(deltaY), z + random.nextInt(this.chunkSize));
      WorldGenMinable generator = new WorldGenMinable(ore, size);
      
      generator.generate(world, random, pos);
    }
  }
}
