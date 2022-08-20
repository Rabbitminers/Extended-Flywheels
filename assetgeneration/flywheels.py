colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
material = "steel"


with open("output.txt", "w") as f:
    for color in colors:
        output = f"""

            public static final BlockEntry<WheelBlock> {color.upper()}{material.upper()}WHEEL =
                    REGISTRATE.block("{color}_{material}_flywheel", p -> WheelBlock.{material}("{color}", p))
                            .initialProperties(SharedProperties::softMetal)
                            .properties(BlockBehaviour.Properties::noOcclusion)
                            .blockstate(BlockStateGen.axisBlockProvider(true))
                            .transform(BlockStressDefaults.setNoImpact())
                            .item()
                            .transform(customItemModel())
                            .register();

        """
        f.write(output)