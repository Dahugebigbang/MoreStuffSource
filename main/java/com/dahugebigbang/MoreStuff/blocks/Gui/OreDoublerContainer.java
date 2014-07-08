package com.dahugebigbang.MoreStuff.blocks.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class OreDoublerContainer extends Container {
     private com.dahugebigbang.MoreStuff.blocks.TileEntities.OreDoublerTileEntity OreDoublerTileEntity;
     
     public OreDoublerContainer(InventoryPlayer invPlayer, com.dahugebigbang.MoreStuff.blocks.TileEntities.OreDoublerTileEntity entity) {
    	 this.OreDoublerTileEntity = entity;
     }
	@Override
	public boolean canInteractWith(EntityPlayer var1) {
	
		return OreDoublerTileEntity.isUseableByPlayer(var1);
	}
     
}
