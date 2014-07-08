package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSpeedToast extends ItemFood {

	public ItemSpeedToast(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	    this.setAlwaysEdible();
	    this.setCreativeTab(MoreStuff.TabMoreStuff);
	    this.setUnlocalizedName("SpeedToast");
	    this.setPotionEffect(Potion.moveSpeed.id, 60, 2, 1.0F);
	    this.setTextureName(Strings.MODID + ":" + "SpeedToast");
	}

}
