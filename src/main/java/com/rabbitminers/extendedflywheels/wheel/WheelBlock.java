package com.rabbitminers.extendedflywheels.wheel;

import com.rabbitminers.extendedflywheels.index.EFTileEntities;
import com.simibubi.create.AllShapes;
import com.simibubi.create.AllTileEntities;
import com.simibubi.create.content.contraptions.base.RotatedPillarKineticBlock;
import com.simibubi.create.foundation.block.ITE;
import com.simibubi.create.foundation.utility.Components;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;
import java.util.Properties;

public class WheelBlock extends RotatedPillarKineticBlock implements ITE<WheelTileEntity> {

    String type, colour;
    protected WheelBlock(String material, String paint, Properties properties) {
        super(properties);
        type = material;
        colour = paint;
    }
    public static WheelBlock brass(String colour, Properties properties) {
        return new WheelBlock("brass", colour, properties);
    }

    public static WheelBlock steel(String colour, Properties properties) {
        return new WheelBlock("steel", colour, properties);
    }

    public static WheelBlock iron(String colour, Properties properties) {
        return new WheelBlock("iron", colour, properties);
    }

    public static WheelBlock wood(String variation, Properties properties) {
        return new WheelBlock("wood", variation, properties);
    }

    public static WheelBlock large(String wood_type, Properties properties) {
        return new WheelBlock("large", wood_type, properties);
    }

