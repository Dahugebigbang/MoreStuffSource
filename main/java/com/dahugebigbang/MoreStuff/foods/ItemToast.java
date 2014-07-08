package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemToast extends ItemFood {

	public ItemToast(int hunger, float saturation, boolean isWolffood) {
		super(hunger, saturation, isWolffood);
	}

	{
		this.setUnlocalizedName("Toast");
		this.setMaxStackSize(64);
		this.setTextureName(Strings.MODID + ":" + "Toast");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
	
	}

}
