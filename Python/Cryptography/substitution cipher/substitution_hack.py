from typing import final
from detectEnglish import ENGLISH_WORDS as dictionary_temp
from substitution_encryption import encrypt
from substitution_decryption import decrypt

#print(dictionary)
dictionary = list(dictionary_temp.keys())
final_dict = [i.lower() for i in dictionary]

pre = 'r ilkc tfja rcl, fk r crirxy brq brq rwry...'
solution = 'a long time ago, in a galaxy far far away...'

for i in final_dict:
    temp = decrypt(i, pre)
    if temp == solution:
        print(i)
        #print(True)
        #print(solution)
        

  
#print(final_dict)
#pre = 'a long time ago, in a galaxy far far away...'



'''en = encrypt('press', pre)
print(en)
de = decrypt('press', en)
print(de)'''

#temp = 'r gkje sbhi rek, bj r ergrwx nrp nrp rvrx...'