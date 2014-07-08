package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemSqueezer extends Item {

	public ItemSqueezer(int i) {
		this.setUnlocalizedName("Squeezer");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setMaxDamage(1000);
		this.setTextureName(Strings.MODID + ":" + "Squeezer"); 
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