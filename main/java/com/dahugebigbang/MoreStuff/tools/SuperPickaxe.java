package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class SuperPickaxe extends ItemPickaxe {

	public SuperPickaxe(int i, ToolMaterial SuperTool) {
		super(SuperTool);
		this.setUnlocalizedName("SuperPickaxe");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "SuperPickaxe");
		
	}

	

}
