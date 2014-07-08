package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToastHoe extends ItemHoe {

	public ToastHoe(int i, ToolMaterial ToastM) {
		super(ToastM);
		this.setUnlocalizedName("ToastHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "ToastHoe");
	}

}
