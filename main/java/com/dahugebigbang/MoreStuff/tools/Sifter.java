package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class Sifter extends Item {

	public Sifter(int i, ToolMaterial SiF) {
		super();
		this.setUnlocalizedName("Sifter");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setMaxDamage(40);
		this.setMaxStackSize(1);
		this.setTextureName(Strings.MODID + ":" + "Sifter");
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