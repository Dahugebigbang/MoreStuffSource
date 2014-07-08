package com.dahugebigbang.MoreStuff.tools;

import net.minecraft.item.ItemAxe;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

public class TitaniumAxe extends ItemAxe {
	public TitaniumAxe(int i, ToolMaterial TitaniumM) {
		super(TitaniumM);
		this.setUnlocalizedName("TitaniumAxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "TitaniumAxe");

}
}