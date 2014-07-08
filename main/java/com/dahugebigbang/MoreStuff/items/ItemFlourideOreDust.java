package com.dahugebigbang.MoreStuff.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class ItemFlourideOreDust extends Item {

	public ItemFlourideOreDust(int i) {
		super();
		this.setUnlocalizedName("FlourideOreDust");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "FlourideOreDust");
	}
	
	

}
