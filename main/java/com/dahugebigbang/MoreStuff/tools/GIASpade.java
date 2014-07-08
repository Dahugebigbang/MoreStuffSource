package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class GIASpade extends ItemSpade {

	public GIASpade(int i, ToolMaterial gia) {
		super(gia);
		this.setUnlocalizedName("GIASpade");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "GIAShovel");
	}

}
