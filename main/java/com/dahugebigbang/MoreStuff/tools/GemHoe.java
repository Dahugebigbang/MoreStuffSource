package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class GemHoe extends ItemHoe {

	public GemHoe(int i, ToolMaterial gemM) {
		super(gemM);
		this.setUnlocalizedName("GemHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "GemHoe");
		
	}

}
