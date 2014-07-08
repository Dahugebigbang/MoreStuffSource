package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class BreadHoe extends ItemHoe {

	public BreadHoe(int i, ToolMaterial BreadM) {
		super(BreadM);
		this.setUnlocalizedName("BreadHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "BreadHoe");
	}

}
