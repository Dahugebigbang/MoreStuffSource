package com.dahugebigbang.MoreStuff.blocks;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTungstenOre extends Block {

	public BlockTungstenOre(int i, Material ground) {
		super(ground);
		this.setBlockName("TungstenOre");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHarvestLevel("pickaxe", 2);
		this.setResistance(10.0F);
		this.setHardness(6.0F);
		this.setBlockTextureName(Strings.MODID + ":" + "TungstenOre");
		
	}

	
	}


