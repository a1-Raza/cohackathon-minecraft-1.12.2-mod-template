package com.AbdurrahmanRaza.ModTemplate.tabs;

import com.AbdurrahmanRaza.ModTemplate.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TemplateTab extends CreativeTabs
{
	public TemplateTab(String label)
	{
		super("templatetab");
		this.setBackgroundImageName("templatetab.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.TEMPLATE_ITEM);
	}
}
