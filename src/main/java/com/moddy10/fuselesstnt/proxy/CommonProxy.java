package com.moddy10.fuselesstnt.proxy;

import com.moddy10.fuselesstnt.FuselessTNT;
import com.moddy10.fuselesstnt.blocks.BlockTNTFuseless;
import com.moddy10.fuselesstnt.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
	}

	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {
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
