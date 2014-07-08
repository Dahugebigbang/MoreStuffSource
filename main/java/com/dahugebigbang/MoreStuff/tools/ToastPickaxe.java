package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToastPickaxe extends ItemPickaxe {

	public ToastPickaxe(int i, ToolMaterial ToastM) {
		super(ToastM);
		this.setUnlocalizedName("ToastPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "ToastPickaxe");
	}

}
