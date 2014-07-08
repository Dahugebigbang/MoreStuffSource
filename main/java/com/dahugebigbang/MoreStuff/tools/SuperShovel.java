package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class SuperShovel extends ItemSpade {
	
	public SuperShovel(int i, ToolMaterial SuperTool) {
		super(SuperTool);
		this.setUnlocalizedName("SuperShovel");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "SuperShovel");
		
	}

}


