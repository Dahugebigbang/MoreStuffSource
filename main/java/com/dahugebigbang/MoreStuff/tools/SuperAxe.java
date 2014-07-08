package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class SuperAxe extends ItemAxe {
	
	public SuperAxe(int i, ToolMaterial SuperTool) {
		super(SuperTool);
		this.setUnlocalizedName("SuperAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "SuperAxe");
		
	}

}


