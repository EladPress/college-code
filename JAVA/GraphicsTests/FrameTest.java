import java.awt.*;
import javax.swing.*;


public class FrameTest extends JFrame{
    public FrameTest(String title)
    {
        super(title);
        setSize(500, 500);
        setVisible(true);
        Button north = new Button("north");
        
        
        //add(north, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(north, BorderLayout.NORTH);
        north.setForeground(Color.red);
        //north.setSize(50, 400);
    }
    public void paint(Graphics g)
    {
        g.drawString("hello world", 100, 100);
    }
    public static void main(String [] args)
    {
        JFrame frame = new JFrame("title");
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300, 400);
        
    }
}