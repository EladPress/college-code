import string
key = 2

pre = 'Vq dg qt pqv vq dg, Vjcv ku vjg swguvkqp'

post = []
for i in pre:
    if i in string.ascii_lowercase or i in string.ascii_uppercase:
        post.append(chr(ord(i)- key))
    else:
        post.append(i)

new_post = ''.join(post)
print(new_post)