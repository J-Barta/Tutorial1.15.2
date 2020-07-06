package com.Jedi4.Medley.world.feature;

import com.Jedi4.Medley.util.RegistryHandler;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class CedarTree extends Tree {

    public static final TreeFeatureConfig CEDAR_TREE_CONFIG = (new ModTreeFeatureConfig.Builder
            (new SimpleBlockStateProvider(RegistryHandler.CEDAR_LOG.get().getDefaultState()),
                    new SimpleBlockStateProvider(RegistryHandler.CEDAR_LEAVES.get().getDefaultState()),
                    new BlobFoliagePlacer(2, 0))).baseHeight(8).heightRandA(10)
            .foliageHeight(3).ignoreVines().setSapling((IPlantable) RegistryHandler.CEDAR_SAPLING.get()).build();

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
        return Feature.NORMAL_TREE.withConfiguration(CEDAR_TREE_CONFIG);
    }
}


