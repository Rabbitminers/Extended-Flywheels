package com.rabbitminers.extendedflywheels.base;

import com.rabbitminers.extendedflywheels.base.types.IFlywheelMaterial;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Locale;

public enum FlywheelMaterial implements IFlywheelMaterial {
    DARK_OAK(Items.DARK_OAK_PLANKS),
    SPRUCE(Items.SPRUCE_PLANKS),
    OAK(Items.OAK_PLANKS),
    BIRCH(Items.BIRCH_PLANKS)
    ;
    private final Ingredient ingredient;

    FlywheelMaterial(TagKey<Item> tagKey) {
        this.ingredient = Ingredient.of(tagKey);
    }

    FlywheelMaterial(Item item) {
        this.ingredient = Ingredient.of(item);
    }

    @Override
    public @NotNull String asId() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override
    public Ingredient getIngredient() {
        return this.ingredient;
    }
}
