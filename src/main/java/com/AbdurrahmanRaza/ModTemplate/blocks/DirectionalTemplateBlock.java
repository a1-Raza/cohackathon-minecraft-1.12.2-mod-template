package com.AbdurrahmanRaza.ModTemplate.blocks;

import net.minecraft.block.material.Material;

public class DirectionalTemplateBlock extends DirectionalBlockBase
{
	public DirectionalTemplateBlock(String name, Material material) 
	{
		super(name, material);
		
		//Example Properties
		setHardness(100.0F);
		setHarvestLevel("pickaxe", 5);
		setLightLevel(1.0F);
	}
}
