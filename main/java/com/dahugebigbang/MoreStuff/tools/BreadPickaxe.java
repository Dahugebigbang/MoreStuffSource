package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class BreadPickaxe extends ItemPickaxe {

	public BreadPickaxe(int i, ToolMaterial BreadM) {
		super(BreadM);
		this.setUnlocalizedName("BreadPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "BreadPickaxe");
		
		
	}

}
