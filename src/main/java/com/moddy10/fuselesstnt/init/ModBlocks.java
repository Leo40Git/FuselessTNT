package com.moddy10.fuselesstnt.init;

import com.moddy10.fuselesstnt.FuselessTNT;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	@GameRegistry.ObjectHolder(FuselessTNT.MODID + ":fuseless_tnt")
	public static Block fuseless_tnt;
	
	public static void registerItemBlock(IForgeRegistry<Item> itemRegistry, Block block) {
		Item item = new ItemBlock(block).setRegistryName(block.getRegistryName());
		itemRegistry.register(item);
		ModItems.initModel(item);
	}

}
