package com.Jedi4.Medley.world.dimensions;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.IBiomeProviderSettings;
import net.minecraft.world.storage.WorldInfo;

public class MedleyBiomeProviderSettings implements IBiomeProviderSettings {
    private final long seed;
    private final WorldType worldType;
    private MedleyGenSettings generatorSettings = new MedleyGenSettings();

    public MedleyBiomeProviderSettings(WorldInfo info) {
        this.seed = info.getSeed();
        this.worldType = info.getGenerator();
    }

    public MedleyBiomeProviderSettings setGeneratorSettings(MedleyGenSettings settings) {
        this.generatorSettings = settings;
        return this;
    }

    public long getSeed() {
        return this.seed;
    }

    public WorldType getWorldType() {
        return this.worldType;
    }

    public MedleyGenSettings getGeneratorSettings() {
        return this.generatorSettings;
    }
}
