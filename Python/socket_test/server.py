import socket
server_socket = socket.socket()
server_socket.bind(('127.0.0.1', 9820))
server_socket.listen(1)
(client_socket, client_address) = server_socket.accept()
client_name = client_socket.recv(2048).decode("UTF-8")
client_socket.send(('hello ' + client_name).encode())
client_socket.close()
