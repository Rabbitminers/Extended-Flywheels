package com.rabbitminers.extendedflywheels.network;

import net.minecraft.server.level.ServerPlayer;

public interface IObserveTileEntity {
    void onObserved(ServerPlayer var1, ObservePacket var2);
}