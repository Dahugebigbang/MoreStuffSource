package com.dahugebigbang.MoreStuff.blocks;

import java.util.Random;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockCrystal extends Block {

	public BlockCrystal(int i,Material glass) {
		super(glass);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setStepSound(soundTypeGlass);
		this.setHardness(5F);
		this.setResistance(6F);
		this.setLightLevel(5F);
		this.setBlockName("Crystal");
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockTextureName(Strings.MODID + ":" + "blockCrystal");
		
		
		
	}
	
}
    
	
	
	
	


