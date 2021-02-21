package com.AbdurrahmanRaza.ModTemplate.blocks;


import com.AbdurrahmanRaza.ModTemplate.Main;
import com.AbdurrahmanRaza.ModTemplate.init.BlockInit;
import com.AbdurrahmanRaza.ModTemplate.init.ItemInit;
import com.AbdurrahmanRaza.ModTemplate.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.templatetab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
