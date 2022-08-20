colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
material = "steel"


with open("output.txt", "w") as f:
    for color in colors:
        output = f"""

            public static final BlockEntityEntry<WheelTileEntity> {color.upper()}{material.upper()}WHEEL = REGISTRATE
                    .tileEntity("{color}_{material}_flywheel", WheelTileEntity::new)
                    .instance(() -> WheelInstance::new, false)
                    .validBlocks(EFBlocks.{color.upper()}{material.upper()}WHEEL)
                    .renderer(() -> WheelRenderer::new)
                    .register();

        """
        f.write(output)
