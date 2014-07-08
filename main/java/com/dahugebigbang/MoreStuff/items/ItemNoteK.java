package com.dahugebigbang.MoreStuff.items;

import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.lib.Strings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemNoteK extends Item {

	public ItemNoteK(int i) {
		super();
		this.setUnlocalizedName("NoteK");
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		this.setTextureName(Strings.MODID + ":" + "NoteK");
	}

}
