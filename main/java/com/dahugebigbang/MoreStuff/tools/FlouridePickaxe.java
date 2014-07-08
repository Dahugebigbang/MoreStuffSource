package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class FlouridePickaxe extends ItemPickaxe {

	public FlouridePickaxe(int i, ToolMaterial flourideM) {
		super(flourideM);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("FlouridePickaxe");
		this.setTextureName(Strings.MODID + ":" + "FlouridePickaxe");
		
	}

	
		
	}


