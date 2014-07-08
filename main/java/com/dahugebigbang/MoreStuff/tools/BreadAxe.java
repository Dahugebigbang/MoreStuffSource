package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class BreadAxe extends ItemAxe {

	public BreadAxe(int i, ToolMaterial BreadM) {
		super(BreadM);
		this.setUnlocalizedName("BreadAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "BreadAxe");
		
	}

}
