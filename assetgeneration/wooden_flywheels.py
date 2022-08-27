from PIL import Image
import os
import re

# Output convention {color}_{material}_flywheel

def generate_assets(flywheel_types, overlay):
    for overlay_type in overlays:
        for type in flywheel_types:
            # print(f"generating: {type}, for {path}")
            base = Image.open(f"FullyWooden/large_{type}_flywheel.png").convert("RGBA")
            base.paste(overlay, (0,0), mask=overlay)
            base.save(f"output/large_{type.split('_')[0]}_flywheel.png", "PNG")


flywheel_types = ["acacia", "birch", "crimson", "dark_oak", "jungle", "oak", "spruce", "warped"]
overlays = ["mostly_metal", "mostly_wood"]
filelist = []

for root, dirs, files in os.walk("Overlays"):
    for file in files:
        filelist.append(os.path.join(root, file))

generate_assets(flywheel_types=flywheel_types, overlay=Image.open("Overlays/overlay.png"))
    