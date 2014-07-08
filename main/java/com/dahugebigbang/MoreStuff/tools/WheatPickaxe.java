package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class WheatPickaxe extends ItemPickaxe {

	public WheatPickaxe(int i, ToolMaterial WheatTool) {
		super(WheatTool);
		this.setUnlocalizedName("WheatPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "WheatPickaxe");
	}

}
