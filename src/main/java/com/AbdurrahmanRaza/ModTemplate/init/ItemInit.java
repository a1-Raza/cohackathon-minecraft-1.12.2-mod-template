package com.AbdurrahmanRaza.ModTemplate.init;

import java.util.ArrayList;
import java.util.List;

import com.AbdurrahmanRaza.ModTemplate.items.ItemBase;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item TEMPLATE_ITEM = new ItemBase("template_item");
}
