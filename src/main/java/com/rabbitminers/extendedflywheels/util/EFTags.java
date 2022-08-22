package com.rabbitminers.extendedflywheels.util;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class EFTags {
    // .createOptional -> .create

    public static class Blocks {
        public static final TagKey<Block> BRASS_PAINTED_FLYWHEELS =
                forgeTag("flywheels/brass_painted_flywheels");
        public static final TagKey<Block> STEEL_PAINTED_FLYWHEELS =
                forgeTag("flywheels/steel_painted_flywheels");
        public static final TagKey<Block> IRON_PAINTED_FLYWHEELS =
                forgeTag("flywheels/iron_painted_flywheels");

        public static final TagKey<Block> BRASS_FLYWHEELS =
                tag("brass_painted_flywheels");
        public static final TagKey<Block> STEEL_FLYWHEELS =
                tag("steel_painted_flywheels");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ExtendedFlywheels.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(ExtendedFlywheels.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

}
