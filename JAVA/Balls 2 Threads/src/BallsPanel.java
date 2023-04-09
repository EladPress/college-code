
import java.awt.*;
import javax.swing.*;

public class BallsPanel extends JPanel{
	private Ball b1,b2;
	
	public BallsPanel(){
		b1=new Ball(12,20,30,Color.RED,this);
		b2=new Ball(123,212,60,Color.BLUE,this);
		
		b1.start();
		b2.start();	
		setBackground(Color.GREEN);
	}
	public Ball getB1(){
		return b1;
	}
	public Ball getB2(){
		return b2;
	}
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
		b2.draw(g);
		b1.draw(g);
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Ping Pong Balls by Mario (c)");
		BallsPanel bp=new BallsPanel();
		f.add(bp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,620);
		f.setResizable(false);
		f.setVisible(true);	
	}

}
