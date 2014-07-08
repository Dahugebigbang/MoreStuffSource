package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFlourideGlass extends Block {

	public BlockFlourideGlass(int i, Material glass) {
		super(glass);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHardness(0.5F);
		this.setResistance(0.5F);
		this.setLightLevel(0.0F);
		this.setBlockName("FlourideGlass");
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(Strings.MODID + ":" + "FlourideGlass");
		
	}

}
