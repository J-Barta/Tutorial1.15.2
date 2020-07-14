package com.Jedi4.Medley.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyOre extends Block {
    public RubyOre() {
        super(Block.Properties.create(Material.ROCK)
                .hardnessAndResistance(5.0F, 6.0F)
                .harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)
                .harvestLevel(3));
    }
}
