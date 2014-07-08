package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class TitaniumShovel extends ItemSpade {
	
	public TitaniumShovel(int i, ToolMaterial TitaniumM) {
		super(TitaniumM);
		this.setUnlocalizedName("TitaniumShovel");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumShovel");

 }
}