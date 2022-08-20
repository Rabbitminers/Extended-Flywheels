import os
import re

colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
materials = ["steel", "brass"]


contents = """
{
  "variants": {
    "axis=x": {
      "model": "extendedflywheels:block/flywheel/FILE_PATH",
      "x": 90,
      "y": 90
    },
    "axis=y": {
      "model": "extendedflywheels:block/flywheel/FILE_PATH"
    },
    "axis=z": {
      "model": "extendedflywheels:block/flywheel/FILE_PATH",
      "x": 90,
      "y": 180
    }
  }
}
"""


# points to block.json -> flywheel.json -> wrong_texture

for material in materials:
    for color in colors:
        filename = f"{color}_{material}_flywheel"
        output = re.sub("FILE_PATH", filename, contents)

        with open(f"output/{filename}.json", "w") as f:
            f.write(output)