package com.AbdurrahmanRaza.ModTemplate.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit 
{
	
	public static void init() {
		GameRegistry.addSmelting(BlockInit.TEMPLATE_BLOCK, new ItemStack(ItemInit.TEMPLATE_ITEM, 4), 1.0f);
	}
	
}
