package com.dahugebigbang.MoreStuff.items.armor;

import com.dahugebigbang.MoreStuff.MoreStuff;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;

public class LC extends ItemArmor implements ISpecialArmor {

	public LC(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
		this.setCreativeTab(MoreStuff.TabMoreStuff);
		
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == MoreStuff.LoCH || stack.getItem() == MoreStuff.LoChest || stack.getItem() == MoreStuff.LoCBoots)   {
			return "MoreStuff:textures/models/armor/LoC_1.png";
		}
	
	
	if(stack.getItem() == MoreStuff.LoC) {
		return "MoreStuff:textures/models/armor/LoC_2.png";
	}
	else return null;
};

@Override
public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {
	player.addPotionEffect(new PotionEffect (Potion.moveSpeed.id, 500, 2));
}

@Override
public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor,
		DamageSource source, double damage, int slot) {
	
	return null;
}

@Override
public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
	
	return 0;
}

@Override
public void damageArmor(EntityLivingBase entity, ItemStack stack,
		DamageSource source, int damage, int slot) {
	
	
}


/*@Override
@SideOnly(Side.CLIENT)
public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) 
{
	ModelBiped armorModel = null;
	int type = ((ItemArmor)itemStack.getItem()).armorType;


	if(itemStack != null)
	{
		if(itemStack.getItem() instanceof LC)
		{
			if(type == 1 || type == 3)
			{
				armorModel = MoreStuff.commonProxy.getArmorModel(0);
			}
			else
			{
				armorModel = MoreStuff.commonProxy.getArmorModel(1);
			}

			if(armorModel != null)
			{
				armorModel.bipedHead.showModel = armorSlot == 0;
				armorModel.bipedHeadwear.showModel = armorSlot == 0;
				armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
				armorModel.bipedRightArm.showModel = armorSlot == 1;
				armorModel.bipedLeftArm.showModel = armorSlot == 1;
				armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
				armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();
				armorModel.heldItemRight = entityLiving.getEquipmentInSlot(0) != null ? 1 :0;

				if(entityLiving instanceof EntityPlayer)
				{
					armorModel.aimedBow =((EntityPlayer)entityLiving).getItemInUseDuration() > 2;
				}

				return armorModel;
			}
		}
	}

	return null;
	*/
}
	


