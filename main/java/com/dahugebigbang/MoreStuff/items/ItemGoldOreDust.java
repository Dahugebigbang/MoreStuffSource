package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGoldOreDust extends Item {

	public ItemGoldOreDust(int i) {
		super();
		this.setUnlocalizedName("GoldOreDust");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "GoldDust");
	}

}
