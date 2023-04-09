name = 'Elad'
new_name =[]
for i in name:
    new_name += chr(ord(i) + 7)
print(''.join(new_name))