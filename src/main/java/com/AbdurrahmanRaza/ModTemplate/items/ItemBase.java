package com.AbdurrahmanRaza.ModTemplate.items;

import com.AbdurrahmanRaza.ModTemplate.Main;
import com.AbdurrahmanRaza.ModTemplate.init.ItemInit;
import com.AbdurrahmanRaza.ModTemplate.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.templatetab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}