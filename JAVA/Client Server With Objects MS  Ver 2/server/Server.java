// File Client.java in C:\Java2020-2021\Examples 2020\Client Server With Objects MS Ver 1
// 30-10-2021
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class Server
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // don't need to specify a hostname, it will be the current machine
        ServerSocket ss = new ServerSocket(7777);
        System.out.println("ServerSocket awaiting connections...");
        
        // Will wait until a connection is attempted on this port.
        Socket socket = ss.accept(); 
        System.out.println("Connection from " + socket );

        // get the input stream from the connected socket
        InputStream inputStream = socket.getInputStream();
        
        // create a DataInputStream so we can read data from it.
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        // read the list of Points from the socket
        List<MyPoint> listOfPoints = (List<MyPoint>) objectInputStream.readObject();
        System.out.println("Received [" + listOfPoints.size() + "] messages from: " + socket);
        // print out the text of every message
        System.out.println("All MyPoints:");
       
        //MS
       for(int i=0; i<listOfPoints.size(); i++)
           System.out.println(listOfPoints.get(i));
    	   
       
        
        System.out.println("Closing sockets.");
        ss.close();
        socket.close();
    }
}
