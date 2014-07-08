package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class WheatHoe extends ItemHoe {

	public WheatHoe(int i, ToolMaterial WheatTool) {
		super(WheatTool);
		this.setUnlocalizedName("WheatHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "WheatHoe");
	}

}
