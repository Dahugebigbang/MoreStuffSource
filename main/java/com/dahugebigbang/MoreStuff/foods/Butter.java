package com.dahugebigbang.MoreStuff.foods;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class Butter extends ItemFood {

	public Butter(int hunger, float saturation, boolean isWolffood) {
		super(hunger, saturation, isWolffood);
		this.setUnlocalizedName("Butter");
		this.setMaxStackSize(16);
		this.setTextureName(Strings.MODID + ":" + "Butter");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		
	}

	
	}


