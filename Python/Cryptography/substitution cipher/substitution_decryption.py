import string

def decrypt(key, pre):
    alphabet = key
    for i in string.ascii_lowercase:
        if len(alphabet) < 26:
            if i not in key:
                alphabet += i
        else:
            break
    #print(len(alphabet))
    #print(alphabet)
    post = []

    for i in pre: 
        counter = 0
        if i not in string.ascii_lowercase:
           post += i
           continue
        for j in alphabet:
            if i != j:
                counter += 1
            else:
                post += string.ascii_lowercase[counter]
                break
    final = ''.join(post)
    return final


key = 'ZEBRAS'
alphabet = key
pre = 'SIAA ZQ LKBA. VA ZOA RFPBLUAOAR!'
print(decrypt('romete', 'r ilkc tfja rcl, fk r crirxy brq brq rwry...'))



