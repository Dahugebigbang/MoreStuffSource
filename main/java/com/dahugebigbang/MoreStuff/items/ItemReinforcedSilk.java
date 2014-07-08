package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemReinforcedSilk extends Item {

	public ItemReinforcedSilk(int i) {
		super();
		this.setUnlocalizedName("ReinforcedSilk");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "ReinforcedSilk");
	}

}
