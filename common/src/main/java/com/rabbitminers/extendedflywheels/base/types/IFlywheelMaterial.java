package com.rabbitminers.extendedflywheels.base.types;

import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IFlywheelMaterial {
    @Nullable
    default TagKey<Item>[] getRecipeTags() {
        return null;
    }

    @NotNull String asId();

    Ingredient getIngredient();
}
