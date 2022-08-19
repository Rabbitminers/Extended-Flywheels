from PIL import Image
import os

def generate_assetss(type, pathlist):
    for path in pathlist:
        # print(f"generating: {type}, for {path}")
        base = Image.open(f"{type}.png").convert("RGBA")
        file_path = str(path)
        overlay = Image.open(file_path).convert("RGBA")
        
        base.paste(overlay, (0,0), mask=overlay)
        base.save(f"output/{type}_{str(path)[9:]}", "PNG")


flywheel_types = ["steel_flywheel", "brass_flywheel"]
filelist = []

for root, dirs, files in os.walk("overlays"):
    for file in files:
        filelist.append(os.path.join(root, file))

for type in flywheel_types:
    generate_assetss(type=type, pathlist=filelist)
    