package com.rabbitminers.extendedflywheels.base;

import com.simibubi.create.foundation.blockEntity.behaviour.scrollValue.INamedIconOptions;
import com.simibubi.create.foundation.gui.AllIcons;
import com.simibubi.create.foundation.utility.Lang;

public enum FlywheelRotationType implements INamedIconOptions {
    DRIVE(AllIcons.I_REFRESH), TRAIL(AllIcons.I_ROTATE_CCW), STATIONARY(AllIcons.I_BLACKLIST),

    ;

    private String translationKey;
    private AllIcons icon;

    private FlywheelRotationType(AllIcons icon) {
        this.icon = icon;
        translationKey = "generic." + Lang.asId(name());
    }

    @Override
    public AllIcons getIcon() {
        return icon;
    }

    @Override
    public String getTranslationKey() {
        return translationKey;
    }

}
