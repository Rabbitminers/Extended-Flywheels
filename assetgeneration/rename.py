import os

colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
filelist = []

# Output convention {color}_{material}_flywheel

for root, dirs, files in os.walk("../src/main/resources/assets/extendedflywheels/textures/block/"):
    for file in files:
        filelist.append(os.path.join(root, file))

# os.rename("output.txt", "test.txt")

for file in filelist:
    filename = file.split('/', 99)[-1]

    if filename.startswith("brass"):
        for color in colors:
            if color in filename:
                if "light in filename":
                    if "light" in filename and "light": 
                        new_name = f"{color}_brass_flywheel.png"
                        os.rename(file, new_name)
                else:
                    new_name = f"{color}_brass_flywheel.png"
                    os.rename(file, new_name)

    if filename.startswith("steel"):
        for color in colors:
            if color in filename:
                if "light in filename":
                    if "light" in filename and "light": 
                        new_name = f"{color}_steel_flywheel.png"
                        os.rename(file, new_name)
                else:
                    new_name = f"{color}_steel_flywheel.png"
                    os.rename(file, new_name)