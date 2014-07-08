package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemRegenToast extends ItemFood {
	
	public ItemRegenToast(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setAlwaysEdible();
		this.setUnlocalizedName("RegenToast");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setPotionEffect(Potion.regeneration.id, 60, 2, 1.0F);
		this.setTextureName(Strings.MODID + ":" + "RegenToast");

  }
}