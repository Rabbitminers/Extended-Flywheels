from PIL import Image
import os

# Output convention {color}_{material}_flywheel

def generate_assetss(type, pathlist):
    for path in pathlist:
        # print(f"generating: {type}, for {path}")
        base = Image.open(f"{type}.png").convert("RGBA")
        file_path = str(path)
        overlay = Image.open(file_path).convert("RGBA")
        
        
        colour = file_path.split('/', 99)[-1].split('_', 99)[0]

        base.paste(overlay, (0,0), mask=overlay)
        base.save(f"output/{colour}_{type}.png", "PNG")


flywheel_types = ["iron_flywheel"]
filelist = []

for root, dirs, files in os.walk("overlays"):
    for file in files:
        filelist.append(os.path.join(root, file))

for type in flywheel_types:
    generate_assetss(type=type, pathlist=filelist)
    