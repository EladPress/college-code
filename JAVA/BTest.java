
 import java.awt.*;
 import javax.swing.*;

import java.awt.event.*;
 public class BTest extends JFrame {
	private int count;
	private JButton b1, b2;
	private JLabel l;
	public BTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l=new JLabel("0",JLabel.CENTER);
		l.setFont(new Font("Arial",Font.BOLD,30));
		l.setForeground(Color.red);
		add(l);
		//add(l,BorderLayout.CENTER);
		b1 = new JButton("Click ++");
		add(b1,BorderLayout.SOUTH);
		b1.addActionListener(new AL());
		b2 = new JButton("Click --");
		add(b2,BorderLayout.NORTH);
		b2.addActionListener(new AL());
		setSize(100,150);
		setVisible(true);
	}
	class AL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			if( s.equals("Click ++")){
				count++;
				l.setForeground(Color.red);
			}
			else{
				count--;
				l.setForeground(Color.blue);
			}
			
			JButton b= (JButton)e.getSource();
			Color c = new Color((int)(Math.random()*128)+128,
			                    (int)(Math.random()*128)+128,
			                    (int)(Math.random()*128)+128);
			b.setBackground(c);
			
			l.setText(String.valueOf(count));
			
		}
	}
 
	public static void main(String[] args) {
		new BTest();
	}
 }
