package com.Jedi4.Medley.util;

import com.Jedi4.Medley.medley;
import com.Jedi4.Medley.world.dimensions.MedleyDimension;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DimensionInit {

    public static final DeferredRegister<ModDimension> MOD_DIMESNIONS = new DeferredRegister<>(ForgeRegistries.MOD_DIMENSIONS, medley.MOD_ID);

    public static final RegistryObject<ModDimension> MEDLEY_DIM = MOD_DIMESNIONS.register("medley_dimension", () -> new MedleyDimension());

}
