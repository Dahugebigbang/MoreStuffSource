package com.dahugebigbang.MoreStuff.blocks.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.dahugebigbang.MoreStuff.blocks.TileEntities.OreDoublerTileEntity;

import cpw.mods.fml.common.network.IGuiHandler;

public class OreDoublerGuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID){
		case 0:
			if(entity != null && entity instanceof OreDoublerTileEntity) {
			return new OreDoublerContainer(player.inventory, (OreDoublerTileEntity)entity);
		}else{
			return null;
		}
		}		
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		switch(ID) {
		case 0:
		if(entity != null && entity instanceof OreDoublerTileEntity) {
			return new OreDoublerGui(player.inventory, (OreDoublerTileEntity) entity);
		}
	}
		return null;
	}

}
