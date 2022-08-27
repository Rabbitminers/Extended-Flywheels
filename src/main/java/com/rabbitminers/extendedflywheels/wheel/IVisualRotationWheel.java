package com.rabbitminers.extendedflywheels.wheel;

public interface IVisualRotationWheel {
    void setForcedSpeed(float speed);
    void unsetForcedSpeed();
    default void setAngle(float angle) {}
    default float getAngle() {
        return 0f;
    }
    float getWheelRadius();
}