package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemSuperSpeedToast extends ItemFood {
	
	public ItemSuperSpeedToast(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	    this.setAlwaysEdible();
	    this.setCreativeTab(MoreStuff.TabMoreStuff);
	    this.setUnlocalizedName("SuperSpeedToast");
	    this.setPotionEffect(Potion.moveSpeed.id, 60, 6, 1.0F);
	    this.setTextureName(Strings.MODID + ":" + "SpeedToast");
	}

}


