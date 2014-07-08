package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class FlourideShovel extends ItemSpade {
	
	public FlourideShovel(int i, ToolMaterial flourideM) {
		super(flourideM);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("FlourideShovel");
		this.setTextureName(Strings.MODID + ":" + "FlourideShovel");
	}

}
