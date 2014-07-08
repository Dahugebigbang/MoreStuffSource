package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class FlourideHoe extends ItemHoe{

	public FlourideHoe(int i, ToolMaterial flourideM) {
		super(flourideM);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("FlourideHoe");
		this.setTextureName(Strings.MODID + ":" + "FlourideHoe");

		

}
}