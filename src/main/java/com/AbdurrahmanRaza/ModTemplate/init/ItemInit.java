package com.AbdurrahmanRaza.ModTemplate.init;

import java.util.ArrayList;
import java.util.List;

import com.AbdurrahmanRaza.ModTemplate.items.ItemBase;
import com.AbdurrahmanRaza.ModTemplate.items.armor.ArmorBase;
import com.AbdurrahmanRaza.ModTemplate.items.tools.ToolAxe;
import com.AbdurrahmanRaza.ModTemplate.items.tools.ToolHoe;
import com.AbdurrahmanRaza.ModTemplate.items.tools.ToolPickaxe;
import com.AbdurrahmanRaza.ModTemplate.items.tools.ToolShovel;
import com.AbdurrahmanRaza.ModTemplate.items.tools.ToolSword;
import com.AbdurrahmanRaza.ModTemplate.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	//Materials for Tools and Armor
	public static final ToolMaterial TOOLS_TEMPLATE_ITEM = EnumHelper.addToolMaterial("tools_template_item", 2, 250, 6.0F, 2.0F, 14);
	public static final ArmorMaterial ARMOR_TEMPLATE_ITEM = EnumHelper.addArmorMaterial("armor_template_item", Reference.MOD_ID + ":template_item", 8, 
			new int[] {5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	//EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability)
	//EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability, soundOnEquip, toughness)
	
	//Items
	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item TEMPLATE_ITEM = new ItemBase("template_item");
	
	
	//Tools
	public static final ItemSword TEMPLATE_SWORD = new ToolSword("template_sword", TOOLS_TEMPLATE_ITEM);
	public static final ItemSpade TEMPLATE_SHOVEL = new ToolShovel("template_shovel", TOOLS_TEMPLATE_ITEM);
	public static final ItemPickaxe TEMPLATE_PICKAXE = new ToolPickaxe("template_pickaxe", TOOLS_TEMPLATE_ITEM);
	public static final ItemAxe TEMPLATE_AXE = new ToolAxe("template_axe", TOOLS_TEMPLATE_ITEM);
	public static final ItemHoe TEMPLATE_HOE = new ToolHoe("template_hoe", TOOLS_TEMPLATE_ITEM);
	
	//Armor
	public static final Item TEMPLATE_HELMET = new ArmorBase("template_helmet", ARMOR_TEMPLATE_ITEM, 1, EntityEquipmentSlot.HEAD);
	public static final Item TEMPLATE_CHESTPLATE = new ArmorBase("template_chestplate", ARMOR_TEMPLATE_ITEM, 1, EntityEquipmentSlot.CHEST);
	public static final Item TEMPLATE_LEGGINGS = new ArmorBase("template_leggings", ARMOR_TEMPLATE_ITEM, 2, EntityEquipmentSlot.LEGS);
	public static final Item TEMPLATE_BOOTS = new ArmorBase("template_boots", ARMOR_TEMPLATE_ITEM, 1, EntityEquipmentSlot.FEET);
	//ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
}
