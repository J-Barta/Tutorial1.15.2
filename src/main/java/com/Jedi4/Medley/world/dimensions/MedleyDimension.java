package com.Jedi4.Medley.world.dimensions;

import com.Jedi4.Medley.Dimension.Dimension;
import com.Jedi4.Medley.Dimension.ModDimension;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

import java.util.function.BiFunction;

public class MedleyDimension extends ModDimension {
    @Override
    public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
        return MedleyModDimension::new;
    }
}
