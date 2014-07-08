package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class WheatSword extends ItemSword {

	public WheatSword(int i, ToolMaterial WheatTool) {
		super(WheatTool);
		this.setUnlocalizedName("WheatSword");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "WheatSword");
	}

	
		
	}
	
	


