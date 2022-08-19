package com.rabbitminers.extendedflywheels;

import com.mojang.logging.LogUtils;
import com.rabbitminers.extendedflywheels.index.EFBlocks;
import com.rabbitminers.extendedflywheels.index.EFItems;
import com.rabbitminers.extendedflywheels.index.EFTileEntities;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.repack.registrate.util.nullness.NonNullSupplier;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExtendedFlywheels.MOD_ID)
public class ExtendedFlywheels
{
    public static final String MOD_ID = "extendedflywheels";
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final NonNullSupplier<CreateRegistrate> registrate = CreateRegistrate.lazy(ExtendedFlywheels.MOD_ID);
    public static final String PROTOCOL = "1";
    public static SimpleChannel Network = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(MOD_ID, "main"))
            .clientAcceptedVersions(PROTOCOL::equals)
            .serverAcceptedVersions(PROTOCOL::equals)
            .networkProtocolVersion(() -> PROTOCOL)
            .simpleChannel();

    public static final CreativeModeTab itemGroup = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(EFBlocks.FLYWHEEL.get());
        }
    };

    public ExtendedFlywheels() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // MinecraftForge.EVENT_BUS.register(this);
        // MinecraftForge.EVENT_BUS.addListener(this::serverStart);

        EFItems.register(eventBus);
        EFBlocks.register();
        EFTileEntities.register();

    }

    // public static CreateRegistrate registrate() {}

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Setup phase");
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
    }

    public static CreateRegistrate registrate() {
        return registrate.get();
    }
}
