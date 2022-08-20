import re

colors = ["black", "gray", "light_gray", "white", "red", "orange", "yellow", "lime", "green", "cyan", "light_blue", "blue", "magenta", "purple", "pink"]
materials = ["steel", "brass"]



contents = """
{
	"parent": "block/flywheel/BLOCKFILEPATH",
	"ambientocclusion": false,
	"textures": {
		"0": "extendedflywheels:block/FILENAME",
		"1": "extendedflywheels:block/axis",
		"2": "extendedflywheels:block/axis_top",
		"particle": "extendedflywheels:block/flywheel"
	}
}"""

for material in materials:
	for color in colors:
		filename = f"{color}_{material}_flywheel"
		output = re.sub("BLOCKFILEPATH", f"{filename}_block", contents)
		output = re.sub("FILENAME", f"{filename}", output)

		with open(f"output/{filename}.json", "w") as f:
			f.write(output)