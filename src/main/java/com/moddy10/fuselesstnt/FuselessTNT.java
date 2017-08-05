package com.moddy10.fuselesstnt;

import org.apache.logging.log4j.Logger;

import com.moddy10.fuselesstnt.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = FuselessTNT.MODID, name = FuselessTNT.NAME, version = FuselessTNT.VERSION, useMetadata = true)
public class FuselessTNT {

	public static final String MODID = "fuselesstnt";
	public static final String NAME = "Fuseless TNT";
	public static final String VERSION = "1.0.0";

	@SidedProxy(serverSide = "com.moddy10.fuselesstnt.proxy.CommonProxy", clientSide = "com.moddy10.fuselesstnt.proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static FuselessTNT instance;

	public static Logger logger;

	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		logger = e.getModLog();
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public static void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}
