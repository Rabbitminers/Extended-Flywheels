from PIL import Image

material = "iron"

base = Image.open(f"{material}_flywheel.png").convert("RGBA")
overlay = Image.open("overlays/light_gray_overlay.png").convert("RGBA")


base.paste(overlay, (0,0), mask=overlay)
base.save(f"output/light_gray_{material}_flywheel.png", "PNG")