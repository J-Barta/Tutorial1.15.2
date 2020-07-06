package com.Jedi4.Medley.util;

import com.Jedi4.Medley.Blocks.*;
import com.Jedi4.Medley.Items.ItemBase;
import com.Jedi4.Medley.medley;
import com.Jedi4.Medley.world.feature.CedarTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.rmi.registry.Registry;

import static net.minecraft.block.Blocks.*;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, medley.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS =new DeferredRegister<>(ForgeRegistries.BLOCKS, medley.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY1 = ITEMS.register("ruby1", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    //Cedar
    public static final RegistryObject<Block> CEDAR_LOG = BLOCKS.register("cedar_log", () -> new LogBlock(MaterialColor.WOOD, Block.Properties.from(OAK_LOG)));
    public static final RegistryObject<Block> CEDAR_LEAVES = BLOCKS.register("cedar_leaves", () -> new LeavesBlock(Block.Properties.from(OAK_LEAVES)));
    public static final RegistryObject<Block> CEDAR_SAPLING = BLOCKS.register("cedar_sapling", () -> new ModSaplingBlock(() -> new CedarTree(), Block.Properties.from(OAK_SAPLING)));
    public static final RegistryObject<Block> CEDAR_PLANKS = BLOCKS.register("cedar_planks", () -> new Block(Block.Properties.from(OAK_PLANKS)));
    public static final RegistryObject<Block> CEDAR_STAIRS = BLOCKS.register("cedar_stairs", () -> new StairsBlock(() -> new RegistryHandler().CEDAR_PLANKS.get().getDefaultState(), Block.Properties.from(CEDAR_PLANKS.get())));
    public static final RegistryObject<Block> CEDAR_FENCE = BLOCKS.register("cedar_fence", () -> new FenceBlock(Block.Properties.from(CEDAR_PLANKS.get())));
    public static final RegistryObject<Block> CEDAR_BUTTON = BLOCKS.register("cedar_button", () -> new ModWoodButtonBlock(Block.Properties.from(CEDAR_PLANKS.get())));
    public static final RegistryObject<Block> CEDAR_PRESSURE_PLATE = BLOCKS.register("cedar_pressure_plate1", () -> new ModPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, Block.Properties.from(CEDAR_PLANKS.get())));
    public static final RegistryObject<Block> CEDAR_SLAB = BLOCKS.register("cedar_slab", () -> new SlabBlock(Block.Properties.from(CEDAR_PLANKS.get())));


    public static final Block.Properties CONCRETE = Block.Properties.from(WHITE_CONCRETE);
    //Concrete Slabs
    public static final RegistryObject<Block> WHITE_CONCRETE_SLAB = BLOCKS.register("white_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> ORANGE_CONCRETE_SLAB = BLOCKS.register("orange_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_SLAB = BLOCKS.register("magenta_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_SLAB = BLOCKS.register("light_blue_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> YELLOW_CONCRETE_SLAB = BLOCKS.register("yellow_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> LIME_CONCRETE_SLAB = BLOCKS.register("lime_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> PINK_CONCRETE_SLAB = BLOCKS.register("pink_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> GRAY_CONCRETE_SLAB = BLOCKS.register("gray_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_SLAB = BLOCKS.register("light_gray_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> CYAN_CONCRETE_SLAB = BLOCKS.register("cyan_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> PURPLE_CONCRETE_SLAB = BLOCKS.register("purple_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> BLUE_CONCRETE_SLAB = BLOCKS.register("blue_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> BROWN_CONCRETE_SLAB = BLOCKS.register("brown_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> GREEN_CONCRETE_SLAB = BLOCKS.register("green_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> RED_CONCRETE_SLAB = BLOCKS.register("red_concrete_slab", () -> new SlabBlock(CONCRETE));
    public static final RegistryObject<Block> BLACK_CONCRETE_SLAB = BLOCKS.register("black_concrete_slab", () -> new SlabBlock(CONCRETE));

    //Concrete Stairs
    public static final RegistryObject<Block> WHITE_CONCRETE_STAIRS = BLOCKS.register("white_concrete_stairs", () -> new StairsBlock(() -> WHITE_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> ORANGE_CONCRETE_STAIRS = BLOCKS.register("orange_concrete_stairs", () -> new StairsBlock(() -> ORANGE_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> MAGENTA_CONCRETE_STAIRS = BLOCKS.register("magenta_concrete_stairs", () -> new StairsBlock(() -> MAGENTA_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> LIGHT_BLUE_CONCRETE_STAIRS = BLOCKS.register("light_blue_concrete_stairs", () -> new StairsBlock(() -> LIGHT_BLUE_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> YELLOW_CONCRETE_STAIRS = BLOCKS.register("yellow_concrete_stairs", () -> new StairsBlock(() -> YELLOW_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> LIME_CONCRETE_STAIRS = BLOCKS.register("lime_concrete_stairs", () -> new StairsBlock(() -> LIME_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> PINK_CONCRETE_STAIRS = BLOCKS.register("pink_concrete_stairs", () -> new StairsBlock(() -> PINK_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> GRAY_CONCRETE_STAIRS = BLOCKS.register("gray_concrete_stairs", () -> new StairsBlock(() -> GRAY_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> LIGHT_GRAY_CONCRETE_STAIRS = BLOCKS.register("light_gray_concrete_stairs", () -> new StairsBlock(() -> LIGHT_GRAY_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> CYAN_CONCRETE_STAIRS = BLOCKS.register("cyan_concrete_stairs", () -> new StairsBlock(() -> CYAN_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> PURPLE_CONCRETE_STAIRS = BLOCKS.register("purple_concrete_stairs", () -> new StairsBlock(() -> PURPLE_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> BLUE_CONCRETE_STAIRS = BLOCKS.register("blue_concrete_stairs", () -> new StairsBlock(() -> BLUE_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> BROWN_CONCRETE_STAIRS = BLOCKS.register("brown_concrete_stairs", () -> new StairsBlock(() -> BROWN_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> GREEN_CONCRETE_STAIRS = BLOCKS.register("green_concrete_stairs", () -> new StairsBlock(() -> GREEN_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> RED_CONCRETE_STAIRS = BLOCKS.register("red_concrete_stairs", () -> new StairsBlock(() -> RED_CONCRETE.getDefaultState(), CONCRETE));
    public static final RegistryObject<Block> BLACK_CONCRETE_STAIRS = BLOCKS.register("black_concrete_stairs", () -> new StairsBlock(() -> BLACK_CONCRETE.getDefaultState(), CONCRETE));

    //Block Items

    //Rubies
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(RUBY_ORE.get()));


    //Cedar
    public static final RegistryObject<Item> CEDAR_LOGS_ITEM = ITEMS.register("cedar_log", () -> new BlockItemBase(CEDAR_LOG.get()));
    public static final RegistryObject<Item> CEDAR_PLANKS_ITEM = ITEMS.register("cedar_planks", () -> new BlockItemBase(CEDAR_PLANKS.get()));
    public static final RegistryObject<Item> CEDAR_LEAVES_ITEM = ITEMS.register("cedar_leaves", () -> new BlockItemBase(CEDAR_LEAVES.get()));
    public static final RegistryObject<Item> CEDAR_SAPLING_ITEM = ITEMS.register("cedar_sapling", () -> new BlockItemBase(CEDAR_SAPLING.get()));
    public static final RegistryObject<Item> CEDAR_STAIRS_ITEM = ITEMS.register("cedar_stairs", () -> new BlockItemBase(CEDAR_STAIRS.get()));
    public static final RegistryObject<Item> CEDAR_FENCE_ITEM = ITEMS.register("cedar_fence", () -> new BlockItemBase(CEDAR_FENCE.get()));
    public static final RegistryObject<Item> CEDAR_BUTTON_ITEM = ITEMS.register("cedar_button", () -> new BlockItemBase(CEDAR_BUTTON.get()));
    public static final RegistryObject<Item> CEDAR_PRESSURE_PLATE_ITEM = ITEMS.register("cedar_pressure_plate1", () -> new BlockItemBase(CEDAR_PRESSURE_PLATE.get()));
    public static final RegistryObject<Item> CEDAR_SLAB_ITEM = ITEMS.register("cedar_slab", () -> new BlockItemBase(CEDAR_SLAB.get()));
    
    
    //Concrete Slabs
    public static final RegistryObject<Item> WHITE_CONCRETE_SLAB_ITEM = ITEMS.register("white_concrete_slab", () -> new BlockItemBase(WHITE_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_SLAB_ITEM = ITEMS.register("orange_concrete_slab", () -> new BlockItemBase(ORANGE_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_SLAB_ITEM = ITEMS.register("magenta_concrete_slab", () -> new BlockItemBase(MAGENTA_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_SLAB_ITEM = ITEMS.register("light_blue_concrete_slab", () -> new BlockItemBase(LIGHT_BLUE_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_SLAB_ITEM = ITEMS.register("yellow_concrete_slab", () -> new BlockItemBase(YELLOW_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_SLAB_ITEM = ITEMS.register("lime_concrete_slab", () -> new BlockItemBase(LIME_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_SLAB_ITEM = ITEMS.register("pink_concrete_slab", () -> new BlockItemBase(PINK_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_SLAB_ITEM = ITEMS.register("gray_concrete_slab", () -> new BlockItemBase(GRAY_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_SLAB_ITEM = ITEMS.register("light_gray_concrete_slab", () -> new BlockItemBase(LIGHT_GRAY_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_SLAB_ITEM = ITEMS.register("cyan_concrete_slab", () -> new BlockItemBase(CYAN_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_SLAB_ITEM = ITEMS.register("purple_concrete_slab", () -> new BlockItemBase(PURPLE_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_SLAB_ITEM = ITEMS.register("blue_concrete_slab", () -> new BlockItemBase(BLUE_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_SLAB_ITEM = ITEMS.register("brown_concrete_slab", () -> new BlockItemBase(BROWN_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_SLAB_ITEM = ITEMS.register("green_concrete_slab", () -> new BlockItemBase(GREEN_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> RED_CONCRETE_SLAB_ITEM = ITEMS.register("red_concrete_slab", () -> new BlockItemBase(RED_CONCRETE_SLAB.get()));
    public static final RegistryObject<Item> BLACK_CONCRETE_SLAB_ITEM = ITEMS.register("black_concrete_slab", () -> new BlockItemBase(BLACK_CONCRETE_SLAB.get()));

    //Concrete Stairs
    public static final RegistryObject<Item> WHITE_CONCRETE_STAIRS_ITEM = ITEMS.register("white_concrete_stairs", () -> new BlockItemBase(WHITE_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> ORANGE_CONCRETE_STAIRS_ITEM = ITEMS.register("orange_concrete_stairs", () -> new BlockItemBase(ORANGE_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> MAGENTA_CONCRETE_STAIRS_ITEM = ITEMS.register("magenta_concrete_stairs", () -> new BlockItemBase(MAGENTA_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_BLUE_CONCRETE_STAIRS_ITEM = ITEMS.register("light_blue_concrete_stairs", () -> new BlockItemBase(LIGHT_BLUE_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> YELLOW_CONCRETE_STAIRS_ITEM = ITEMS.register("yellow_concrete_stairs", () -> new BlockItemBase(YELLOW_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> LIME_CONCRETE_STAIRS_ITEM = ITEMS.register("lime_concrete_stairs", () -> new BlockItemBase(LIME_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> PINK_CONCRETE_STAIRS_ITEM = ITEMS.register("pink_concrete_stairs", () -> new BlockItemBase(PINK_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> GRAY_CONCRETE_STAIRS_ITEM = ITEMS.register("gray_concrete_stairs", () -> new BlockItemBase(GRAY_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> LIGHT_GRAY_CONCRETE_STAIRS_ITEM = ITEMS.register("light_gray_concrete_stairs", () -> new BlockItemBase(LIGHT_GRAY_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> CYAN_CONCRETE_STAIRS_ITEM = ITEMS.register("cyan_concrete_stairs", () -> new BlockItemBase(CYAN_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> PURPLE_CONCRETE_STAIRS_ITEM = ITEMS.register("purple_concrete_stairs", () -> new BlockItemBase(PURPLE_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> BLUE_CONCRETE_STAIRS_ITEM = ITEMS.register("blue_concrete_stairs", () -> new BlockItemBase(BLUE_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> BROWN_CONCRETE_STAIRS_ITEM = ITEMS.register("brown_concrete_stairs", () -> new BlockItemBase(BROWN_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> GREEN_CONCRETE_STAIRS_ITEM = ITEMS.register("green_concrete_stairs", () -> new BlockItemBase(GREEN_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> RED_CONCRETE_STAIRS_ITEM = ITEMS.register("red_concrete_stairs", () -> new BlockItemBase(RED_CONCRETE_STAIRS.get()));
    public static final RegistryObject<Item> BLACK_CONCRETE_STAIRS_ITEM = ITEMS.register("black_concrete_stairs", () -> new BlockItemBase(BLACK_CONCRETE_STAIRS.get()));

}
