colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
material = "steel"

with open("output.txt", "w") as f:
    for color in colors:
        output = f"""
                    case "{color}":
                        return EFTileEntities.{color.upper()}{material.upper()}WHEEL.get();
       
        """
        f.write(output)