package com.dahugebigbang.MoreStuff.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class GIAHoe extends ItemHoe {

	public GIAHoe(int i, ToolMaterial gia) {
		super(gia);
		this.setUnlocalizedName("GIAHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "GIAHoe");
	}

}
