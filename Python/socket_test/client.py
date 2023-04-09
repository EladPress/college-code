import socket
client_socket = socket.socket()
client_socket.connect(('127.0.0.1', 9820))
client_socket.send('elad'.encode())
data = client_socket.recv(1024).decode("UTF-8")
print(data)
client_socket.close()