import socket
import time
import random

server = socket.socket()
server.bind(('127.0.0.1', 3804))
server.listen(1)
(client_socket, client_address) = server.accept()
request = client_socket.recv(2048).decode("UTF-8")
response = []
print(request)

if request == 'TIME':
    my_time = time.localtime()
    time_str = str(my_time.tm_hour) + ':' + str(my_time.tm_min) + ':' + str(my_time.tm_sec).zfill(2)
    response.append(time_str)
    #response = time


#print(request == 'NAME')
if request == 'NAME':
    response.append('question 2.6')
    #response = 'question 2.6'

if request == 'RAND':
    response.append(str(random.randint(0, 10)))

#else:
#    response = 'NULL'
print(response)
client_socket.send(str(response).encode())


server.close()