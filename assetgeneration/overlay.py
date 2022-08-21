from PIL import Image

material = "steel"

base = Image.open(f"{material}_flywheel.png").convert("RGBA")
overlay = Image.open("overlays/light_blue_overlay.png").convert("RGBA")


base.paste(overlay, (0,0), mask=overlay)
base.save(f"output/light_blue_{material}_flywheel.png", "PNG")