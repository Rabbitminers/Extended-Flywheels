from PIL import Image
import glob
import re
import os

colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
materials = ["iron", "brass", "steel"]
filelist = []

def generate_loot_tables():
    os.makedirs('loot_tables', exist_ok=True)
    contents = """
{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1.0,
      "bonus_rolls": 0.0,
      "entries": [
        {
          "type": "minecraft:item",
          "name": "extendedflywheels:ITEMNAME"
        }
      ],
      "conditions": [
        {
          "condition": "minecraft:survives_explosion"
        }
      ]
    }
  ]
}
    """

    for material in materials:
        for color in colors:
            with open(f"loot_tables/{color}_{material}_flywheel.json", "w") as f:
                output = re.sub("ITEMNAME", f"{color}_{material}_flywheel", contents)
                f.write(output)



def generate_recipes():
    flywheels = ["flywheel", "ironflywheel", "steelflywheel"]
    os.makedirs('recipes', exist_ok=True)

    contents = """
{
  "type": "minecraft:crafting_shapeless",
  "ingredients": [
    {
      "item": "extendedflywheels:FLYWHEEL"
    },
    {
      "item": "minecraft:COLOR_dye"
    }
  ],
  "result": {
    "item": "extendedflywheels:OUTPUT"
  }
}
    """

    for material in materials:
        for color in colors:
            with open(f"recipes/{color}_{material}_flywheel.json", "w") as f:
                if material == "brass":
                    output = re.sub("FLYWHEEL", "flywheel", contents)
                else:
                    output = re.sub("FLYWHEEL", f"{material}flywheel", contents)
                output = re.sub("COLOR", color, output)
                output = re.sub("OUTPUT", f"{color}_{material}_flywheel", output)
                f.write(output)

def generate_blockstates():
    os.makedirs('blockstates', exist_ok=True)
    
    contents = """
    {
        "variants": {
            "axis=x": {
                "model": "extendedflywheels:block/DIR/block",
                "x": 90,
                "y": 90
            },
            "axis=y": {
                "model": "extendedflywheels:block/DIR/block"
            },
            "axis=z": {
                "model": "extendedflywheels:block/DIR/block",
                "x": 90,
                "y": 180
            }
        }
    }
    """

    for material in materials:
        for color in colors:
            with open(f"blockstates/{color}_{material}_flywheel.json", "w") as f:
                output = re.sub("DIR", f"{color}{material}flywheel", contents)
                f.write(output)

def generate_block_json():
    contents = """
{
    "parent": "extendedflywheels:block/DIR/flywheel",
    "loader": "forge:obj",
    "flip-v": true,
    "model": "extendedflywheels:models/block/common/flywheel_shaftless.obj"
}
    """

    for material in materials:
        for color in colors:
            with open(f"block/{color}{material}flywheel/block.json", "w") as f:
                output = re.sub("DIR", f"{color}{material}flywheel", contents)
                f.write(output)

def generate_flywheel_json():
    contents = """
{
    "parent": "block/block",
    "ambientocclusion": false,
    "textures": {
        "0": "extendedflywheels:block/IMG",
        "1": "extendedflywheels:block/axis",
        "2": "extendedflywheels:block/axis_top",
        "particle": "extendedflywheels:block/flywheel"
    }
}
    """

    for material in materials:
        for color in colors:
            with open(f"block/{color}{material}flywheel/flywheel.json", "w") as f:
                output = re.sub("IMG", f"{color}_{material}_flywheel", contents)
                f.write(output)


def generate_item_json():
    contents = """
{
    "parent": "extendedflywheels:block/DIR/flywheel",
    "loader": "forge:obj",
    "flip-v": true,
    "model": "extendedflywheels:models/block/common/flywheel.obj",
    "display": {
        "gui": {
            "rotation": [30, 225, 0],
            "translation": [0, 0, 0],
            "scale": [0.4, 0.4, 0.4]
        },
        "fixed": {
            "rotation": [90, 0, 0],
            "translation": [0, 0, 0],
            "scale": [0.4, 0.4, 0.4]
        }
    }
}
    """
    for material in materials:
        for color in colors:
            with open(f"block/{color}{material}flywheel/item.json", "w") as f:
                output = re.sub("DIR", f"{color}{material}flywheel", contents)
                f.write(output)

def generate_item_loader():
    os.makedirs("item", exist_ok=True)
    contents = """
{
    "parent": "extendedflywheels:block/DIR/item"
}
    """
    for material in materials:
        for color in colors:
            with open(f"item/{color}_{material}_flywheel.json", "w") as f:
                output = re.sub("DIR", f"{color}{material}flywheel", contents)
                f.write(output)


def generate_file_structure():
    for material in materials:
        for color in colors:
            os.makedirs(f'block/{color}{material}flywheel')

def generate_lang_file():
    langs = ["en_us", "en_uk"]

    for material in materials:
        for color in colors:
            block_id = f"{color}_{material}_flywheel"
            name = f"{color.title()} {material.title()} Flywheel"
            print(f'"block.extendedflywheels.{block_id}": "{name}",')


def generate_textures(pathlist):
    for path in pathlist:
        # print(f"generating: {type}, for {path}")
        base = Image.open(f"{type}.png").convert("RGBA")
        file_path = str(path)
        overlay = Image.open(file_path).convert("RGBA")
            
        colour = file_path.split('/', 99)[-1].split('_', 99)[0]

        base.paste(overlay, (0,0), mask=overlay)
        base.save(f"output/{colour}_{type}.png", "PNG")

def generate_tags():
    for material in materials:
        for color in colors:
            print(f'"extendedflywheels:{color}_{material}_flywheel",')

def main():
    if os.path.isdir('output'):
        os.rmdir("output")

    directories = ["blockstates", "lang", "models/block", "models/item", "textures"]
    for directory in directories:
        os.makedirs(f"output/{directory}", exist_ok=True)

    generate_blockstates()

if __name__ == "__main__":
    generate_loot_tables()

