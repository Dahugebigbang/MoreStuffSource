package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class FlourideAxe extends ItemAxe {
	
	public FlourideAxe(int i, ToolMaterial flourideM) {
		super(flourideM);
		this.setUnlocalizedName("FlourideAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "FlourideAxe");
	}

}
