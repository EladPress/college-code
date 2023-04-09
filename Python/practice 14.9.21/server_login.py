import socket
HEADERSIZE = 10

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('127.0.0.1', 1235))
server.listen(1)
print('Listening to client to connect to server')

client_socket, client_address = server.accept()
msg = 'Hello from server'
msg = f'{len(msg) :< {HEADERSIZE}}' + msg

#client_socket.send(bytes(msg, 'utf-8'))
client_socket.send(bytes(str(len(msg)), 'utf-8'))

data = client_socket.recv(1024).decode('utf-8')
print(data)
client_socket.close()
server.close()