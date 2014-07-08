package com.dahugebigbang.MoreStuff.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class TungstenHoe extends ItemHoe {

	public TungstenHoe(int i, ToolMaterial Tungsten) {
		super(Tungsten);
		this.setUnlocalizedName("TungstenHoe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TungstenHoe");
	}

}
