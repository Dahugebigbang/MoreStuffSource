package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPetrifiedWoodOre extends Block {

	public BlockPetrifiedWoodOre(int i, Material ground) {
		super(ground);
		this.setBlockName("PetrifiedWoodOre");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setBlockTextureName("MoreStuff:PetrifiedWoodOre");
	}


}
