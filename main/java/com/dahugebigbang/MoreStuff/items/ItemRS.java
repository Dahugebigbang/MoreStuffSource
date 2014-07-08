package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemRS extends Item {
	
	
		public ItemRS(int i) {
	super();
	this.setUnlocalizedName("RSifter");
	this.setCreativeTab(MoreStuff.TabMoreStuff);
	this.setMaxDamage(80);
	this.setMaxStackSize(1);
	this.setTextureName(Strings.MODID + ":" + "RSifter");
	
		}



@Override
public boolean hasContainerItem(ItemStack stack) {
	return stack.getItemDamage() < stack.getMaxDamage();
}
@Override
public ItemStack getContainerItem(ItemStack stack) {
	ItemStack result = stack.copy();
	result.setItemDamage(stack.getItemDamage() + 1);
	return result;

  }
 }
