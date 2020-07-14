package com.Jedi4.Medley.util;

import com.Jedi4.Medley.Dimension.ModDimension;
import com.Jedi4.Medley.medley;
import com.Jedi4.Medley.world.dimensions.MedleyDimension;
import net.minecraft.world.Dimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

    public static final DeferredRegister<Dimension> MOD_DIMESNIONS = DeferredRegister.create(ForgeRegistries.MOD_DIMENSIONS, medley.MOD_ID);

    public static final RegistryObject<ModDimension> MEDLEY_DIM = MOD_DIMESNIONS.register("medley_dimension", () -> new MedleyDimension());

}
