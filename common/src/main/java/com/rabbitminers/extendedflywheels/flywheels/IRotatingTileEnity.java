package com.rabbitminers.extendedflywheels.flywheels;

import com.rabbitminers.extendedflywheels.base.FlywheelRotationType;

public interface IRotatingTileEnity {
    void setForcedSpeed(float speed);

    void unsetForcedSpeed();

    default void setAngle(float angle) {}

    default float getAngle() {return 0f;}

    float getWheelRadius();
}
