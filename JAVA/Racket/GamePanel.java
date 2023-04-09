// update 20-10-2020
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;





public class GamePanel extends JPanel
{

	
	Racket player ;
	
	
	
	Image backGroundImage;

	public GamePanel()
	{
		ImageIcon img =new ImageIcon("space.jpg");
		backGroundImage= img.getImage();
	 
	   
		 player = new Racket(this);
		 player.start();
		
		
		addMouseMotionListener(new MML());
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(backGroundImage, 0,0,getWidth(),getHeight(), null);
		
		
			  		  
		
		
		player.drawRacket(g);
	}
		
		
	
	class MML extends MouseMotionAdapter 
	{
		public void mouseMoved(MouseEvent e)
		{
			if(!player.isPaused )
			{
				if( e.getX()<getWidth()-player.w)
					player.x=e.getX();
//				if( e.getY()<getHeight()-player.size)
//					player.y=e.getY();
			}
		}	
	}
	
	

	public void  hideMouseCursor(){
		 //Transparent 16 x 16 pixel cursor image.
		BufferedImage cursorimg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		// Create a new blank cursor.
		Cursor blankCursor = Toolkit.getDefaultToolkit().createCustomCursor(
		    cursorimg, new Point(0, 0), "blank cursor");

		// Set the blank cursor to the JPanel.
		setCursor(blankCursor);	
	}

	public static void main(String[] args) {
		JFrame f=new JFrame("Chichen Invader 1 2020 (c)");
		GamePanel bp=new GamePanel();
		f.add(bp);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1050,700);
		f.setResizable(false);
		f.setVisible(true);	
		bp.hideMouseCursor();		
	}
}
