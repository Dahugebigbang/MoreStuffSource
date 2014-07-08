package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class FlourideSword extends ItemSword {

	public FlourideSword(int i, ToolMaterial flourideM) {
		super(flourideM);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("FlourideSword");
		this.setTextureName(Strings.MODID + ":FlourideSword");
		
		
	}

}
