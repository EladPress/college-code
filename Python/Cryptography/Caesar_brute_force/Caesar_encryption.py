import string
pre = 'To be or not to be, That is the question'

post = []
for i in pre:
    if i in string.ascii_lowercase or i in string.ascii_uppercase:
        post.append(chr(ord(i)+2))
    else:
        post.append(i)

new_post = ''.join(post)
print(new_post)