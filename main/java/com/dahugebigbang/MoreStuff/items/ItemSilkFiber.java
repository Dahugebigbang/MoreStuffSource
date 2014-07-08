package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilkFiber extends Item {

	public ItemSilkFiber(int i) {
		super();
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("SilkFiber");
		this.setTextureName(Strings.MODID + ":" + "SilkFiber");
	}

}
