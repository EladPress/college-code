import string

#alphabet = string.ascii_uppercase
key = 'ZEBRAS'

alphabet = key

for i in string.ascii_uppercase:
    if i not in key:
        alphabet += i


print(alphabet == 'ZEBRASCDFGHIJKLMNOPQTUVWXY')