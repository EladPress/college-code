import java.io.*;
import java.net.*;

import javax.swing.ImageIcon;

public class Client2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Socket s = new Socket("localhost", 4999);
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("send pics");
        pr.flush();

        //InputStreamReader in = new InputStreamReader(s.getInputStream());
        //BufferedReader bf = new BufferedReader(in);
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        
        ImageIcon image = (ImageIcon) in.readObject();

        System.out.println("server: " + image.toString());
        
    }
}
