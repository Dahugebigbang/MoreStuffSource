package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class TungstenPickaxe extends ItemPickaxe {

	public TungstenPickaxe(int i, ToolMaterial Tungsten) {
		super(Tungsten);
		this.setUnlocalizedName("TungstenPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TungstenPickaxe");
		
	}

}
