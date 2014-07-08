package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class TungstenShovel extends ItemSpade {

	public TungstenShovel(int i, ToolMaterial Tungsten) {
		super(Tungsten);
		this.setUnlocalizedName("TungstenShovel");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TungstenShovel");
	}

}
