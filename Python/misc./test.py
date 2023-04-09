import re

str = 'guru99, education is fun'
match = re.findall(r'^\w+', str)
print(match)