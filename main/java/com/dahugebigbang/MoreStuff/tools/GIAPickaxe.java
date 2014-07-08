package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class GIAPickaxe extends ItemPickaxe {

	public GIAPickaxe(int i, ToolMaterial gia) {
		super(gia);
		this.setUnlocalizedName("GIAPickaxe");
		this.setTextureName(Strings.MODID + ":" + "GIAPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
	}

}
