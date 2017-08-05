package com.moddy10.fuselesstnt.proxy;

import com.moddy10.fuselesstnt.FuselessTNT;
import com.moddy10.fuselesstnt.ModConfig;
import com.moddy10.fuselesstnt.blocks.BlockTNTFuseless;
import com.moddy10.fuselesstnt.init.ModBlocks;
import com.moddy10.fuselesstnt.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		config = new Configuration(e.getSuggestedConfigurationFile());
		ModConfig.readConfig();
	}

	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {
		if (config.hasChanged())
			config.save();
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> r = event.getRegistry();
		r.register(new BlockTNTFuseless().setHardness(0.0F).setRegistryName("fuseless_tnt")
				.setUnlocalizedName(FuselessTNT.MODID + ".fuseless_tnt"));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> r = event.getRegistry();
		ModBlocks.registerItemBlock(r, ModBlocks.fuseless_tnt);
	}

}
