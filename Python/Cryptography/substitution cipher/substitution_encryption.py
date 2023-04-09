import string

key = 'ZEBRAS'
pre = 'flee at once. we are discovered!'

#alphabet = key
def encrypt(key, pre):
    alphabet = key
    for i in string.ascii_lowercase:
        if len(alphabet) < 26:
            if i not in key:
                alphabet += i
        else:
            break
            
    #print(len(alphabet))
    
    post = []

    for i in pre: 
        counter = 0
        if i not in string.ascii_lowercase:
            post += i
            continue
        for j in string.ascii_lowercase:
            if i != j:
                counter += 1
            else:
                post += alphabet[counter]
                break
    final = ''.join(post)
    return final

print(encrypt('romee', 'a long time ago, in a galaxy far far away...'))