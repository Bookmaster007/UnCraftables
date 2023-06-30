package com.keith.uncraftable.util;

import com.keith.uncraftable.UNCraftable;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> UNSTRIPPED_LOG = tag("unstripped_logs");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(UNCraftable.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TREE_BARK = tag("tree_barks");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(UNCraftable.MODID, name));
        }

       private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
