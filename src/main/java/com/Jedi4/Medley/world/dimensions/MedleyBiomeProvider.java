package com.Jedi4.Medley.world.dimensions;

import com.Jedi4.Medley.util.BiomeInit;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MedleyBiomeProvider extends BiomeProvider {

    private static final Set<Biome> biomeList = ImmutableSet.of(BiomeInit.DEPOSIT_BIOME.get(), Biomes.THE_VOID);
    private Random rand;
    private final double biomeSize = 16.0D;
    private MedleyGenerator biomeNoise;

    public MedleyBiomeProvider(MedleyBiomeProviderSettings settings) {
        super(biomeList);
        rand = new Random();
        this.biomeNoise = new MedleyGenerator();
        this.biomeNoise.setSeed((int) settings.getSeed());
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z) {
        return getBiome(new LinkedList<Biome>(biomeList),
                biomeNoise.getValue((double) x / biomeSize, (double) y / biomeSize, (double) z / biomeSize));
    }

    public Biome getBiome(List<Biome> biomeList, double noiseVal) {
        for (int i = biomeList.size(); i >= 0; i--) {
            if (noiseVal > (2.0f / biomeList.size()) * i - 1)
                return biomeList.get(i);
        }
        return biomeList.get(biomeList.size() - 1);
    }
}
