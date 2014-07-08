package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CherryOre extends Block {

	public CherryOre(int i, Material ground) {
		super(ground);
		this.setBlockName("CherryOre");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setBlockTextureName(Strings.MODID + ":" + "CherryOre");
		this.setHarvestLevel("pickaxe", 3);
	}

}
