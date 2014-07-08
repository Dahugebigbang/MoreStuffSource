package com.dahugebigbang.MoreStuff.blocks.worldgeneration;

import java.util.Random;

import com.dahugebigbang.MoreStuff.MoreStuff;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class GemOreWG implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
		}
		
	}

	public void generateSurface(World world, Random random, int x, int z) {
		for(int i = 0; i < 4; i++) {
			int xcoords = x + random.nextInt(16);
			int Ycoords = random.nextInt(256);
			int zcoords = z + random.nextInt(16);
			new WorldGenMinable(MoreStuff.GemOre, 3).generate(world, random, xcoords, Ycoords, zcoords);
		}
		
		
	}

}
