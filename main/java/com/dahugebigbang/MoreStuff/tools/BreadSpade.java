package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class BreadSpade extends ItemSpade {

	public BreadSpade(int i, ToolMaterial BreadM) {
		super(BreadM);
		this.setUnlocalizedName("BreadSpade");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "BreadShovel");
	}

}
