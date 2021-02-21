package com.AbdurrahmanRaza.ModTemplate.items.tools;

import com.AbdurrahmanRaza.ModTemplate.Main;
import com.AbdurrahmanRaza.ModTemplate.init.ItemInit;
import com.AbdurrahmanRaza.ModTemplate.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel 
{
	public ToolPickaxe(String name, ToolMaterial material)
	{
		super(material);
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
