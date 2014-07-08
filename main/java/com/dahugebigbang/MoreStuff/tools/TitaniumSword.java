package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class TitaniumSword extends ItemSword {

	public TitaniumSword(int i, ToolMaterial TitaniumM) {
		super(TitaniumM);
		this.setUnlocalizedName("TitaniumSword");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumSword");
	}

}
