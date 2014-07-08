package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockButter extends Block {

	public BlockButter(int i, Material sponge) {
		super(sponge);
		
		this.setBlockTextureName(Strings.MODID + ":" + "Butter_Block");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHardness(1.0F);
		this.setResistance(3.0F);
		this.setBlockName("ButterBlock");
		this.setLightLevel(0.5F);
		
		
	}

	

}


