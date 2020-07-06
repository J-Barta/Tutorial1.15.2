package com.Jedi4.Medley.Blocks;


import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModBlockTags {
    public static final Tag<Block> FENCES = makeWrapperTag("fences");

    public static Tag<Block> makeWrapperTag(String id) {
        return new BlockTags.Wrapper(new ResourceLocation(id));
    }
}
