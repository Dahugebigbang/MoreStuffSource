package com.dahugebigbang.MoreStuff.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class ToastSpade extends ItemSpade {

	public ToastSpade(int i, ToolMaterial ToastM) {
		super(ToastM);
		this.setUnlocalizedName("ToastSpade");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "ToastShovel");
	}

}
