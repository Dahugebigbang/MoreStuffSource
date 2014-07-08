package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class NetherStarSword extends ItemSword {
	
	
	public NetherStarSword(int i, ToolMaterial Star) {
		super(Star);
	    this.setUnlocalizedName("NSSword");
	    this.setCreativeTab(MoreStuff.TabMoreStuff);
	    this.setTextureName(Strings.MODID + ":" + "NetherSword");

  }
}