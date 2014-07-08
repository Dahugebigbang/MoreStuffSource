package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class SuperHoe extends ItemHoe {
	
	public SuperHoe(int i, ToolMaterial SuperTool) {
		super(SuperTool);
		this.setUnlocalizedName("SuperHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "SuperHoe");
		
	}

}


