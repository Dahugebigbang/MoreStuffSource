package com.dahugebigbang.MoreStuff.items.armor;

import com.dahugebigbang.MoreStuff.MoreStuff;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class MagentaCoat extends ItemArmor {

	public MagentaCoat(ArmorMaterial p_i45325_1_, int p_i45325_2_,
			int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
	}
	
	
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MoreStuff.MagentaHelmet || stack.getItem() == MoreStuff.MagentaChestplate || stack.getItem() == MoreStuff.MagentaBoots)   {
			return "MoreStuff:textures/models/armor/TitaniumArmor_1.png";
		}
		if(stack.getItem() == MoreStuff.MagentaLeggings) {
			return "MoreStuff:textures/models/armor/TitaniumArmor_2.png";
		}
		else return null;
	};

}


