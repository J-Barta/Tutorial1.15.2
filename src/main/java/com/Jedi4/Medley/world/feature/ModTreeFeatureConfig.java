package com.Jedi4.Medley.world.feature;

import net.minecraft.world.gen.blockstateprovider.BlockStateProvider;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraft.world.gen.treedecorator.TreeDecorator;

import java.util.List;

public class ModTreeFeatureConfig extends TreeFeatureConfig {
    public ModTreeFeatureConfig(BlockStateProvider trunkProviderIn, BlockStateProvider leavesProviderIn, FoliagePlacer foliagePlacerIn, List<TreeDecorator> decoratorsIn, int baseHeightIn, int heightRandAIn, int heightRandBIn, int trunkHeightIn, int trunkHeightRandomIn, int trunkTopOffsetIn, int trunkTopOffsetRandomIn, int foliageHeightIn, int foliageHeightRandomIn, int maxWaterDepthIn, boolean ignoreVinesIn) {
        super(trunkProviderIn, leavesProviderIn, foliagePlacerIn, decoratorsIn, baseHeightIn, heightRandAIn, heightRandBIn, trunkHeightIn, trunkHeightRandomIn, trunkTopOffsetIn, trunkTopOffsetRandomIn, foliageHeightIn, foliageHeightRandomIn, maxWaterDepthIn, ignoreVinesIn);
    }
}
