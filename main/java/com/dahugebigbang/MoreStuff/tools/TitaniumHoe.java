package com.dahugebigbang.MoreStuff.tools;

import net.minecraft.item.ItemHoe;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class TitaniumHoe extends ItemHoe {
	
	public TitaniumHoe(int i, ToolMaterial TitaniumM) {
		super(TitaniumM);
		this.setUnlocalizedName("TitaniumHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumHoe");

 }
}