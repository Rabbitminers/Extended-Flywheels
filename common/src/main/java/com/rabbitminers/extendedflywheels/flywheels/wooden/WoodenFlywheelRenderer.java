package com.rabbitminers.extendedflywheels.flywheels.wooden;

import com.jozufozu.flywheel.core.StitchedSprite;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.content.kinetics.flywheel.FlywheelRenderer;
import com.simibubi.create.content.kinetics.waterwheel.WaterWheelRenderer;
import com.simibubi.create.foundation.model.BakedModelHelper;
import com.simibubi.create.foundation.utility.RegisteredObjects;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

public class WoodenFlywheelRenderer extends FlywheelRenderer {
    public static final StitchedSprite OAK_PLANKS_TEMPLATE = new StitchedSprite(new ResourceLocation("block/oak_planks"));
    public static final StitchedSprite OAK_LOG_TEMPLATE = new StitchedSprite(new ResourceLocation("block/oak_log"));
    public static final StitchedSprite OAK_LOG_TOP_TEMPLATE = new StitchedSprite(new ResourceLocation("block/oak_log_top"));

    private static final String[] LOG_SUFFIXES = new String[] { "_log", "_stem" };
    public WoodenFlywheelRenderer(Context context) {
        super(context);
    }

    public static BakedModel generateModel(WoodenFlwheelModelKey key) {
        BakedModel template = key.large() ? AllPartialModels.ARM_BASE.get() : AllPartialModels.COGWHEEL_SHAFT.get();
        return generateModel(template, key.material());
    }

    public static BakedModel generateModel(BakedModel template, BlockState planksBlockState) {
        Block planksBlock = planksBlockState.getBlock();
        ResourceLocation id = RegisteredObjects.getKeyOrThrow(planksBlock);
        String path = id.getPath();

        if (path.endsWith("_planks")) {
            String namespace = id.getNamespace();
            String wood = path.substring(0, path.length() - 7);
            BlockState logBlockState = getLogBlockState(namespace, wood);

            Map<TextureAtlasSprite, TextureAtlasSprite> map = new Reference2ReferenceOpenHashMap<>();
            map.put(OAK_PLANKS_TEMPLATE.get(), getSpriteOnSide(planksBlockState, Direction.UP));
            map.put(OAK_LOG_TEMPLATE.get(), getSpriteOnSide(logBlockState, Direction.SOUTH));
            map.put(OAK_LOG_TOP_TEMPLATE.get(), getSpriteOnSide(logBlockState, Direction.UP));

            return BakedModelHelper.generateModel(template, map::get);
        }

        return BakedModelHelper.generateModel(template, sprite -> null);
    }

    private static BlockState getLogBlockState(String namespace, String wood) {
        for (String suffix : LOG_SUFFIXES) {
            Optional<BlockState> state =
                    Registry.BLOCK.getHolder(ResourceKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(namespace, wood + suffix)))
                            .map(Holder::value)
                            .map(Block::defaultBlockState);
            if (state.isPresent())
                return state.get();
        }
        return Blocks.OAK_LOG.defaultBlockState();
    }

    private static TextureAtlasSprite getSpriteOnSide(BlockState state, Direction side) {
        BakedModel model = Minecraft.getInstance()
                .getBlockRenderer()
                .getBlockModel(state);
        if (model == null)
            return null;
        Random random = new Random(42L);
        List<BakedQuad> quads = model.getQuads(state, side, random);
        if (!quads.isEmpty()) {
            return quads.get(0)
                    .getSprite();
        }
        random.setSeed(42L);
        quads = model.getQuads(state, null, random);
        if (!quads.isEmpty()) {
            for (BakedQuad quad : quads) {
                if (quad.getDirection() == side) {
                    return quad.getSprite();
                }
            }
        }
        return model.getParticleIcon();
    }

    public record WoodenFlwheelModelKey(boolean large, BlockState state, BlockState material) {

    }
}
