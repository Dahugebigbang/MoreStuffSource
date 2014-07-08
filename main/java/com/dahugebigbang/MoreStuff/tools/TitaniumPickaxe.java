package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class TitaniumPickaxe extends ItemPickaxe {
	
	public TitaniumPickaxe(int i, ToolMaterial TitaniumM) {
		super(TitaniumM);
		this.setUnlocalizedName("TitaniumPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumPickaxe");

 }
}