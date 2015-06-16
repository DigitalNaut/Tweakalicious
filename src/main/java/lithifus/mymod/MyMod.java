package lithifus.mymod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = MyMod.MODID, name = MyMod.MODNAME, version = MyMod.MODVER)
public class MyMod {
	public static final String MODID = "mymod";
	public static final String MODNAME = "My Mod";
	public static final String MODVER = "0.0.0";
	
	@Mod.Instance(MODID)
	public static MyMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
