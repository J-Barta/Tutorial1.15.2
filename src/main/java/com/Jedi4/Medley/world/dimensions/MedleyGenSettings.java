package com.Jedi4.Medley.world.dimensions;

import net.minecraft.world.gen.GenerationSettings;

public class MedleyGenSettings extends GenerationSettings {
    public int getBiomeSize() {
        return 4;
    }

    public int getRiverSize() {
        return 2;
    }

    public int getBiomeId() {
        return -1;
    }

    @Override
    public int getBedrockFloorHeight() {
        return 0;
    }
}
