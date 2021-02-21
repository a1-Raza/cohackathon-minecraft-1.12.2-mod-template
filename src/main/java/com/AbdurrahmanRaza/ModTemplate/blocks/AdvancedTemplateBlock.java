package com.AbdurrahmanRaza.ModTemplate.blocks;

import net.minecraft.block.material.Material;

public class AdvancedTemplateBlock extends BlockBase 
{

	public AdvancedTemplateBlock(String name, Material material) {
		super(name, material);
		
		//Example Properties
		setHardness(100.0F);
		setHarvestLevel("axe", 1);
		setLightLevel(0.5F);
	}

}
