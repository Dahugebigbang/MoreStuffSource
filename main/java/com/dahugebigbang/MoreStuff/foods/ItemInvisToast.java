package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemInvisToast extends ItemFood {

	public ItemInvisToast(int hunger, float saturation,
			boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setAlwaysEdible();
		this.setUnlocalizedName("InvisToast");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setPotionEffect(Potion.invisibility.id, 120, 1, 1.0F);
		this.setTextureName(Strings.MODID + ":" + "InvisToast");
		
	}

}
