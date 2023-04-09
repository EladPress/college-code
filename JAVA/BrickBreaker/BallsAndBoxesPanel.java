
import java.awt.*;
//import java.awt.*;
import javax.swing.*;

public class BallsAndBoxesPanel extends JPanel
{
	 Ball ball;
	 Box [][] mat;
	
	public BallsAndBoxesPanel()
	{
		ball=new Ball(300,400,10,Color.RED,this);
		mat = new Box[3][7];
		
		int i , j;
		
		for(  i=0 ; i<mat.length; i++)
		{
			for(  j=0 ; j<mat[i].length; j++)
			{
				Color c = new Color( (int)(Math.random()*256),
			             (int)(Math.random()*256),
			             (int)(Math.random()*256));
				
				
				mat[i][j] = new Box (j*80+20,i*50+20,50,20,c,this);
			}
		}
		//box=new Box(100,200,300,100,Color.BLUE,this);
		
		ball.start();
		for(  i=0 ; i<mat.length; i++)
			for(  j=0 ; j<mat[i].length; j++)
		        mat[i][j].start();

			
		setBackground(Color.WHITE);
	}
	
	public void paintComponent(Graphics g)
	{
	    super.paintComponent(g);
		ball.draw(g);
		
		for( int i=0 ; i<mat.length; i++)
			for( int j=0 ; j<mat[i].length; j++)
				if ( mat[i][j].isAlive())
					mat[i][j].draw(g);
	}

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Break Braker Pre MS(c)");
		BallsAndBoxesPanel bbp=new BallsAndBoxesPanel();
		f.add(bbp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,620);
		f.setResizable(false);
		f.setVisible(true);	
		
	}

}

