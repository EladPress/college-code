file = open('/Volumes/Elad Press/יד׳ חומר/סייבר/homework 10.5.21/alice.txt', 'r', encoding='utf-8')
file_text = file.read()
#print()
file.close()
for char in file_text:
    if char in "?.!/\’;:'‘-,()“" or char in '"\n':
        file_text = file_text.replace(char, ' ')

file_text = file_text.lower()
file_text = file_text.split(' ')

#print(file_text)
#print(file_text)
words = {}
for i in file_text:
    if i in words:
        words[i] += 1
    else:
        words[i] = 1
arr = sorted(words, key=words.get, reverse=True)

flag = input('What to do?\n 1 = print all words\n 2 = print top 20 words\n')

if flag == '2':
    for i in arr[:20]:
        print(i, ', ', words[i])
else:
    for item in words.items():
        print(item)