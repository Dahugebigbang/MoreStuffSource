package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FlourideOre extends Block {

	public FlourideOre(int i, Material ground) {
		super(ground);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHardness(5.0F);
		this.setResistance(2.0F);
		this.setLightLevel(0.0F);
		this.setBlockName("FlourideOre");
		this.setHarvestLevel("pickaxe", 2);
		this.setBlockTextureName(Strings.MODID + ":" + "FlourideOre");
	}

}