    @Override
    public Class<WheelTileEntity> getTileEntityClass() {
        return WheelTileEntity.class;
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return AllShapes.LARGE_GEAR.get(pState.getValue(AXIS));
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public BlockEntityType<? extends WheelTileEntity> getTileEntityType() {

        switch (type) {
            case "wood":
                switch (colour) {
                    case "dark_oak":
                        return EFTileEntities.DARKOAKWHEEL.get();
                    case "plated_dark_oak":
                        return EFTileEntities.PLATEDDARKOAKWHEEL.get();
                    case "spruce":
                        return EFTileEntities.SPRUCEWHEEL.get();
                    case "plated_spruce":
                        return EFTileEntities.PLATEDSPRUCEWHEEL.get();
                    case "oak":
                        return EFTileEntities.OAKWHEEL.get();
                    case "plated_oak":
                        return EFTileEntities.PLATEDOAKWHEEL.get();
                    case "birch":
                        return EFTileEntities.BIRCHWHEEL.get();
                    case "plated_birch":
                        return EFTileEntities.PLATEDBIRCHWHEEL.get();
                    case "jungle":
                        return EFTileEntities.JUNGLEWHEEL.get();
                    case "plated_jungle":
                        return EFTileEntities.PLATEDJUNGLEWHEEL.get();
                    case "acacia":
                        return EFTileEntities.ACACIAWHEEL.get();
                    case "plated_acacia":
                        return EFTileEntities.PLATEDACACIAWHEEL.get();
                    case "warped":
                        return EFTileEntities.WARPEDWHEEL.get();
                    case "plated_warped":
                        return EFTileEntities.PLATEDWARPEDWHEEL.get();
                    case "crimson":
                        return EFTileEntities.CRIMSONWHEEL.get();
                    case "plated_crimson":
                        return EFTileEntities.PLATEDCRIMSONWHEEL.get();
                }

            case "large":
                switch (colour) {
                    case "acacia":
                        return EFTileEntities.LARGEACACIAFLYWHEEL.get();
                    case "dark_oak":
                        return EFTileEntities.LARGEDARKOAKFLYWHEEL.get();
                    case "spruce":
                        return EFTileEntities.LARGESPRUCEFLYWHEEL.get();
                    case "oak":
                        return EFTileEntities.LARGEOAKFLYWHEEL.get();
                    case "birch":
                        return EFTileEntities.LARGEBIRCHFLYWHEEL.get();
                    case "jungle":
                        return EFTileEntities.LARGEJUNGLEFLYWHEEL.get();
                    case "crimson":
                        return EFTileEntities.LARGECRIMSONFLYWHEEL.get();
                    case "warped":
                        return EFTileEntities.LARGEWARPEDFLYWHEEL.get();

                    default:
                        return EFTileEntities.LARGEOAKFLYWHEEL.get();
                }

            case "brass":
                switch(colour) {
                    case "black":
                        return EFTileEntities.BLACKBRASSWHEEL.get();
                    case "gray":
                        return EFTileEntities.GRAYBRASSWHEEL.get();
                    case "light_gray":
                        return EFTileEntities.LIGHT_GRAYBRASSWHEEL.get();
                    case "white":
                        return EFTileEntities.WHITEBRASSWHEEL.get();
                    case "red":
                        return EFTileEntities.REDBRASSWHEEL.get();
                    case "orange":
                        return EFTileEntities.ORANGEBRASSWHEEL.get();
                    case "yellow":
                        return EFTileEntities.YELLOWBRASSWHEEL.get();
                    case "lime":
                        return EFTileEntities.LIMEBRASSWHEEL.get();
                    case "green":
                        return EFTileEntities.GREENBRASSWHEEL.get();
                    case "cyan":
                        return EFTileEntities.CYANBRASSWHEEL.get();
                    case "light_blue":
                        return EFTileEntities.LIGHT_BLUEBRASSWHEEL.get();
                    case "blue":
                        return EFTileEntities.BLUEBRASSWHEEL.get();
                    case "magenta":
                        return EFTileEntities.MAGENTABRASSWHEEL.get();
                    case "purple":
                        return EFTileEntities.PURPLEBRASSWHEEL.get();
                    case "pink":
                        return EFTileEntities.PINKBRASSWHEEL.get();
                    default:
                        return EFTileEntities.FLYWHEEL.get();
                }
            case "steel":
                switch (colour) {
                    case "black":
                        return EFTileEntities.BLACKSTEELWHEEL.get();
                    case "gray":
                        return EFTileEntities.GRAYSTEELWHEEL.get();
                    case "light_gray":
                        return EFTileEntities.LIGHT_GRAYSTEELWHEEL.get();
                    case "white":
                        return EFTileEntities.WHITESTEELWHEEL.get();
                    case "red":
                        return EFTileEntities.REDSTEELWHEEL.get();
                    case "orange":
                        return EFTileEntities.ORANGESTEELWHEEL.get();
                    case "yellow":
                        return EFTileEntities.YELLOWSTEELWHEEL.get();
                    case "lime":
                        return EFTileEntities.LIMESTEELWHEEL.get();
                    case "green":
                        return EFTileEntities.GREENSTEELWHEEL.get();
                    case "cyan":
                        return EFTileEntities.CYANSTEELWHEEL.get();
                    case "light_blue":
                        return EFTileEntities.LIGHT_BLUESTEELWHEEL.get();
                    case "blue":
                        return EFTileEntities.BLUESTEELWHEEL.get();
                    case "magenta":
                        return EFTileEntities.MAGENTASTEELWHEEL.get();
                    case "purple":
                        return EFTileEntities.PURPLESTEELWHEEL.get();
                    case "pink":
                        return EFTileEntities.PINKSTEELWHEEL.get();
                    default:
                        return EFTileEntities.STEELWHEEL.get();
                }
            case "iron":
                switch (colour) {
                    case "black":
                        return EFTileEntities.BLACKIRONWHEEL.get();
                    case "gray":
                        return EFTileEntities.GRAYIRONWHEEL.get();
                    case "light_gray":
                        return EFTileEntities.LIGHT_GRAYIRONWHEEL.get();
                    case "white":
                        return EFTileEntities.WHITEIRONWHEEL.get();
                    case "red":
                        return EFTileEntities.REDIRONWHEEL.get();
                    case "orange":
                        return EFTileEntities.ORANGEIRONWHEEL.get();
                    case "yellow":
                        return EFTileEntities.YELLOWIRONWHEEL.get();
                    case "lime":
                        return EFTileEntities.LIMEIRONWHEEL.get();
                    case "green":
                        return EFTileEntities.GREENIRONWHEEL.get();
                    case "cyan":
                        return EFTileEntities.CYANIRONWHEEL.get();
                    case "light_blue":
                        return EFTileEntities.LIGHT_BLUEIRONWHEEL.get();
                    case "blue":
                        return EFTileEntities.BLUEIRONWHEEL.get();
                    case "magenta":
                        return EFTileEntities.MAGENTAIRONWHEEL.get();
                    case "purple":
                        return EFTileEntities.PURPLEIRONWHEEL.get();
                    case "pink":
                        return EFTileEntities.PINKIRONWHEEL.get();
                    default:
                        return EFTileEntities.IRONWHEEL.get();
                }
            default:
                return EFTileEntities.FLYWHEEL.get();
        }
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face.getAxis() == getRotationAxis(state);
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return state.getValue(AXIS);
    }

    @Override
    public float getParticleTargetRadius() {
        return 2f;
    }

    @Override
    public float getParticleInitialRadius() {
        return 1.75f;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable BlockGetter blockGetter, List<Component> components, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()) {
            components.add(new TextComponent("When part of a train:\n").withStyle(ChatFormatting.GRAY).withStyle(ChatFormatting.BOLD));
            components.add(new TextComponent("To have the flywheel rotate against train tracks (like bogeys), assemble the train facing South or West.\nAssemble the train facing North or East to have the flywheel rotate with the tracks").withStyle(ChatFormatting.DARK_GRAY));
        } else {
            components.add(new TextComponent("Press SHIFT for more info").withStyle(ChatFormatting.GRAY));
        }
        super.appendHoverText(itemStack, blockGetter, components, tooltipFlag);
    }
}

