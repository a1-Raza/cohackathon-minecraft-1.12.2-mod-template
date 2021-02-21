package com.AbdurrahmanRaza.ModTemplate.init;

import java.util.ArrayList;
import java.util.List;

import com.AbdurrahmanRaza.ModTemplate.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TEMPLATE_BLOCK = new BlockBase("template_block", Material.IRON);
}
