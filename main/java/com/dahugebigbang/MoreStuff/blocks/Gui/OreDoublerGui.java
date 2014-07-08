package com.dahugebigbang.MoreStuff.blocks.Gui;

import java.io.IOException;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import com.dahugebigbang.MoreStuff.blocks.TileEntities.OreDoublerTileEntity;

public class OreDoublerGui extends GuiContainer {
	
	public static final ResourceLocation texture = new ResourceLocation("MoreStuff:/textures/gui/OreDoublerGui.png");

	public OreDoublerGui(InventoryPlayer playerinv, OreDoublerTileEntity tileentity) {
		super(new OreDoublerContainer(playerinv, tileentity));
		
		xSize = 300;
		ySize = 300;
		
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,
			int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		try{
			Minecraft.getMinecraft().getResourceManager().getResource(texture);
		}catch (IOException e) {
			
			
		e.printStackTrace();
	}
     drawTexturedModalRect(guiLeft, guiTop, 0, 0, this.xSize, this.ySize);
  }
}