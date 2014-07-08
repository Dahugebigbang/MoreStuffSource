package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemButteredToast extends ItemFood {

	public ItemButteredToast(int hunger, float saturation,
			boolean isWolffood) {
		super(hunger, saturation, isWolffood);
		
		this.setUnlocalizedName("ButteredToast");
		this.setMaxStackSize(64);
		this.setTextureName(Strings.MODID + ":" + "ButteredToast");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
	}

}
