package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class ItemJumpToast extends ItemFood {

	public ItemJumpToast(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		this.setAlwaysEdible();
		this.setUnlocalizedName("JumpToast");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setPotionEffect(Potion.jump.id, 60, 1, 1.0F);
		this.setTextureName(Strings.MODID + ":" + "JumpToast");
	}

}
