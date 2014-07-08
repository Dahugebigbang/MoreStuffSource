package com.dahugebigbang.MoreStuff.tools;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class CombatSword extends ItemSword {

	public CombatSword(int i, ToolMaterial combatSword) {
		super(combatSword);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setUnlocalizedName("CombatSword");
		this.setTextureName(Strings.MODID + ":" + "CombatSword");
	}
		 public void onUsingTick(ItemStack item, EntityPlayer player, int count)
	        {
	         if(!player.worldObj.isRemote)
	         {
	        	                                                                                                                                                               
	         player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,   600,               2,                                           true));
		
		
		
	}

  }
}