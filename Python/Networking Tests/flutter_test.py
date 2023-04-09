from flask import Flask, jsonify, request
import json
import mysql.connector  

mydb = mysql.connector.connect(
  host="127.0.0.1",
  user="root",
  password="Test@3092",
  database="TestDB",
)

#declared an empty variable for reassignment
response = ''

#creating the instance of our flask application
app = Flask(__name__)

#route to entertain our post and get request from flutter app
@app.route('/name/<string:name>', methods = ['GET', 'POST'])
def nameRoute(name: str):

    #checking the request type we get from the app
    if(request.method == 'GET'):
        
        return jsonify({'name' : name})
    else:
        return " "

@app.route('/select_name/<string:name>', methods = ['GET'])
def select_name(name: str):
    mycursor = mydb.cursor()
    mycursor.execute("select * from TestDB where name = '" + name + "'")
    #mydb.commit()
    myresult = mycursor.fetchall()
    result = list(myresult)
    #result.
    return "<h1>" + str(result) + "</h1>"

@app.route('/select/', methods = ['GET'])
def select():
    mycursor = mydb.cursor()
    mycursor.execute("select * from TestDB ")
    #mydb.commit()
    myresult = mycursor.fetchall()
    result = list(myresult)
    #result.
    return "<h1>" + str(result) + "</h1>"

@app.route('/insert/<string:name>', methods = ['POST', 'GET'])
def insert(name: str):
    
    mycursor = mydb.cursor()
    #mycursor.execute("select * from TestDB")
    mycursor.execute("insert into TestDB values('{}')".format(name))
    mydb.commit()

    
    #myresult = mycursor.fetchall()
    #result = list(myresult)
    #result.
    #return "<h1>" + str(result) + "</h1>"
    return "Entered {} to DataBase".format(name)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port="8080")

