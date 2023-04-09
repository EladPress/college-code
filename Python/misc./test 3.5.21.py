'''arr = ['tesla', 'Ford', 'Seat', 'Skoda']
print(arr)
for i in range(len(arr)):
    print(arr[i])

i = 0
while i <= 40:
    print(i)
    i=i+1

for i in range (41):
    print(i)

i = 0
while i < 5:
    print("{:.1f}".format(i))
    i += 0.1

st = input("Type: ").split(' ')
print(st)
for i in range(len(st)):
    print(max(st[i]))'''

def func1(str):
    str1 = ""
    for i in range(len(str) + 2):
        str1 += "$"
    str = '$' + str + '$'
    print(str1)
    print(str)
    print(str1)

func1("Daddy stop")
        