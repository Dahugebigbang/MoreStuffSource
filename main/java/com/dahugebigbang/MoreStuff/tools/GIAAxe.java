package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class GIAAxe extends ItemAxe {

	public GIAAxe(int i, ToolMaterial gia) {
		super(gia);
		this.setUnlocalizedName("GIAAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "GIAAxe");
		
	}
	

}
