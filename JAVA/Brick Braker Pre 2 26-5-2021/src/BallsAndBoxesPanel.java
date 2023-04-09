
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.*;
import javax.swing.*;



public class BallsAndBoxesPanel extends JPanel
{
	 Ball ball;
	 Racket racket;
	 Box [][] mat;
	
	public BallsAndBoxesPanel()
	{
		ball=new Ball(300,400,10,Color.RED,this);
		racket = new Racket(this);
		mat = new Box[5][7];
		
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
		
		 racket.start();
			
			
		addMouseMotionListener(new MML());

			
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
		
		racket.drawRacket(g);
	}
	
	class MML extends MouseMotionAdapter 
	{
		public void mouseMoved(MouseEvent e)
		{
			if(!racket.isPaused )
			{
				if( e.getX()<getWidth()-racket.w)
					racket.x=e.getX();
//				if( e.getY()<getHeight()-player.size)
//					player.y=e.getY();
			}
		}	
	}
	

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Break Braker Pre MS(c)");
		BallsAndBoxesPanel bbp=new BallsAndBoxesPanel();
		f.add(bbp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,700);
		f.setResizable(false);
		f.setVisible(true);	
		
	}

}

