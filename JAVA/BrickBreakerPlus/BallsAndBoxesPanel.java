
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.time.Clock;
import java.util.Random;
import java.awt.*;
import javax.swing.*;



public class BallsAndBoxesPanel extends JPanel
{
	 Ball ball;
	 Racket racket;
	 public static Box [][] mat;
	 public static Stopwatch s;
	 public static int score = 0;
	 public static Clock clock;
	 public static JFrame f;
	 public static BallsAndBoxesPanel bbp;
	 public static boolean flag = false;

	 public static int offset[] = new int[2];

	 //PowerUp testImage;

	 
	 //public static int offset[] = [0, 0];
	 public static int scoreSum = 0;
	 public static int deadBricks = 0;


	 public static PowerUp powerUp;

	
	public BallsAndBoxesPanel()
	{
		ball=new Ball(300,400,10,Color.RED,this);
		racket = new Racket(this);
		mat = new Box[5][7];
		deadBricks = mat.length * mat[0].length;
		//s = new Stopwatch();
		s = new Stopwatch(offset);
		Random rand = new Random();
		if(rand.nextInt(2) == 1)
			powerUp = new Plus(100, 100, this);
		else
			powerUp = new Minus(100, 100, this);
		powerUp.start();

		

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
		JOptionPane.showMessageDialog(null, "Let's start!");
		ball.start();
		for(  i=0 ; i<mat.length; i++)
			for(  j=0 ; j<mat[i].length; j++)
		        mat[i][j].start();
		
		 racket.start();


			
			
		addMouseMotionListener(new MML());
		//if(powerUp instanceof Minus || powerUp instanceof Plus)
		//powerUp.start();
		s.start();	
		setBackground(Color.WHITE);
		//JOptionPane.showMessageDialog(null, mat.length * mat[0].length);

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
		
			
		powerUp.drawPowerUp(g);

		//RunPowerUp(g);

		//testImage.drawPowerUp(g);
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
		flag = true;
		
		f=new JFrame("Break Braker Pre MS(c)");
		bbp=new BallsAndBoxesPanel();
		f.add(bbp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,700);
		f.setResizable(false);
		f.setVisible(true);	
		//Stopwatch s = new Stopwatch();

		//JOptionPane.showMessageDialog(null, clock.instant());
		
		
	}

	public static void endDialog()
	{
		if(JOptionPane.showConfirmDialog(null, "score: " + score + ", would you like to play again?", "Game over, play time: " + s.getTime(), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
			f.dispose();
			s.stop();
			score = 0;
			deadBricks = mat.length * mat[0].length;
			main(null);
		}
		else
		{
			System.exit(0);
		}
				
	}
	public static void nextLevel()
	{
		JOptionPane.showMessageDialog(null,"Done");
		if(Ball.ballSpeed > 0)
		{
			Ball.ballSpeed--;
		}
		f.dispose();
		deadBricks = mat.length * mat[0].length;
		s.stop();
		powerUp.stop();
		
		offset[0] = s.getMins();
		offset[1] = s.getSecs();

		//JOptionPane.showMessageDialog(null, s.getTime());
		main(null);
		
	}

	public static void RunPowerUp(Graphics g)
	{
		Random rand = new Random();
		PowerUp powerUp;
		int num = rand.nextInt(2);
		if(num == 1)
			powerUp = new Minus(100, 100, bbp);
		else
			powerUp = new Plus(100, 100, bbp);
		if(flag == true)
		{
			powerUp.start();
			powerUp.drawPowerUp(g);
			flag = false;
		}
		//return powerUp;

	}

}

