package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class WheatSpade extends ItemSpade {

	public WheatSpade(int i, ToolMaterial WheatTool) {
		super(WheatTool);
		this.setUnlocalizedName("WheatSpade");
		this.setTextureName(Strings.MODID + ":" + "WheatShovel");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
	}

}
