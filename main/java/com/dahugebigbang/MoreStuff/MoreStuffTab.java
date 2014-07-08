package com.dahugebigbang.MoreStuff;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class MoreStuffTab extends CreativeTabs {

	
	    public MoreStuffTab(int par1, String par2Str)
	    {
	        super(par1, par2Str);
	    }
	    
	    
	    

	    public String getTranslatedTabLabel()
	    {
	        return "MoreStuff";
	    }
	

	@Override
	public Item getTabIconItem() {
		
		return MoreStuff.Toast;
	}
	}


