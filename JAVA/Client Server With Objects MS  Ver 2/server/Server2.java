import java.net.*;

import javax.swing.ImageIcon;

import java.io.*;

public class Server2 {
    public static void main(String[] args) throws IOException
    {
        while(true)
        {
            ServerSocket ss = new ServerSocket(4999);
        System.out.println("Listening...");
        Socket s = ss.accept();

        System.out.println("client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);
        System.out.println("client: " + bf.readLine());

        ImageIcon image = new ImageIcon("Spaceship.png");

        //PrintWriter pr = new PrintWriter(s.getOutputStream());
        //pr.println("yes");
        //pr.flush();
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        out.writeObject(image);
        out.flush();

        System.out.println("closing...");
        ss.close();
        s.close();
        }
    }
}
