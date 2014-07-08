package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemHealthToast extends ItemFood  {

	public ItemHealthToast(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
	    this.setAlwaysEdible();
	    this.setUnlocalizedName("HealthToast");
	    this.setCreativeTab(CreativeTabs.tabFood);
	    this.setPotionEffect(Potion.heal.id, 10, 5, 1.0F);
	    this.setTextureName(Strings.MODID + ":" + "HealthToast");
	}

}
