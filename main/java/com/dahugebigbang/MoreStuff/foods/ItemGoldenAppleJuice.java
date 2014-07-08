package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemGoldenAppleJuice extends ItemFood {

	public ItemGoldenAppleJuice(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setAlwaysEdible();
		this.setUnlocalizedName("GoldenAppleJuice");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setPotionEffect(Potion.regeneration.id, 60, 4, 1.0F);
		this.setTextureName(Strings.MODID + ":" + "GoldenAppleJuice");
	}

}
