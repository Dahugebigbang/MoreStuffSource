package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlourideBlock extends Block {

	public BlockFlourideBlock(int i, Material ground) {
		super(ground);
		this.setBlockName("FlourideBlock");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHardness(5.0F);
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName(Strings.MODID + ":" + "FlourideBlock");
	}

}
