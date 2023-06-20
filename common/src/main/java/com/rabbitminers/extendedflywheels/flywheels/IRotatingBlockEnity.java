package com.rabbitminers.extendedflywheels.flywheels;

public interface IRotatingBlockEnity {
    void setForcedSpeed(float speed);

    void unsetForcedSpeed();

    default void setAngle(float angle) {}

    default float getAngle() {return 0f;}

    float getWheelRadius();
}
