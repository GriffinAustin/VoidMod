package crugal.voidmod.util.handlers;

import net.minecraft.util.IStringSerializable;

public class EnumHandler
{
  public static enum EnumType
    implements IStringSerializable
  {
    VOID_ESSENCE_ORE(0, "void_essence_ore"),  VOID_PRISM_BLOCK(1, "void_prism_block");
    
    private static final EnumType[] META_LOOKUP;
    private final int meta;
    private final String name;
    private final String unlocializedName;
    
    private EnumType(int meta, String name)
    {
      this(meta, name, name);
    }
    
    private EnumType(int meta, String name, String unlocializedName)
    {
      this.meta = meta;
      this.name = name;
      this.unlocializedName = unlocializedName;
    }
    
    public String func_176610_l()
    {
      return this.name;
    }
    
    public int getMeta()
    {
      return this.meta;
    }
    
    public String getUnlocializedName()
    {
      return this.unlocializedName;
    }
    
    public String toString()
    {
      return this.name;
    }
    
    public static EnumType byMetadata(int meta)
    {
      return META_LOOKUP[meta];
    }
    
    static
    {
      META_LOOKUP = new EnumType[values().length];
      for (EnumType enumtype : values()) {
        META_LOOKUP[enumtype.getMeta()] = enumtype;
      }
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
  }
}
