package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemOrb extends Item {

	public ItemOrb(int i) {
		super();
		this.setUnlocalizedName("Orb");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setMaxStackSize(1);
		this.setTextureName(Strings.MODID + ":" + "Orb");
	}

}
