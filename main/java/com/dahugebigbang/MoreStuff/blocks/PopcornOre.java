package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PopcornOre extends Block {

	public PopcornOre(int i, Material ground) {
		super(ground);
		this.setBlockName("PopcornOre");
		this.setHardness(2.0F);
		this.setResistance(2.0F);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setBlockTextureName(Strings.MODID + ":" + "PopcornOre");
	}

}
