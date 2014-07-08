package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToastAxe extends ItemAxe {

	public ToastAxe(int i, ToolMaterial ToastM) {
		super(ToastM);
		this.setUnlocalizedName("ToastAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "ToastAxe");
	}

}
