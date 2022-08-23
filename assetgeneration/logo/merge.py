import math
from PIL import Image

colors = ["base", "black", "gray", "light_gray", "red", "orange", "yellow", "lime", "green", "cyan", "blue", "magenta", "purple", "pink", "brown"]
borderSize = 80

def addStroke(image,strokeSize=1,color=(255,255,255)):
    #Create a disc kernel
    kernel=[]
    kernelSize=math.ceil(strokeSize)*2+1 #Should always be odd
    kernelRadius=strokeSize+0.5
    kernelCenter=kernelSize/2-1
    pixelRadius=1/math.sqrt(math.pi)
    for x in range(kernelSize):
        kernel.append([])
        for y in range(kernelSize):
            distanceToCenter=math.sqrt((kernelCenter-x+0.5)**2+(kernelCenter-y+0.5)**2)
            if(distanceToCenter<=kernelRadius-pixelRadius):
                value=1 #This pixel is fully inside the circle
            elif(distanceToCenter<=kernelRadius):
                value=min(1,(kernelRadius-distanceToCenter+pixelRadius)/(pixelRadius*2)) #Mostly inside
            elif(distanceToCenter<=kernelRadius+pixelRadius):
                value=min(1,(pixelRadius-(distanceToCenter-kernelRadius))/(pixelRadius*2)) #Mostly outside
            else:
                value=0 #This pixel is fully outside the circle
            kernel[x].append(value)
    kernelExtent=int(len(kernel)/2)
    imageWidth,imageHeight=image.size
    outline=image.copy()
    outline.paste((0,0,0,0),[0,0,imageWidth,imageHeight])
    imagePixels=image.load()
    outlinePixels=outline.load()
    #Morphological grayscale dilation
    for x in range(imageWidth):
        for y in range(imageHeight):
            highestValue=0
            for kx in range(-kernelExtent,kernelExtent+1):
                for ky in range(-kernelExtent,kernelExtent+1):
                    kernelValue=kernel[kx+kernelExtent][ky+kernelExtent]
                    if(x+kx>=0 and y+ky>=0 and x+kx<imageWidth and y+ky<imageHeight and kernelValue>0):
                        highestValue=max(highestValue,min(255,int(round(imagePixels[x+kx,y+ky][3]*kernelValue))))
            outlinePixels[x,y]=(color[0],color[1],color[2],highestValue)
    outline.paste(image,(0,0),image)
    return outline

for color in colors:
    background = Image.open("background.png").resize((1080, 1080)).convert("RGBA")
    overlay = addStroke(Image.open(f"renders/{color}.png").convert("RGBA"))
    alpha = overlay.getchannel('A')

    background.paste(overlay, (0,0), mask=overlay)
    background.save(f"output/{color}.png", "PNG")