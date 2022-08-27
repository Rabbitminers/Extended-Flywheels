import os
import re

wood_types = ["acacia", "birch", "crimson", "dark_oak", "jungle", "oak", "spruce", "warped"]

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

    for variation in variations:
        for wood_type in wood_types:
            with open(f"blockstates/{variation}_{wood_type}_flywheel.json", "w") as f:
                output = re.sub("DIR", f"{wood_type}{variation}flywheel", contents)
                f.write(output)

def generate_loot_tables():
    pass

def generate_item_files():
    pass

def generate_recipes():
    pass

def generate_item_json():
    pass

def generate_flywheel_json():
    pass

def generate_block_json():
    pass

def generate_file_structure():
    pass


if __name__ == "__main__":
    generate_file_structure()
    generate_blockstates()