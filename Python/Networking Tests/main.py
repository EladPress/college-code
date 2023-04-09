from flask import Flask
import mysql.connector

app = Flask(__name__)

mydb = mysql.connector.connect(
  host="127.0.0.1",
  user="root",
  password="Test@3092",
  database="TestDB",
)

@app.route('/')
def hello():
    mycursor = mydb.cursor()
    mycursor.execute("select * from TestDB where name = 'Shlomit'")
    #mydb.commit()
    myresult = mycursor.fetchall()
    result = list(myresult)
    #result.
    return "<h1>" + str(result) + "</h1>"

if __name__ == "__main__":
    app.run(port=8080, host="0.0.0.0")