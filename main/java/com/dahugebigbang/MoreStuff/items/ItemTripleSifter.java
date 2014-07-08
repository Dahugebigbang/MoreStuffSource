package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTripleSifter extends Item {

	public ItemTripleSifter(int i) {
      super();
      this.setUnlocalizedName("TripleSifter");
      this.setCreativeTab(MoreStuff.TabMoreStuff);
      this.setMaxDamage(100);
      this.setMaxStackSize(1);
      this.setTextureName("MoreStuff:TripleSifter");
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