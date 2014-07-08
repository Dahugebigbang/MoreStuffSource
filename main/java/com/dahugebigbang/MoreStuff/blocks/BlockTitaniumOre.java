package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTitaniumOre extends Block {

	public BlockTitaniumOre(int i, Material ground) {
		super(ground);
		this.setBlockName("TitaniumOre");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setResistance(20.0F);
		this.setHardness(15.0F);
		this.setBlockTextureName(Strings.MODID + ":" + "TitaniumOre");
		
	}

}
