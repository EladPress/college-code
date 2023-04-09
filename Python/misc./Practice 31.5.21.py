import re;

#str = input('Write email:')
str = 'presselad2@gmail.com'
match = re.findall(r'+@gmail.com', str)
#match = re.search('+@[facebook|gmail|yahoo]\.com', str)
#print(match)