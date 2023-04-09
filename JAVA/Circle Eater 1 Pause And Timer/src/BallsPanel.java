
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;



public class BallsPanel extends JPanel  implements ActionListener
{
	BallPlayer player ;
	BallGame [] vec;
	Image img;
	
	boolean moveFlag=false;
	boolean pauseFlag=false;
	
	Timer t;
	
	public BallsPanel()
	{
		img = (new ImageIcon("mad-space.gif")).getImage();
		
		player = new BallPlayer(this);
	    vec = new BallGame[10];
		for(int i=0 ; i<vec.length; i++)
		{
			 Color c = new Color((int)(Math.random()*256),
	                             (int)(Math.random()*256),
	                             (int)(Math.random()*256));
			 
			 
			 int x = (i+1)*90;
			 int y = (int)(Math.random()*600);
			 int w = (int)(Math.random()*50)+20;
			 vec[i]= new BallGame(x,y,w,c,this);
			 
		}
		
		try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}	
		
		t=new Timer(10,this);
		
		addMouseMotionListener(new MML());
		
		addKeyListener(new KL());
		setFocusable(true);
	}
	
	public void actionPerformed( ActionEvent e)
	{
	     repaint();
	}

	public void paintComponent(Graphics g)	
	{
		
		super.paintComponent(g);
		g.drawImage(img,0,0,getWidth(),getHeight(),null);
		
		for(int i=0 ; i<vec.length; i++)
			if (vec[i].isAlive())
				vec[i].draw(g);
		
		player.drawBall(g);	
		
		if(pauseFlag)
		{
			
			Font f=new Font("Segoe Script",Font.PLAIN,60);		
			g.setFont(f);
			g.setColor(Color.RED);
			int width = g.getFontMetrics().stringWidth("Paused");
			int heigth = g.getFontMetrics().getHeight();
			g.drawString("Paused",getWidth()/2-width/2,getHeight()/2-heigth/2+60);
		}
	}
	
	class KL extends KeyAdapter
    {
		public void keyPressed(KeyEvent e)
		{
			int code=e.getKeyCode();
			if(code==KeyEvent.VK_P)
			{
				pauseFlag=true;
				//t.stop();
			}
		
			if(code==KeyEvent.VK_R)
			{
				for(int i=0 ; i<vec.length; i++)
				{
					synchronized (vec[i]) 
					{	
						vec[i].notify();
					}
					//t.start();
				}
				
				pauseFlag=false;
			}	
			
		}
    }
	
	class MML extends MouseMotionAdapter
	{
		public void mouseMoved(MouseEvent e) 
		{
			player.x=e.getX();
			player.y=e.getY();
				
		}	
	}
	
	public void  hideMouseCursor()
	{
		 //Transparent 16 x 16 pixel cursor image.
		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		// Create a new blank cursor.
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
		    cursorImg, new Point(0, 0), "blank cursor");

		// Set the blank cursor to the JPanel.
		setCursor(blankCursor);	
	}
	
	public void printTypeOfFonts ()
	{
		 String fonts[] = 
			      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

			    for ( int i = 0; i < fonts.length; i++ )
			    {
			      System.out.println(fonts[i]);
			    }
	}

	public static void main(String[] args) 
	{
		JFrame f=new JFrame("Circle Eater by Mario (c) 2021");
		BallsPanel bp=new BallsPanel();
		f.add(bp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(900,600);
		f.setResizable(false);
		f.setVisible(true);	
		f.setFocusable(false);
		
		bp.hideMouseCursor();
		
		for( int i=0; i<bp.vec.length; i++)
			bp.vec[i].start();
		
		bp.t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		
		bp.moveFlag=true;	
		
		bp.printTypeOfFonts (); 	   	
	}
}
