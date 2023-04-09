
import java.awt.*;
import javax.swing.*;

public class BallPlayer extends Thread 
{
	BallsPanel panel;
	int x=0, y=0;
	int size=50;
	
	Image ballImage;
	
	
	public BallPlayer(BallsPanel panel)
	{
		this.panel=panel;
		ImageIcon img =new ImageIcon("ball.png");		
		ballImage=img.getImage();
		start();
	}
	
	public void run()
	{
		while(true)
		{
		   try {
			   	Thread.sleep(10);
		   	   }catch (InterruptedException e) {}
				
			//panel.repaint();
		}
	}
	
	int getBallImageWidth()
	{
		return ballImage.getWidth(null);
	}
	
	int getBallImageHeight()
	{
		return ballImage.getHeight(null);
	}
	
	public void drawBall(Graphics g)
	{
		g.drawImage(ballImage, x,y, size,size,null);
	}
		
}
