package com.dahugebigbang.MoreStuff.foods;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class ItemCherryJuice extends ItemFood {

	public ItemCherryJuice(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setUnlocalizedName("CherryJuice");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "CherryJuice");
	}

}
