import socket
import PIL.ImageGrab as image_grab
import pyperclip
import subprocess
import shutil
import os
import glob

server = socket.socket()
server.bind(('127.0.0.1', 3092))
server.listen(1)
(client_socket, client_address) = server.accept()
request = client_socket.recv(2048).decode("UTF-8")

response = []

if request == 'SCREENSHOT':
    image = image_grab.grab().convert('RGB')
    image.save('/Volumes/GoogleDrive/My Drive/Programming/Python/socket_assignment_12.9.21/server/image.jpg')
    response.append('image saved')

if 'COPY' in request:
    if 'COPY_FILE' in request:
        path = request[10:]
        shutil.copy(path, 'socket_assignment_12.9.21/server/1.txt')
        response.append('File copied')
    else:
        pyperclip.copy(request[5:])
        response.append('Copy successful')
        #print(pyperclip.paste())

if request == 'PASTE':
    response.append(pyperclip.paste())

if 'OPEN' in request:
    subprocess.run(['open', request[5:]])
    response.append('App opened')

if 'REMOVE' in request:
    path = request[7:]
    os.remove(path)
    response.append('File removed')

if 'SHOW' in request:
    path = request[5:]
    lst = glob.glob(path + '/*.*')
    response.append(lst)

client_socket.send(str(response).encode())



server.close()