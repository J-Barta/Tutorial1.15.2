package com.Jedi4.Medley.Blocks;

import com.Jedi4.Medley.medley;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(medley.TAB));
    }
}
