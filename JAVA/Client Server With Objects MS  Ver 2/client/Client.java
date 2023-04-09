
// File Client.java in C:\Java2020-2021\Examples 2020\Client Server With Objects MS Ver 1
// 30-10-2021
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;

public class Client 
{

    public static void main(String[] args) throws IOException
    {
        
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        // get the output stream from the socket.
        OutputStream outputStream = socket.getOutputStream();
        // create an object output stream from the output stream so we can send an object through it
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // make a list of MyPoints to send.
        List<MyPoint> points = new ArrayList<MyPoint>();
        points.add(new MyPoint(1,1));
        points.add(new MyPoint(2,2));
        points.add(new MyPoint(3,3));
        points.add(new MyPoint(4,4));
      
        System.out.println("Sending MyPoints to the ServerSocket");
        objectOutputStream.writeObject(points);

        


        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}

/*
 output:
ServerSocket awaiting connections...
Connection from Socket[addr=/127.0.0.1,port=53722,localport=7777]
Received [4] messages from: Socket[addr=/127.0.0.1,port=53722,localport=7777]
All MyPoints:
java.awt.Point[x=1,y=1] Sat Oct 30 04:05:39 IST 2021
java.awt.Point[x=2,y=2] Sat Oct 30 04:05:39 IST 2021
java.awt.Point[x=3,y=3] Sat Oct 30 04:05:39 IST 2021
java.awt.Point[x=4,y=4] Sat Oct 30 04:05:39 IST 2021
Closing sockets.
 */


