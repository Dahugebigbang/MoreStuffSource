package com.dahugebigbang.MoreStuff;


	import com.dahugebigbang.MoreStuff.MoreStuff;
import com.dahugebigbang.MoreStuff.blocks.TileEntities.OreDoublerTileEntity;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.CherryOreWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.FlourideOreWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.GemOreWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.PopcornOreWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.SuperMegaTurboHurtyShotgunComboWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.TitaniumOreWG;
import com.dahugebigbang.MoreStuff.blocks.worldgeneration.TungstenOreWG;
import com.dahugebigbang.MoreStuff.items.ItemMatrix;
import com.dahugebigbang.MoreStuff.items.armor.FlourideArmor;
import com.dahugebigbang.MoreStuff.items.armor.GemArmor;
import com.dahugebigbang.MoreStuff.items.armor.LC;
import com.dahugebigbang.MoreStuff.items.armor.MagentaCoat;
import com.dahugebigbang.MoreStuff.items.armor.TitaniumArmor;
import com.dahugebigbang.MoreStuff.items.armor.TungstenArmor;
import com.dahugebigbang.MoreStuff.lib.Strings;
import com.dahugebigbang.MoreStuff.proxy.ProxyCommon;
import com.dahugebigbang.MoreStuff.tools.BreadAxe;
import com.dahugebigbang.MoreStuff.tools.BreadHoe;
import com.dahugebigbang.MoreStuff.tools.BreadPickaxe;
import com.dahugebigbang.MoreStuff.tools.BreadSpade;
import com.dahugebigbang.MoreStuff.tools.BreadSword;
import com.dahugebigbang.MoreStuff.tools.CombatSword;
import com.dahugebigbang.MoreStuff.tools.FlourideAxe;
import com.dahugebigbang.MoreStuff.tools.FlourideHoe;
import com.dahugebigbang.MoreStuff.tools.FlouridePickaxe;
import com.dahugebigbang.MoreStuff.tools.FlourideShovel;
import com.dahugebigbang.MoreStuff.tools.FlourideSword;
import com.dahugebigbang.MoreStuff.tools.GIAAxe;
import com.dahugebigbang.MoreStuff.tools.GIAHoe;
import com.dahugebigbang.MoreStuff.tools.GIAPickaxe;
import com.dahugebigbang.MoreStuff.tools.GIASpade;
import com.dahugebigbang.MoreStuff.tools.GemAxe;
import com.dahugebigbang.MoreStuff.tools.GemHoe;
import com.dahugebigbang.MoreStuff.tools.GemPickaxe;
import com.dahugebigbang.MoreStuff.tools.GemSpade;
import com.dahugebigbang.MoreStuff.tools.GemSword;
import com.dahugebigbang.MoreStuff.tools.MagicSword;
import com.dahugebigbang.MoreStuff.tools.NetherStarSword;
import com.dahugebigbang.MoreStuff.tools.Sifter;
import com.dahugebigbang.MoreStuff.tools.MultiTool;
import com.dahugebigbang.MoreStuff.tools.SuperAxe;
import com.dahugebigbang.MoreStuff.tools.SuperHoe;
import com.dahugebigbang.MoreStuff.tools.SuperPickaxe;
import com.dahugebigbang.MoreStuff.tools.SuperShovel;
import com.dahugebigbang.MoreStuff.tools.TitaniumAxe;
import com.dahugebigbang.MoreStuff.tools.TitaniumHoe;
import com.dahugebigbang.MoreStuff.tools.TitaniumPickaxe;
import com.dahugebigbang.MoreStuff.tools.TitaniumShovel;
import com.dahugebigbang.MoreStuff.tools.TitaniumSword;
import com.dahugebigbang.MoreStuff.tools.ToastAxe;
import com.dahugebigbang.MoreStuff.tools.ToastHoe;
import com.dahugebigbang.MoreStuff.tools.ToastPickaxe;
import com.dahugebigbang.MoreStuff.tools.ToastSpade;
import com.dahugebigbang.MoreStuff.tools.ToastSword;
import com.dahugebigbang.MoreStuff.tools.TungstenAxe;
import com.dahugebigbang.MoreStuff.tools.TungstenHoe;
import com.dahugebigbang.MoreStuff.tools.TungstenPickaxe;
import com.dahugebigbang.MoreStuff.tools.TungstenShovel;
import com.dahugebigbang.MoreStuff.tools.TungstenSword;
import com.dahugebigbang.MoreStuff.tools.WheatAxe;
import com.dahugebigbang.MoreStuff.tools.WheatHoe;
import com.dahugebigbang.MoreStuff.tools.WheatPickaxe;
import com.dahugebigbang.MoreStuff.tools.WheatSpade;
import com.dahugebigbang.MoreStuff.tools.WheatSword;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
	@Mod(modid = MoreStuff.MODID, version = MoreStuff.VERSION)
	public class MoreStuff {

	    public static final String MODID = "MoreStuff";
	    public static final String VERSION = "0.45";
	    @SidedProxy(clientSide = "com.dahugebigbang.MoreStuff.proxy.ProxyClient", serverSide = "com.dahugebigbang.MoreStuff.proxy.ProxyCommon")
	    public static ProxyCommon proxy;
	    
	    @Instance ("MoreStuff")
	    public static MoreStuff instance;
	    
	    public static CreativeTabs TabMoreStuff = new MoreStuffTab(CreativeTabs.getNextID(), "TabMoreStuff");
	    
	    //armor ID's
	    private static int Flouride1;
    	private static int Flouride2;
    	private static int Flouride3;
    	private static int Flouride4;
    	private static int Gem1;
    	private static int Gem2;
    	private static int Gem3;
    	private static int Gem4;
    	private static int Tungsten1;
    	private static int Tungsten2;
    	private static int Tungsten3;
    	private static int Tungsten4;
    	private static int Titanium1;
    	private static int Titanium2;
    	private static int Titanium3;
    	private static int Titanium4;
    	private static int LC1;
    	private static int LC2;
    	private static int LC3;
    	private static int LC4;
    	private static int Magenta1;
    	private static int Magenta2;
    	private static int Magenta3;
    	private static int Magenta4;
	    
	    
	    //Foods
	    Item ItemToast;
	    final static Item Toast = new com.dahugebigbang.MoreStuff.foods.ItemToast(8, 2, false);
	    
	    Item ItemButteredToast;
	    final static Item ButteredToast = new com.dahugebigbang.MoreStuff.foods.ItemButteredToast(10, 2, false);
	    
	    Item ItemButter;
	    final static Item Butter = new com.dahugebigbang.MoreStuff.foods.Butter(2, 1, false);
	    
	    Item ItemStrengthToast;
	    final static Item StrengthToast = new com.dahugebigbang.MoreStuff.foods.ItemStrengthToast(4, 4, false);
	    
	    Item ItemHasteToast;
	    final static Item HasteToast = new com.dahugebigbang.MoreStuff.foods.ItemHasteToast(4, 4, false);
	    
	    Item ItemHealthToast;
	    final static Item HealthToast = new com.dahugebigbang.MoreStuff.foods.ItemHealthToast(4, 4, false);
	    
	    Item ItemSpeedToast;
	    final static Item SpeedToast = new com.dahugebigbang.MoreStuff.foods.ItemSpeedToast(4, 4, false);
	    
	    Item ItemSuperSpeedToast;
	    final static Item SuperSpeedToast = new com.dahugebigbang.MoreStuff.foods.ItemSuperSpeedToast(6, 7, false);
	    
	    Item ItemRegenToast;
	    final static Item RegenToast = new com.dahugebigbang.MoreStuff.foods.ItemRegenToast(4, 4, false);
	    
	    Item ItemInvisToast;
	    final static Item InvisToast = new com.dahugebigbang.MoreStuff.foods.ItemInvisToast(4, 4, false);
	    
	    Item ItemJumpToast;
	    final static Item JumpToast = new com.dahugebigbang.MoreStuff.foods.ItemJumpToast(4, 4, false);
	    
	    Item ItemWBToast;
	    final static Item WBToast = new com.dahugebigbang.MoreStuff.foods.WBToast(4, 4, false);
	    
	    Item ItemGoldenAppleJuice;
	    final static Item GoldenAppleJuice = new com.dahugebigbang.MoreStuff.foods.ItemGoldenAppleJuice(2, 2, false);
	    
	    Item ItemQToast;
	    final static Item QToast = new com.dahugebigbang.MoreStuff.foods.ItemQToast(2, 1, false);
	    
	    Item ItemCherry;
	    final static Item Cherry = new com.dahugebigbang.MoreStuff.foods.ItemCherry(1, 5, false);
	    
	    Item ItemCherryJuice;
	    final static Item CherryJuice = new com.dahugebigbang.MoreStuff.foods.ItemCherryJuice(1, 6, false);
	    
	    Item ItemPopcorn;
	    final static Item Popcorn = new com.dahugebigbang.MoreStuff.items.Popcorn(3, 2, false);
	    
	    
	    
	    
	    
	    //Items
	    Item ItemMatrix;
    	final static Item Matrix = new com.dahugebigbang.MoreStuff.items.ItemMatrix(4500);
    	
    	Item ItemNetherMatrix;
    	final static Item NetherMatrix = new com.dahugebigbang.MoreStuff.items.ItemNetherMatrix(4501);
    	
    	Item ItemFlouride;
    	final static Item Flouride = new com.dahugebigbang.MoreStuff.items.ItemFlouride(4502);
    	
    	Item ItemOrb;
    	final static Item Orb = new com.dahugebigbang.MoreStuff.items.ItemOrb(4503);
    	
    	Item ItemWheatBundle;
    	final static Item WheatBundle = new com.dahugebigbang.MoreStuff.items.ItemWheatBundle(4504);
    	
    	Item ItemGoldOreDust;
    	final static Item GoldOreDust = new com.dahugebigbang.MoreStuff.items.ItemGoldOreDust(4505);
    	
    	Item ItemIronOreDust;
    	final static Item IronOreDust = new com.dahugebigbang.MoreStuff.items.ItemIronOreDust(4506);
    	
    	Item ItemFlourideOreDust;
    	final static Item FlourideOreDust = new com.dahugebigbang.MoreStuff.items.ItemFlourideOreDust(4507);
    	
    	Item ItemHeavySugar;
    	final static Item HeavySugar = new com.dahugebigbang.MoreStuff.items.ItemHeavySugar(4508);
    	
    	Item ItemSilkWhisp;
    	final static Item SilkWhisp = new com.dahugebigbang.MoreStuff.items.ItemSilkWhisp(4509);
    	
    	Item ItemSilkFiber;
    	final static Item SilkFiber = new com.dahugebigbang.MoreStuff.items.ItemSilkFiber(4510);
    	
    	Item ItemReinforcedSilk;
    	final static Item ReinforcedSilk = new com.dahugebigbang.MoreStuff.items.ItemReinforcedSilk(4511);
    	
    	Item ItemSqueezer;
    	final static Item Squeezer = new com.dahugebigbang.MoreStuff.items.ItemSqueezer(4512);
    	
    	Item ItemNoteK;
    	final static Item NoteK = new com.dahugebigbang.MoreStuff.items.ItemNoteK(4513);
    	
    	Item ItemSpeedC;
    	final static Item SpeedC = new com.dahugebigbang.MoreStuff.items.ItemSpeedC(4514);
    	
    	Item ItemStrengthC;
    	final static Item StrengthC = new com.dahugebigbang.MoreStuff.items.ItemStrengthC(4515);
    	
    	Item ItemHasteC;
    	final static Item HasteC = new com.dahugebigbang.MoreStuff.items.ItemHasteC(4516);
    	
    	Item ItemHealthC;
    	final static Item HealthC = new com.dahugebigbang.MoreStuff.items.ItemHealthC(4517);
    	
    	Item ItemJumpC;
    	final static Item JumpC = new com.dahugebigbang.MoreStuff.items.ItemJumpC(4518);
    	
    	Item ItemWBC;
    	final static Item WBC = new com.dahugebigbang.MoreStuff.items.ItemWBC(4519);
    	
    	Item ItemRegenC;
    	final static Item RegenC = new com.dahugebigbang.MoreStuff.items.ItemRegenC(4520);
    	
    	Item ItemBC;
    	final static Item BC = new com.dahugebigbang.MoreStuff.items.ItemBC(4521);
    	
    	Item ItemTungstenOreDust;
    	final static Item TungstenOreDust = new com.dahugebigbang.MoreStuff.items.ItemTungstenOreDust(4522);
    	
    	Item ItemTitaniumOreDust;
    	final static Item TitaniumOreDust = new com.dahugebigbang.MoreStuff.items.ItemTitaniumOreDust(4523);
    	
    	
    
    	
    	Item ItemGem;
    	final static Item Gem = new com.dahugebigbang.MoreStuff.items.ItemGem(4524);
    	
    	Item ItemGIA;
    	final static Item GIA = new com.dahugebigbang.MoreStuff.items.ItemGIA(4525);
    	
    	Item ItemRS;
    	final static Item RS = new com.dahugebigbang.MoreStuff.items.ItemRS(4526);
    	
    	Item ItemITungsten;
    	final static Item ITungsten = new com.dahugebigbang.MoreStuff.items.ItemITungsten(4527);
    	
    	Item ItemTitanium;
    	final static Item Titanium = new com.dahugebigbang.MoreStuff.items.ItemTitanium(4528);
    	
    	
    	//Blocks
    	Block BlockCrystal; 
        static Block Crystal = new com.dahugebigbang.MoreStuff.blocks.BlockCrystal(5001, Material.glass);
        
        Block BlockButter;
        static Block ButterBlock = new com.dahugebigbang.MoreStuff.blocks.BlockButter(5002, Material.sponge);
        
        Block BlockFlourideOre;
        public static Block FlourideOre = new com.dahugebigbang.MoreStuff.blocks.FlourideOre(5003, Material.ground);
        
        Block BlockGemOre;
        public static Block GemOre = new com.dahugebigbang.MoreStuff.blocks.GemOre(5004, Material.ground);
        
        Block BlockCherryOre;
        public static Block CherryOre = new com.dahugebigbang.MoreStuff.blocks.CherryOre(5005, Material.ground);
        
        Block BlockTungstenOre;
        public static Block TungstenOre = new com.dahugebigbang.MoreStuff.blocks.BlockTungstenOre(5006, Material.ground);
        
        Block BlockFlourideGlass;
        public static Block FlourideGlass = new com.dahugebigbang.MoreStuff.blocks.BlockFlourideGlass(5007, Material.glass);
        
        Block BlockOreDoubler;
        public static Block OreDoubler = new com.dahugebigbang.MoreStuff.blocks.BlockOreDoubler(5008, Material.anvil);
        
        Block BlockFlourideBlock;
        public static Block FlourideBlock = new com.dahugebigbang.MoreStuff.blocks.BlockFlourideBlock(5009, Material.ground);
        
        Block BlockTitaniumOre;
        public static Block TitaniumOre = new com.dahugebigbang.MoreStuff.blocks.BlockTitaniumOre(5010, Material.sponge);
        
        Block BlockSuperMegaTurboHurtyShotgunCombo;
        public static Block SuperMegaTurboHurtyShotgunCombo = new com.dahugebigbang.MoreStuff.blocks.BlockSuperMegaTurboHurtyShotgunCombo(5011, Material.ground);
        
        Block BlockPopcornOre;
        public static Block PopcornOre = new com.dahugebigbang.MoreStuff.blocks.PopcornOre(5012, Material.ground);
        
        Block BlockPetrifiedWoodOre;
        public static Block PetrifiedWoodOre = new com.dahugebigbang.MoreStuff.blocks.BlockPetrifiedWoodOre(5013, Material.ground);
        
        Block BlockPlant;
        public static Block Plant = new com.dahugebigbang.MoreStuff.blocks.BlockPlant(5014, Material.grass).setBlockTextureName("MoreStuff:crops");
        
        
        
        
        
        
        
        //WG
        public static FlourideOreWG worldgen1 = new FlourideOreWG();
        
        public static GemOreWG worldgen2 = new GemOreWG();
        
        public static CherryOreWG worldgen3 = new CherryOreWG();
        
        public static TungstenOreWG worldgen4 = new TungstenOreWG();
        
        public static TitaniumOreWG worldgen5 = new TitaniumOreWG();
        
        public static SuperMegaTurboHurtyShotgunComboWG worldgen6 = new SuperMegaTurboHurtyShotgunComboWG();
        
        public static PopcornOreWG worldgen7 = new PopcornOreWG();
        
        
		//ToolMaterials
        static ToolMaterial flourideM = EnumHelper.addToolMaterial("FlourideM", 4, 2500, 10.0F, 4.5F, 15);
    	static ToolMaterial gemM = EnumHelper.addToolMaterial("GemM", 10, 3512, 18.0F, 11.0F, 80);
    	static ToolMaterial combatSword = EnumHelper.addToolMaterial("combatSword", 1, 4000, 15.0F, 6.5F, 30);
    	static ToolMaterial WheatTool = EnumHelper.addToolMaterial("WheatTool", 0, 10, 4.0F, 3.0F, 35);
    	static ToolMaterial gia = EnumHelper.addToolMaterial("gia", 4, 1000, 15.5F, 5.0F, 43);
    	static ToolMaterial MS = EnumHelper.addToolMaterial("MS", 0, 2000, 1.0F, 6.0F, 60);
    	static ToolMaterial SiF = EnumHelper.addToolMaterial("SiF", 0, 40, 1.0F, 0.0F, 0);
    	static ToolMaterial ToastM = EnumHelper.addToolMaterial("ToastM", 1, 57, 5.0F, 3.5F, 40);
    	static ToolMaterial BreadM = EnumHelper.addToolMaterial("BreadM", 1, 15, 4.5F, 3.5F, 40);
    	static ToolMaterial Star = EnumHelper.addToolMaterial("NStar", 6, 10000, 100.0F, 100.0F, 300);
    	static ToolMaterial Tungsten = EnumHelper.addToolMaterial("Tungsten", 4, 1999, 1.0F, 7.0F, 60);
    	static ToolMaterial TitaniumM = EnumHelper.addToolMaterial("TitaniumM", 5, 2512, 15.0F, 10.0F, 65);
    	static ToolMaterial SuperTool = EnumHelper.addToolMaterial("SuperTool", 6, 2999, 30.0F, 5.0F, 100);
    	
    	
    	//ArmorMaterials (name, durability, reductionAmounts, enchantability)
    	public static ArmorMaterial FlourideArmor = EnumHelper.addArmorMaterial("FlourideA", 100, new int[]{5, 6, 5, 4}, 30);
    	public static ArmorMaterial GemArmor = EnumHelper.addArmorMaterial("GemA", 200, new int[]{8, 8, 8, 8}, 60);
    	public static ArmorMaterial TungstenArmor = EnumHelper.addArmorMaterial("TungstenA", 199, new int[]{8, 9, 9, 8}, 50);
    	public static ArmorMaterial TitaniumArmor = EnumHelper.addArmorMaterial("TitaniumA", 150, new int[]{7, 7, 7, 7}, 50);
    	public static ArmorMaterial LC = EnumHelper.addArmorMaterial("LC", 56, new int[]{0, 0, 3, 0}, 40);
    	public static ArmorMaterial MagentaCoat = EnumHelper.addArmorMaterial("MagentaCoat", 40, new int[]{1, 2, 1, 1}, 20);
    	
    	 
	    
	    //Tools
        final static Item FlouridePickaxe =new FlouridePickaxe(4901, flourideM);
    	final static Item FlourideSword =new FlourideSword(4902, flourideM);
    	final static Item FlourideAxe =new FlourideAxe(4903, flourideM);
    	final static Item FlourideSpade =new FlourideShovel(4904, flourideM);
    	final static Item FlourideHoe =new FlourideHoe(4905, flourideM);
    	final static Item MultiTool =new MultiTool(4010, gemM);
    	final static Item CombatSword =new CombatSword(4010, combatSword);
    	final static Item WheatSword =new WheatSword(4018, WheatTool);
    	final static Item WheatPickaxe =new WheatPickaxe(4019, WheatTool);
    	final static Item WheatAxe =new WheatAxe(4020, WheatTool);
    	final static Item WheatSpade =new WheatSpade(4021, WheatTool);
    	final static Item WheatHoe =new WheatHoe(4022, WheatTool);
    	final static Item GemSword =new GemSword(4027, gemM);
    	final static Item GemPickaxe =new GemPickaxe(4028, gemM);
    	final static Item GemAxe =new GemAxe(4029, gemM);
    	final static Item GemSpade =new GemSpade(4030, gemM);
    	final static Item GemHoe =new GemHoe(4031, gemM);
    	final static Item GIASword =new com.dahugebigbang.MoreStuff.tools.GIASword(4033, gia);
    	final static Item GIAPickaxe =new GIAPickaxe(4034, gia);
    	final static Item GIAAxe =new GIAAxe(4036, gia);
    	final static Item GIASpade =new GIASpade(4041, gia);
    	final static Item GIAHoe =new GIAHoe(4042, gia);
    	final static Item Sifter =new Sifter(4040, SiF);
    	final static Item ToastSword =new ToastSword(4041, ToastM);
    	final static Item ToastPickaxe =new ToastPickaxe(4042, ToastM);
    	final static Item ToastAxe =new ToastAxe(4043, ToastM);
    	final static Item ToastSpade =new ToastSpade(4044, ToastM);
    	final static Item ToastHoe =new ToastHoe(4045, ToastM);
    	final static Item NetherStarSword =new NetherStarSword(4051, Star);
    	final static Item BreadSword =new BreadSword(4053, BreadM);
    	final static Item BreadPickaxe =new BreadPickaxe(4054, BreadM);
    	final static Item BreadAxe =new BreadAxe(4054, BreadM);
    	final static Item BreadSpade =new BreadSpade(4054, BreadM);
    	final static Item BreadHoe =new BreadHoe(4054, BreadM);
    	final static Item MagicSword =new MagicSword(4038, MS);
    	final static Item TungstenSword =new TungstenSword(4068, Tungsten);
    	final static Item TungstenPickaxe =new TungstenPickaxe(4069, Tungsten);
    	final static Item TungstenAxe =new TungstenAxe(4068, Tungsten);
    	final static Item TungstenShovel =new TungstenShovel(4070, Tungsten);
    	final static Item TungstenHoe =new TungstenHoe(4071, Tungsten);
    	final static Item TitaniumSword =new TitaniumSword(4081, TitaniumM);
    	final static Item TitaniumPickaxe =new TitaniumPickaxe(4082, TitaniumM);
    	final static Item TitaniumAxe =new TitaniumAxe(4083, TitaniumM);
    	final static Item TitaniumShovel =new TitaniumShovel(4084, TitaniumM);
    	final static Item TitaniumHoe =new TitaniumHoe(4085, TitaniumM);
    	final static Item SuperPickaxe =new SuperPickaxe(6063, SuperTool);
    	final static Item SuperAxe =new SuperAxe(6064, SuperTool);
    	final static Item SuperShovel =new SuperShovel(6065, SuperTool);
    	final static Item SuperHoe =new SuperHoe(6066, SuperTool);
    	
    	
    	
    	
    	
    	
    	//Armor
        public static Item FlourideHelmet = new FlourideArmor(FlourideArmor, Flouride1, 0).setUnlocalizedName("FlourideHelmet").setTextureName("MoreStuff:FlourideHelmet");
    	public static Item FlourideChestplate = new FlourideArmor(FlourideArmor, Flouride2, 1).setUnlocalizedName("FlourideChestplate").setTextureName("MoreStuff:FlourideChestplate");
    	public static Item FlourideLeggings = new FlourideArmor(FlourideArmor, Flouride3, 2).setUnlocalizedName("FlourideLeggings").setTextureName("MoreStuff:FlourideLeggings");
    	public static Item FlourideBoots = new FlourideArmor(FlourideArmor, Flouride4, 3).setUnlocalizedName("FlourideBoots").setTextureName("MoreStuff:FlourideBoots");
    	public static Item GemHelmet = new GemArmor(GemArmor, Gem1, 0).setUnlocalizedName("GemHelmet").setTextureName("MoreStuff:GemHelmet");
    	public static Item GemChestplate = new GemArmor(GemArmor, Gem2, 1).setUnlocalizedName("GemChestplate").setTextureName("MoreStuff:GemChestplate");
    	public static Item GemLeggings = new GemArmor(GemArmor, Gem3, 2).setUnlocalizedName("GemLeggings").setTextureName("MoreStuff:GemLeggings");
    	public static Item GemBoots = new GemArmor(GemArmor, Gem4, 3).setUnlocalizedName("GemBoots").setTextureName("MoreStuff:GemBoots");
    	public static Item TungstenHelmet = new TungstenArmor(TungstenArmor, Tungsten1, 0).setUnlocalizedName("TungstenHelmet").setTextureName("MoreStuff:TungstenHelmet");
    	public static Item TungstenChestplate = new TungstenArmor(TungstenArmor, Tungsten2, 1).setUnlocalizedName("TungstenChestplate").setTextureName("MoreStuff:TungstenChestplate");
    	public static Item TungstenLeggings = new TungstenArmor(TungstenArmor, Tungsten3, 2).setUnlocalizedName("TungstenLeggings").setTextureName("MoreStuff:TungstenLeggings");
    	public static Item TungstenBoots = new TungstenArmor(TungstenArmor, Tungsten4, 3).setUnlocalizedName("TungstenBoots").setTextureName("MoreStuff:TungstenBoots");
    	public static Item TitaniumHelmet = new TitaniumArmor(TitaniumArmor, Titanium1, 0).setUnlocalizedName("TitaniumHelmet").setTextureName("MoreStuff:TitaniumHelmet");
    	public static Item TitaniumChestplate = new TitaniumArmor(TitaniumArmor, Titanium2, 1).setUnlocalizedName("TitaniumChestplate").setTextureName("MoreStuff:TitaniumChestplate");
    	public static Item TitaniumLeggings = new TitaniumArmor(TitaniumArmor, Titanium3, 2).setUnlocalizedName("TitaniumLeggings").setTextureName("MoreStuff:TitaniumLeggings");
    	public static Item TitaniumBoots = new TitaniumArmor(TitaniumArmor, Titanium4, 3).setUnlocalizedName("TitaniumBoots").setTextureName("MoreStuff:TitaniumBoots");
    	public static Item LoCH = new LC(LC, LC1, 0).setUnlocalizedName("LCH").setTextureName("MoreStuff:LCH");
    	public static Item LoChest = new LC(LC, LC2, 1).setUnlocalizedName("LChest").setTextureName("MoreStuff:LCH");
    	public static Item LoC = new LC(LC, LC3, 2).setUnlocalizedName("LoC").setTextureName("MoreStuff:LoC");
    	public static Item LoCBoots = new LC(LC, LC4, 3).setUnlocalizedName("LoCBoots").setTextureName("MoreStuff:LoCBoots");
    	public static Item MagentaHelmet = new MagentaCoat(MagentaCoat, Magenta1, 0).setUnlocalizedName("MagentaHelmet").setTextureName("MoreStuff:MagentaHelmet");
    	public static Item MagentaChestplate = new MagentaCoat(MagentaCoat, Magenta2, 1).setUnlocalizedName("MagentaChestplate").setTextureName("MoreStuff:MagentaChestplate");
    	public static Item MagentaLeggings = new MagentaCoat(MagentaCoat, Magenta3, 2).setUnlocalizedName("MagentaLeggings").setTextureName("MoreStuff:MagentaLeggings");
    	public static Item MagentaBoots = new MagentaCoat(MagentaCoat, Magenta4, 3).setUnlocalizedName("MagentaBoots").setTextureName("MoreStuff:MagentaBoots");
    	
    	
    	
   
    	
    	
    	
    	
    	
       
        
        
        
        
        
        
        
	    @EventHandler
	    public void preInit(FMLPreInitializationEvent event){
	    	
	    
	    	
	    //ItemRegistry	
	    	GameRegistry.registerItem(Matrix, "Matrix");
	    	GameRegistry.registerItem(Flouride, "Flouride");
	    	GameRegistry.registerItem(Toast, "Toast");
	    	GameRegistry.registerItem(ButteredToast, "ButteredToast");
	    	GameRegistry.registerItem(Butter, "Butter");
	    	GameRegistry.registerItem(Orb, "Orb");
	    	GameRegistry.registerItem(WheatBundle, "WheatBundle");
	    	GameRegistry.registerItem(GoldOreDust, "GoldOreDust");
	    	GameRegistry.registerItem(IronOreDust, "IronOreDust");
	    	GameRegistry.registerItem(Gem, "Gem");
	    	GameRegistry.registerItem(FlourideOreDust, "FlourideOreDust");
	    	GameRegistry.registerItem(HeavySugar, "HeavySugar");
	    	GameRegistry.registerItem(GIA, "GIA");
	    	GameRegistry.registerItem(StrengthToast, "StrengthToast");
	    	GameRegistry.registerItem(HasteToast, "HasteToast");
	    	GameRegistry.registerItem(HealthToast, "HealthToast");
	    	GameRegistry.registerItem(SpeedToast, "SpeedToast");
	    	GameRegistry.registerItem(InvisToast, "InvisToast");
	    	GameRegistry.registerItem(JumpToast, "JumpToast");
	    	GameRegistry.registerItem(WBToast, "WBToast");
	    	GameRegistry.registerItem(SuperSpeedToast, "SuperSpeedToast");
	    	GameRegistry.registerItem(SilkWhisp, "SilkWhisp");
	    	GameRegistry.registerItem(SilkFiber, "SilkFiber");
	    	GameRegistry.registerItem(NetherMatrix, "NetherMatrix");
	    	GameRegistry.registerItem(GoldenAppleJuice, "GoldenAppleJuice");
	    	GameRegistry.registerItem(NoteK, "NoteK");
	    	GameRegistry.registerItem(QToast, "QToast");
	    	GameRegistry.registerItem(Cherry, "Cherry");
	    	GameRegistry.registerItem(BC, "BC");
	    	GameRegistry.registerItem(SpeedC, "SpeedC");
	    	GameRegistry.registerItem(StrengthC, "StrengthC");
	    	GameRegistry.registerItem(HasteC, "HasteC");
	    	GameRegistry.registerItem(HealthC, "HealthC");
	    	GameRegistry.registerItem(JumpC, "JumpC");
	    	GameRegistry.registerItem(WBC, "WBC");
	    	GameRegistry.registerItem(RegenC, "RegenC");
	    	GameRegistry.registerItem(CherryJuice, "CherryJuice");
	    	GameRegistry.registerItem(Squeezer, "Squeezer");
	    	GameRegistry.registerItem(RS, "RSifter");
	    	GameRegistry.registerItem(ReinforcedSilk, "ReinforcedSilk");
	    	GameRegistry.registerItem(ITungsten, "ITungsten");
	    	GameRegistry.registerItem(TungstenOreDust, "TungstenOreDust");
	    	GameRegistry.registerItem(TitaniumOreDust, "TitaniumOreDust");
	    	GameRegistry.registerItem(Titanium, "TitaniumIngot");
	    	GameRegistry.registerItem(Popcorn, "Popcorn");
	    	
	    	
	    	
	    	/*
	    	 * Dungeon Chest Item Gen
	    	 * ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(Item), minimum count of items that can spawn, maximum count, rarity; 0 = god apple rarity 100 = iron rarity));
	    	 */
	    	
	    	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.Sifter), 1, 1, 80));
	    	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.Sifter), 1, 1, 80));
	    	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.FlourideOreDust), 1, 3, 70));
	    	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.FlourideChestplate), 1, 3, 70));
	    	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.Toast), 1, 2, 60));
	    	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(MoreStuff.Toast), 1, 2, 60));
	    	
	    	//armorregistry
	    	GameRegistry.registerItem(FlourideHelmet, "FlourideHelmet");
	    	GameRegistry.registerItem(FlourideChestplate, "FlourideChestplate");
	    	GameRegistry.registerItem(FlourideLeggings, "FlourideLeggings");
	    	GameRegistry.registerItem(FlourideBoots, "FlourideBoots");
	    	GameRegistry.registerItem(GemHelmet, "GemHelmet");
	    	GameRegistry.registerItem(GemChestplate, "GemChestplate");
	    	GameRegistry.registerItem(GemLeggings, "GemLeggings");
	    	GameRegistry.registerItem(GemBoots, "GemBoots");
	    	GameRegistry.registerItem(TungstenHelmet, "TungstenHelmet");
	    	GameRegistry.registerItem(TungstenChestplate, "TungstenChestplate");
	    	GameRegistry.registerItem(TungstenLeggings, "TungstenLeggings");
	    	GameRegistry.registerItem(TungstenBoots, "TungstenBoots");
	    	GameRegistry.registerItem(TitaniumHelmet, "TitaniumHelmet");
	    	GameRegistry.registerItem(TitaniumChestplate, "TitaniumChestplate");
	    	GameRegistry.registerItem(TitaniumLeggings, "TitaniumLeggings");
	    	GameRegistry.registerItem(TitaniumBoots, "TitaniumBoots");
	    	
	    	GameRegistry.registerItem(MagentaChestplate, "MagentaChestplate");
	    	
	    	
	    	
	  
	    //BlockRegistry
	        	GameRegistry.registerBlock(Crystal, "Crystal");
	        	GameRegistry.registerBlock(ButterBlock, "ButterBlock");
	        	GameRegistry.registerBlock(FlourideOre, "FlourideOre");
	        	GameRegistry.registerBlock(GemOre, "GemOre");
	        	GameRegistry.registerBlock(CherryOre, "CherryOre");
	        	GameRegistry.registerBlock(FlourideBlock, "FlourideBlock");
	        	GameRegistry.registerBlock(TungstenOre, "TungstenOre");
	        	GameRegistry.registerBlock(TitaniumOre, "TitaniumOre");
	        	GameRegistry.registerBlock(SuperMegaTurboHurtyShotgunCombo, "SuperMegaTurboHurtyShotgunCombo");
	        	GameRegistry.registerBlock(Plant, "Plant");
	        	GameRegistry.registerBlock(PopcornOre, "PopcornOre");
	        	GameRegistry.registerBlock(PetrifiedWoodOre, "PetrifiedWoodOre");
	            
	        	
	   
	    
	    	
	    //TileEntityRegistry
	        	GameRegistry.registerTileEntity(OreDoublerTileEntity.class, "OreDoublerTileEntity");
	    	
	    //Tool GameRegistry
	    	GameRegistry.registerItem(FlouridePickaxe, "Flouride Pickaxe");
	    	GameRegistry.registerItem(FlourideSword, "Flouride Sword");
	    	GameRegistry.registerItem(FlourideAxe, "Flouride Axe");
	    	GameRegistry.registerItem(FlourideSpade, "Flouride Shovel");
	    	GameRegistry.registerItem(FlourideHoe, "Flouride Hoe");
	    	GameRegistry.registerItem(CombatSword, "CombatSword");
	    	GameRegistry.registerItem(MultiTool, "MultiTool");
	    	GameRegistry.registerItem(WheatSword, "WheatSword");
	    	GameRegistry.registerItem(WheatPickaxe, "WheatPickaxe");
	    	GameRegistry.registerItem(WheatAxe, "WheatAxe");
	    	GameRegistry.registerItem(WheatSpade, "WheatSpade");
	    	GameRegistry.registerItem(WheatHoe, "WheatHoe");
	    	GameRegistry.registerItem(GemSword, "GemSword");
	    	GameRegistry.registerItem(GemPickaxe, "GemPickaxe");
	    	GameRegistry.registerItem(GemAxe, "GemAxe");
	    	GameRegistry.registerItem(GemSpade, "GemShovel");
	    	GameRegistry.registerItem(GemHoe, "GemHoe");
	    	GameRegistry.registerItem(GIASword, "GIASword");
	    	GameRegistry.registerItem(GIAPickaxe, "GIAPickaxe");
	    	GameRegistry.registerItem(GIAAxe, "GIAAxe");
	    	GameRegistry.registerItem(GIASpade, "GIASpade");
	    	GameRegistry.registerItem(GIAHoe, "GIAHoe");
	    	GameRegistry.registerItem(Sifter, "Sifter");
	    	GameRegistry.registerItem(ToastSword, "ToastSword");
	    	GameRegistry.registerItem(ToastPickaxe, "ToastPickaxe");
	    	GameRegistry.registerItem(ToastAxe, "ToastAxe");
	    	GameRegistry.registerItem(ToastSpade, "ToastSpade");
	    	GameRegistry.registerItem(ToastHoe, "ToastHoe");
	    	GameRegistry.registerItem(NetherStarSword, "NSSword");
	    	GameRegistry.registerItem(BreadSword, "BreadSword");
	    	GameRegistry.registerItem(BreadPickaxe, "BreadPickaxe");
	    	GameRegistry.registerItem(BreadAxe, "BreadAxe");
	    	GameRegistry.registerItem(BreadSpade, "BreadSpade");
	    	GameRegistry.registerItem(BreadHoe, "BreadHoe");
	    	GameRegistry.registerItem(TungstenSword, "TungstenSword");
	    	GameRegistry.registerItem(TungstenPickaxe, "TungstenPickaxe");
	    	GameRegistry.registerItem(TungstenAxe, "TungstenAxe");
	    	GameRegistry.registerItem(TungstenShovel, "TungstenShovel");
	    	GameRegistry.registerItem(TungstenHoe, "TungstenHoe");
	    	GameRegistry.registerItem(TitaniumSword, "TitaniumSword");
	    	GameRegistry.registerItem(TitaniumPickaxe, "TitaniumPickaxe");
	    	GameRegistry.registerItem(TitaniumAxe, "TitaniumAxe");
	    	GameRegistry.registerItem(TitaniumShovel, "TitaniumShovel");
	    	GameRegistry.registerItem(TitaniumHoe, "TitaniumHoe");
	    	GameRegistry.registerItem(SuperPickaxe, "SuperPickaxe");
	    	GameRegistry.registerItem(SuperAxe, "SuperAxe");
	    	GameRegistry.registerItem(SuperShovel, "SuperShovel");
	    	GameRegistry.registerItem(SuperHoe, "SuperHoe");
	    	
	    	
	    	
	    	
	    	
	    	//WG registry
	    	GameRegistry.registerWorldGenerator(worldgen1, 1);
	    	GameRegistry.registerWorldGenerator(worldgen2, 1);
	    	GameRegistry.registerWorldGenerator(worldgen3, 1);
	    	GameRegistry.registerWorldGenerator(worldgen4, 1);
	    	GameRegistry.registerWorldGenerator(worldgen5, 1);
	    	GameRegistry.registerWorldGenerator(worldgen6, 1);
	    	GameRegistry.registerWorldGenerator(worldgen7, 1);
	    	
	    	
	    	
	    	 
	    	
	        
	    	
	    	
	    //recipes
    GameRegistry.addRecipe(new ItemStack (MoreStuff.MagentaChestplate), new Object []{
    "ABA",
    "AAA",
    "AAA",
    'A' , Items.dye
    });
	    	
	GameRegistry .addRecipe(new ItemStack (MoreStuff.HeavySugar), new Object []{
    "AAA" ,
    "AAA" ,
    "AAA" ,
    'A' , Items.sugar
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.RS), new Object []{
    "ABA",
    "ABA",
    "ABA",
    'A' , Items.stick , 'B' , MoreStuff.ReinforcedSilk
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.SpeedC), new Object []{
    "AAA",
    "ABA",
    "AAA",
    'A' , MoreStuff.HeavySugar , 'B' , MoreStuff.BC
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.StrengthC), new Object []{
        "AAA",
        "ABA",
        "AAA",
        'A' , Items.blaze_powder , 'B' , MoreStuff.BC
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.HasteC), new Object []{
        "AAA",
        "ABA",
        "AAA",
        'A' , Items.leather_boots , 'B' , MoreStuff.BC
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.HealthC), new Object []{
        "CAC",
        "ABA",
        "CAC",
        'A' , Items.gold_ingot , 'B' , MoreStuff.BC , 'C' , Items.melon
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.JumpC), new Object []{
        "AAA",
        "ABA",
        "AAA",
        'A' , MoreStuff.SilkFiber , 'B' , MoreStuff.BC
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.WBC), new Object []{
        "AAA",
        "ABA",
        "AAA",
        'A' , Items.fish , 'B' , MoreStuff.BC
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.RegenC), new Object []{
        "AAA",
        "ABA",
        "AAA",
        'A' , Items.ghast_tear , 'B' , MoreStuff.BC
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.BC), new Object []{
    "AAA",
    "ABA",
    "AAA",
    'A' , Items.dye , 'B' , Items.glass_bottle
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.Squeezer), new Object []{
    "AAA",
    "ABA",
    "AAA",
    'A' , Blocks.stone , 'B' , MoreStuff.Sifter
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GoldenAppleJuice), new Object []{
    "AAA",
    "ABA",
    "AAA",
    'A' , Items.golden_apple , 'B' , Items.glass_bottle
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.NetherMatrix), new Object []{
    "AAA" ,
    "ABA" ,
    "AAA" ,
    'A' , Items.nether_star , 'B' , MoreStuff.Matrix
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.Sifter), new Object []{
    "ABA" ,
    "ABA" ,
    "ABA" ,
    'A' , Items.stick , 'B' , MoreStuff.SilkFiber
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideBlock), new Object []{
    "AAA",
    "AAA",
    "AAA",
    'A' , MoreStuff.Flouride
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GIA), new Object []{
    "AAA" ,
    "ABA" ,
    "AAA" ,
    'A' , Items.iron_ingot , 'B' , Blocks.gold_block
    });
    GameRegistry .addRecipe(new ItemStack (Blocks.enchanting_table), new Object []{
    	"ABA" ,
    	"CCC" ,
    	"CCC" ,
    	'B' , Items.ender_eye , 'C' , Blocks.obsidian
    });
    GameRegistry .addRecipe(new ItemStack (Blocks.brewing_stand), new Object []{
    		"ACA" ,
    		"ABA" ,
    		"DFD" ,
    		'C' , Items.ender_eye , 'B' , Items.ender_pearl , 'D' , Blocks.obsidian , 'F' , Blocks.cobblestone
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.Crystal, 5), new Object []{
    	"AAA" ,
    	"ABA" ,
    	"AAA" ,
    	'A' , Blocks.glass , 'B' , Items.diamond
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.Matrix), new Object []{
    	"ABA" ,
    	"BCB" ,
    	"ABA" ,
    	'A' , Items.iron_ingot , 'B' , Items.gold_ingot , 'C' , Items.ender_pearl
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.ButterBlock), new Object []{
    	"AAA" ,
    	"AAA" ,
    	"AAA" ,
    	'A' , MoreStuff.Butter
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideSword), new Object []{
    	"PAP" ,
    	"PAP" ,
    	"PCP" ,
    	'A' , MoreStuff.Flouride , 'C' , Items.stick
    	});
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlouridePickaxe), new Object []{
    	"AAA" ,
    	"CBC" ,
    	"CBC" ,
    	'A' , MoreStuff.Flouride , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideAxe), new Object []{
    	"AAC" ,
    	"ABC" ,
    	"CBC" ,
    	'A' , MoreStuff.Flouride , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideSpade), new Object []{
    	"ABA" ,
    	"ACA" ,
    	"ACA" ,
    	'B' , MoreStuff.Flouride , 'C' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideHoe), new Object []{
    	"AAC" ,
    	"CBC" ,
    	"CBC" ,
    	'A' , MoreStuff.Flouride , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideHelmet), new Object[]{
    "AAA",
    "ABA",
    "BBB",
    'A' , MoreStuff.Flouride
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideChestplate), new Object[]{
        "ABA",
        "AAA",
        "AAA",
        'A' , MoreStuff.Flouride
        });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideLeggings), new Object[]{
        "AAA",
        "ABA",
        "ABA",
        'A' , MoreStuff.Flouride
        });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.FlourideBoots), new Object[]{
        "BBB",
        "ABA",
        "ABA",
        'A' , MoreStuff.Flouride
        });
    
    GameRegistry.addRecipe(new ItemStack (MoreStuff.CombatSword), new Object []{
    "PAP" ,
    "PCP" ,
    "PBP" ,
    'A' , MoreStuff.Matrix , 'C' , Blocks.gold_block , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatBundle), new Object []{
    "AAB" ,
    "AAB" ,
    "AAB" ,
    'A' , Items.wheat
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatSword), new Object []{
    "CAC" ,
    "CAC" ,
    "CBC" ,
    'A' , MoreStuff.WheatBundle , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatPickaxe), new Object []{
    "AAA" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.WheatBundle , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatAxe), new Object []{
    "AAC" ,
    "ABC" ,
    "CBC" ,
    'A' , MoreStuff.WheatBundle , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatSpade), new Object []{
    "ABA" ,
    "ACA" ,
    "ACA" ,
    'B' , MoreStuff.WheatBundle , 'C' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.WheatHoe), new Object []{
    "AAC" , 
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.WheatBundle , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GemSword), new Object []{
    "CAC" ,
    "CAC" ,
    "CBC" ,
    'A' , MoreStuff.Gem , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GemPickaxe), new Object []{
    "AAA" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.Gem , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GemAxe), new Object []{
    "AAC" ,
    "ABC" ,
    "CBC" ,
    'A' , MoreStuff.Gem , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GemSpade), new Object []{
    "CAC" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.Gem , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack (MoreStuff.GemHoe), new Object []{
    "AAC" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.Gem , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.SuperSpeedToast), new Object []{
    "AAA" ,
    "AAA" ,
    "AAA" ,
    'A' , MoreStuff.SpeedToast
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.GIASword), new Object []{
    "CAC" ,
    "CAC" ,
    "CBC" ,
    'A' , MoreStuff.GIA , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.GIAPickaxe), new Object []{
    "AAA", 
    "CBC",
    "CBC",
    'A' , MoreStuff.GIA , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.GIAAxe), new Object []{
    "AAC" ,
    "ABC" ,
    "CBC" ,
    'A' , MoreStuff.GIA , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.GIASpade), new Object []{
    "CAC" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.GIA , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.GIAHoe), new Object []{
    "AAC" ,
    "CBC" ,
    "CBC" ,
    'A' , MoreStuff.GIA , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenSword), new Object []{
    "CAC",
    "CAC",
    "CBC",
    'A' , MoreStuff.ITungsten , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenPickaxe), new Object []{
    "AAA",
    "CBC",
    "CBC",
    'A' , MoreStuff.ITungsten , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenAxe), new Object []{
    "AAC",
    "ABC",
    "CBC",
    'A' , MoreStuff.ITungsten , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenShovel), new Object []{
    "CAC",
    "CBC",
    "CBC",
    'A' , MoreStuff.ITungsten , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenHoe), new Object []{
    "AAC",
    "CBC",
    "CBC",
    'A' , MoreStuff.ITungsten , 'B' , Items.stick
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenHelmet), new Object []{
    "AAA",
    "ABA",
    "BBB",
    'A' , MoreStuff.ITungsten
    });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenChestplate), new Object []{
        "ABA",
        "AAA",
        "AAA",
        'A' , MoreStuff.ITungsten
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenLeggings), new Object []{
        "AAA",
        "ABA",
        "ABA",
        'A' , MoreStuff.ITungsten
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TungstenBoots), new Object []{
        "BBB",
        "ABA",
        "ABA",
        'A' , MoreStuff.ITungsten
        });
    GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumSword), new Object []{
        "CAC",
        "CAC",
        "CBC",
        'A' , MoreStuff.Titanium , 'B' , Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumPickaxe), new Object []{
        "AAA",
        "CBC",
        "CBC",
        'A' , MoreStuff.Titanium , 'B' , Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumAxe), new Object []{
        "AAC",
        "ABC",
        "CBC",
        'A' , MoreStuff.Titanium , 'B' , Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumShovel), new Object []{
        "CAC",
        "CBC",
        "CBC",
        'A' , MoreStuff.Titanium , 'B' , Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumHoe), new Object []{
        "AAC",
        "CBC",
        "CBC",
        'A' , MoreStuff.Titanium , 'B' , Items.stick
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumHelmet), new Object []{
        "AAA",
        "ABA",
        "BBB",
        'A' , MoreStuff.Titanium
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumChestplate), new Object []{
            "ABA",
            "AAA",
            "AAA",
        'A' , MoreStuff.Titanium
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumLeggings), new Object []{
            "AAA",
            "ABA",
            "ABA",
            'A' , MoreStuff.Titanium
            });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.TitaniumBoots), new Object []{
            "BBB",
            "ABA",
            "ABA",
            'A' , MoreStuff.Titanium
            });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.LoC), new Object []{
        "CCC",
        "ABA",
        "CAC",
        'A' , Items.leather , 'B' , Items.string
        });
        GameRegistry.addRecipe(new ItemStack(MoreStuff.GemHelmet), new Object []{
            "AAA",
            "ABA",
            "BBB",
            'A' , MoreStuff.Gem
            });
            GameRegistry.addRecipe(new ItemStack(MoreStuff.GemChestplate), new Object []{
                "ABA",
                "AAA",
                "AAA",
            'A' , MoreStuff.Gem
            });
            GameRegistry.addRecipe(new ItemStack(MoreStuff.GemLeggings), new Object []{
                "AAA",
                "ABA",
                "ABA",
                'A' , MoreStuff.Gem
                });
            GameRegistry.addRecipe(new ItemStack(MoreStuff.GemBoots), new Object []{
                "BBB",
                "ABA",
                "ABA",
                'A' , MoreStuff.Gem
             });
    
    
    
    
    
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.ButteredToast), new ItemStack(MoreStuff.Toast), new ItemStack(MoreStuff.Butter));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.Butter, 2), new ItemStack(Items.milk_bucket));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SilkWhisp), new ItemStack(Items.string), new ItemStack(Items.string));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SilkFiber), new ItemStack(MoreStuff.SilkWhisp), new ItemStack(MoreStuff.SilkWhisp));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.GoldOreDust, 2), new ItemStack(MoreStuff.Sifter, 1, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.IronOreDust, 2), new ItemStack(MoreStuff.Sifter, 1, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.FlourideOreDust, 2), new ItemStack(MoreStuff.Sifter, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.FlourideOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.TungstenOreDust, 2), new ItemStack(MoreStuff.Sifter, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.TungstenOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.TitaniumOreDust, 2), new ItemStack(MoreStuff.Sifter, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.TitaniumOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.GoldOreDust, 2), new ItemStack(MoreStuff.RS, 1, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.gold_ore));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.IronOreDust, 2), new ItemStack(MoreStuff.RS, 1, OreDictionary.WILDCARD_VALUE), new ItemStack (Blocks.iron_ore));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.TitaniumOreDust, 2), new ItemStack(MoreStuff.RS, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.TitaniumOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.FlourideOreDust, 2), new ItemStack(MoreStuff.RS, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.FlourideOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.TungstenOreDust, 2), new ItemStack(MoreStuff.RS, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.TungstenOre));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SpeedToast), new ItemStack(MoreStuff.HeavySugar), new ItemStack(MoreStuff.Toast));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.HealthToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.speckled_melon));
    GameRegistry.addShapelessRecipe(new ItemStack (MoreStuff.InvisToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.golden_carrot), new ItemStack(Items.fermented_spider_eye));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.HasteToast), new ItemStack(MoreStuff.Toast), new ItemStack(MoreStuff.Matrix));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.RegenToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.ghast_tear), new ItemStack(Blocks.glowstone));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.JumpToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.slime_ball));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.StrengthToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.blaze_powder), new ItemStack(Blocks.glowstone));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.WBToast), new ItemStack(MoreStuff.Toast), new ItemStack(Items.fish));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.QToast, 4), new ItemStack(MoreStuff.Toast));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.CherryJuice, 2), new ItemStack(MoreStuff.Squeezer, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(MoreStuff.Cherry));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.ReinforcedSilk), new ItemStack(MoreStuff.Titanium), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(MoreStuff.SilkFiber));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SuperPickaxe), new ItemStack(Items.wooden_pickaxe), new ItemStack(Items.stone_pickaxe), new ItemStack(Items.iron_pickaxe), new ItemStack(Items.golden_pickaxe), new ItemStack(Items.diamond_pickaxe), new ItemStack(MoreStuff.FlouridePickaxe));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SuperAxe), new ItemStack(Items.wooden_axe), new ItemStack(Items.stone_axe), new ItemStack(Items.iron_axe), new ItemStack(Items.golden_axe), new ItemStack(Items.diamond_axe), new ItemStack(MoreStuff.FlourideAxe));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SuperShovel), new ItemStack(Items.wooden_shovel), new ItemStack(Items.stone_shovel), new ItemStack(Items.iron_shovel), new ItemStack(Items.golden_shovel), new ItemStack(Items.diamond_shovel), new ItemStack(MoreStuff.FlourideSpade));
    GameRegistry.addShapelessRecipe(new ItemStack(MoreStuff.SuperHoe), new ItemStack(Items.wooden_hoe), new ItemStack(Items.stone_hoe), new ItemStack(Items.iron_hoe), new ItemStack(Items.golden_hoe), new ItemStack(Items.diamond_hoe), new ItemStack(MoreStuff.FlourideHoe));
    GameRegistry.addSmelting(MoreStuff.PopcornOre, new ItemStack(MoreStuff.Popcorn), 1.0F);
    GameRegistry.addSmelting(MoreStuff.CherryOre, new ItemStack(MoreStuff.Cherry), 1.0F);
    GameRegistry.addSmelting(MoreStuff.GoldOreDust, new ItemStack(Items.gold_ingot), 0.5F);
    GameRegistry.addSmelting(MoreStuff.IronOreDust, new ItemStack(Items.iron_ingot), 0.5F);
    GameRegistry.addSmelting(Items.bread, new ItemStack(MoreStuff.Toast), 2.0F);
    GameRegistry.addSmelting(MoreStuff.FlourideOre, new ItemStack(MoreStuff.Flouride), 1.5F);
    GameRegistry.addSmelting(MoreStuff.GemOre, new ItemStack(MoreStuff.Gem), 1.0F);
    GameRegistry.addSmelting(MoreStuff.TungstenOre, new ItemStack(MoreStuff.ITungsten), 3.0F);
    GameRegistry.addSmelting(MoreStuff.IronOreDust, new ItemStack(Items.iron_ingot), 1.0F);
    GameRegistry.addSmelting(MoreStuff.GoldOreDust, new ItemStack(Items.gold_ingot), 1.0F);
    GameRegistry.addSmelting(MoreStuff.FlourideOreDust, new ItemStack(MoreStuff.Flouride), 1.0F);
    GameRegistry.addSmelting(MoreStuff.WheatSword, new ItemStack(MoreStuff.BreadSword), 1.0F);
    GameRegistry.addSmelting(MoreStuff.WheatPickaxe, new ItemStack(MoreStuff.BreadPickaxe), 1.0F);
    GameRegistry.addSmelting(MoreStuff.WheatAxe, new ItemStack(MoreStuff.BreadAxe), 1.0F);
    GameRegistry.addSmelting(MoreStuff.WheatSpade, new ItemStack(MoreStuff.BreadSpade), 1.0F);
    GameRegistry.addSmelting(MoreStuff.WheatHoe, new ItemStack(MoreStuff.BreadHoe), 1.0F);
    GameRegistry.addSmelting(MoreStuff.BreadSword, new ItemStack(MoreStuff.ToastSword), 2.0F);
    GameRegistry.addSmelting(MoreStuff.BreadPickaxe, new ItemStack(MoreStuff.ToastPickaxe), 2.0F);
    GameRegistry.addSmelting(MoreStuff.BreadAxe, new ItemStack(MoreStuff.ToastAxe), 2.0F);
    GameRegistry.addSmelting(MoreStuff.BreadSpade, new ItemStack(MoreStuff.ToastSpade), 2.0F);
    GameRegistry.addSmelting(MoreStuff.BreadHoe, new ItemStack(MoreStuff.ToastHoe), 2.0F);
    GameRegistry.addSmelting(MoreStuff.TitaniumOre, new ItemStack(MoreStuff.Titanium), 2.0F);
    
    
  
	
	
	};

 
    
	    
    
    
	

	
	
	
	
	
	
	
	
	
	
		
	
	    
    
    
    
	    
	         
	         
    	        
	{   	

     {
	   
	    }
	    }






















	
	

















	


		}






















	
	






















	
	






















	
	

















	
	

	

