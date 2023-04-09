import PIL.ImageGrab as capture
image = capture.grab().convert("RGB")
image.save('/Volumes/GoogleDrive/My Drive/Programming/Python/misc./image.jpg')
