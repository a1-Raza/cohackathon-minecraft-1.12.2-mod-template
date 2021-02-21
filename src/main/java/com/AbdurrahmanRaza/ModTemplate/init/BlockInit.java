package com.AbdurrahmanRaza.ModTemplate.init;

import java.util.ArrayList;
import java.util.List;

import com.AbdurrahmanRaza.ModTemplate.blocks.AdvancedTemplateBlock;
import com.AbdurrahmanRaza.ModTemplate.blocks.BlockBase;
import com.AbdurrahmanRaza.ModTemplate.blocks.DirectionalTemplateBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TEMPLATE_BLOCK = new AdvancedTemplateBlock("template_block", Material.IRON);
	
	public static final Block DIRECTIONAL_TEMPLATE_BLOCK = new DirectionalTemplateBlock("directional_template_block", Material.IRON);
}
