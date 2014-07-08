package com.dahugebigbang.MoreStuff.blocks;

import java.util.Random;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GemOre extends Block {

	public GemOre(int i, Material Ground) {
		super(Ground);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setHardness(5.0F);
		this.setResistance(1.5F);
		this.setBlockName("GemOre");
		this.setLightLevel(0.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setBlockTextureName(Strings.MODID + ":" + "GemOre");
		
		
		
	}

}
