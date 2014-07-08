package com.dahugebigbang.MoreStuff.items.armor;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.dahugebigbang.MoreStuff.MoreStuff;

public class GemArmor extends ItemArmor {

	public GemArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MoreStuff.GemHelmet || stack.getItem() == MoreStuff.GemChestplate || stack.getItem() == MoreStuff.GemBoots)   {
			return "MoreStuff:textures/models/armor/GemArmor_1.png";
		}
		if(stack.getItem() == MoreStuff.GemLeggings) {
			return "MoreStuff:textures/models/armor/GemArmor_2.png";
		}
		else return null;
	};
	


 }
