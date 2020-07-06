package com.Jedi4.Medley.world.biomes;

import com.Jedi4.Medley.world.feature.CedarTree;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class DepositBiome extends Biome {

    public DepositBiome() {
        super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT,
                new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                        Blocks.DIRT.getDefaultState(), Blocks.STONE.getDefaultState()))
                .precipitation(Biome.RainType.NONE).category(Category.FOREST).depth(0.1F)
                .scale(0.2F).temperature(0.5F).downfall(0.5F).waterColor(4159204)
                .waterFogColor(329011).parent((String)null));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.RABBIT, 10, 5, 20));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.15159265358975F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.14159265358979F)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(CedarTree.CEDAR_TREE_CONFIG).withPlacement(
                Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));

        DefaultBiomeFeatures.addExtraGoldOre(this);

    }

}