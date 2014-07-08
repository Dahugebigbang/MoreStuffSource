package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemWheatBundle extends Item {
	
	 public ItemWheatBundle(int i) {
		 super();
		 this.setUnlocalizedName("WheatBundle");
		 this.setCreativeTab(MoreStuff.TabMoreStuff);
		 this.setTextureName(Strings.MODID + ":" + "WheatBundle");

  }
}