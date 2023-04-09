import socket

client = socket.socket()
client.connect(('127.0.0.1', 3092))
text = input('Write command here:')
client.send(text.encode())
data = client.recv(2048).decode("UTF-8")
print(data)
client.close()