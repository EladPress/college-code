import java.awt.*;
import javax.swing.*;
import javax.swing.event.MouseInputAdapter;


import java.awt.image.BufferStrategy;

import java.awt.event.*;



public class PanelTest extends JPanel
{
    //EButton button;
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        String s = "hello there";
        //g.drawString(s, 190, 200);
        //Label l = new Label("text");
        ERectangle r = new ERectangle(0, 0, 100, 110);
        
        //r.drawRect(g);
        g.setColor(Color.red);
        g.fillRect(0, 0, 100, 100);
        g.setColor(Color.black);
        g.fillRect(100, 100, 100, 100);
        EButton button = new EButton(g, "testtest", 100, 100, 150, 150, 100, 100);
        button.drawButton(Color.black);
        addMouseMotionListener(new MML(button));
       
    }  
    
    // class Frame1 extends JFrame{
    //     public Frame1(String title)
    //     {
    //         super(title);
    //         JButton b1 = new JButton("testButton");
    //         add(b1);
    //     }
    // }

    class MML extends MouseMotionAdapter
    {
        private EButton b;
        public MML(EButton b)
        {
            this.b = b;
        }
        @Override
        public void mouseMoved(MouseEvent e)
        {

            System.out.println(b.MouseOver(e.getX(), e.getY()));
            //b.setBackground(Color.gray);
        }
    
}

    
    public static void main(String [] args)
    {
        JFrame frame = new JFrame("frame");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(new PanelTest());
        frame.add(new PanelTest());
        
        frame.setSize(1000, 1000);
        
        // JButton b1 = new JButton("test");
        // b1.addActionListener(new AL());
        // frame.add(b1);

        //frame.addMouseMotionListener(new MML());

        
        JTextArea area = new JTextArea(1, 1);
        area.setText("hello");
        area.setBounds(50, 50,100, 50);
        area.setEditable(false);
        area.setBackground(Color.red);
        //frame.add(area);
        
        //EButton button = new EButton(g, "testtest", 100, 100, 150, 150, 200, 200);
        //button.drawButton(Color.red);
        
        frame.setVisible(true);
    }
    
}


class ML extends MouseAdapter
{
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("yes");
        
    }
}

class AL implements ActionListener{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("hey");
    }
}


