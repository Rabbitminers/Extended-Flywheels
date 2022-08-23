import imageio

images = []

for i in range(15):
    images.append(imageio.imread(f"logo-animation/{i}.png"))
imageio.mimsave('logo.gif', images, format='GIF', fps=1)