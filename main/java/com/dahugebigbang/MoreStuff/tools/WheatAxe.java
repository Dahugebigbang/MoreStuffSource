package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class WheatAxe extends ItemAxe {

	public WheatAxe(int i, ToolMaterial WheatTool) {
		super(WheatTool);
		this.setUnlocalizedName("WheatAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "WheatAxe");
	}

}
