package com.Jedi4.Medley.util;

import com.Jedi4.Medley.medley;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.world.RegisterDimensionsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = medley.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeEventBusSubscriber {
    @SubscribeEvent
    public static void registerDimensions(final RegisterDimensionsEvent event) {
        if(DimensionType.byName(medley.MEDLEY_DIM_TYPE) == null) {
            DimensionManager.registerDimension(medley.MEDLEY_DIM_TYPE, DimensionInit.MEDLEY_DIM.get(), null, true);
        }
    }
}
