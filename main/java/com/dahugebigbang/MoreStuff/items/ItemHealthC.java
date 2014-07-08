package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHealthC extends Item {
	
	public ItemHealthC(int i){
		
		
		super();                        
		this.setHasSubtypes(true);                        
		this.setMaxDamage(8);
		this.setUnlocalizedName("HealthC");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		
		this.setTextureName(Strings.MODID + ":" + "HealthC");
		}


		/**
		 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, 
		 entityPlayer         
		 */
		public ItemStack onItemRightClick(ItemStack item, World w, EntityPlayer e){
			{
			if(!w.isRemote)	
			{
				
			
				item.damageItem(1, e);
				e.addPotionEffect(new PotionEffect(Potion.heal.id, 5 * 100, 1, true));
			}
			
			return item;
			
		}
	}
			public void onUsingTick(ItemStack stack, EntityPlayer player, int count)
			{





	  }
		}


