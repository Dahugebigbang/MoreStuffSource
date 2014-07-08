package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTitaniumOreDust extends Item {

	public ItemTitaniumOreDust(int i) {
		super();
		this.setUnlocalizedName("TitaniumOreDust");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumOreDust");
	}

}
