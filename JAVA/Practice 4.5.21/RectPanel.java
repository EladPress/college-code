import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RectPanel extends JPanel
{
    private static Rectangle rect;
    Random rand = new Random();
    private static Rectangle[] rects = new Rectangle[2];
    public RectPanel()
    {
        /*rect = new Rectangle(100, 100, 150, 100, Color.RED, this);
        rect.start();*/
        for(int i = 0; i < rects.length; i++)
        {
            rects[i] = new Rectangle(rand.nextInt(300), rand.nextInt(620), rand.nextInt(200), rand.nextInt(200), Color.RED, this);
            rects[i].start();
        }
        setBackground(Color.GREEN);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //rect.draw(g);
        for(int i = 0; i < rects.length; i++)
        {
            rects[i].draw(g);
        }
    }
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        RectPanel rectPanel = new RectPanel();
        frame.add(rectPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 620);
		frame.setVisible(true);
		frame.setResizable(false);
        /*while(true)
        {
            System.out.println(rect.GetX());
        }*/
        while(true)
        {
            for(int i = 0; i < rects.length; i++)
            {
                for(int j = 0; j < rects.length; j++)
                {
                    /*if(rects[i] != rects[j] && rects[i].GetX() == rects[j].GetX() && rects[i].GetY() == rects[j].GetY())
                    {
                        rects[i].setDir();
                        rects[j].setDir();
                    }*/
                    if(rects[i] != rects[j])
                    {
                        System.out.println("yes");
                        if(rects[i].distance(rects[j]) < rects[i].getWidth())
                        {
                            rects[i].setX();
                            rects[j].setX();
                        }
                        //if(rects[j])
                        
                    }
                    else
                    {
                        System.out.println("no");
                    }
                }
            }
        }
        /*while(true)
        {
            rects[1].setDir();

        }*/
    }


}
