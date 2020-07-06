package com.Jedi4.Medley;

import com.Jedi4.Medley.util.BiomeInit;
import com.Jedi4.Medley.util.DimensionInit;
import com.Jedi4.Medley.util.RegistryHandler;
import com.Jedi4.Medley.world.gen.OreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("medley")
@Mod.EventBusSubscriber(modid = medley.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class medley
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "medley";

    public static final ResourceLocation MEDLEY_DIM_TYPE = new ResourceLocation(MOD_ID, "medley");

    public medley() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        BiomeInit.BIOMES.register(modEventBus);
        DimensionInit.MOD_DIMESNIONS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }


    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
        OreGen.GenerateOre();
    }

    public static final ItemGroup TAB  = new ItemGroup("medleyTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.RUBY1.get());
        }
    };

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.RegisterBiomes();
    }



}
