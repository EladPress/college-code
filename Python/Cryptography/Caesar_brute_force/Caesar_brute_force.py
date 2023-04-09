import string

pre = 'Vq dg qt pqv vq dg, Vjcv ku vjg swguvkqp'
hint = 'To b'

final_post = []

for j in range(1, 26):
    post = []
    for i in pre:
        if i in string.ascii_lowercase or i in string.ascii_uppercase:
            post.append(chr(ord(i)- j))
        else:
            post.append(i)
    #print(''.join(post))
    
    #print(''.join(post[:len(hint)]) == hint)
    if ''.join(post[:len(hint)]) == hint:
        #print('true')
        final_post = post
        break    


final = ''.join(final_post)
print(final)
