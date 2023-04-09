// update 26-5-2021

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Racket extends Thread  
{
	BallsAndBoxesPanel panel;
	int x=250, y=600, w=120, h=50;
	 
	Image racketImage;
	
	boolean isPaused=false;

	public Racket(BallsAndBoxesPanel panel)
	{
		ImageIcon ii;
		this.panel=panel;
		ii =new ImageIcon("racket.png");
		racketImage=ii.getImage();
	}                                                                                                               
	public void run()
	{
		
		while(true)
		{
			
		   try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			panel.repaint();
		}	
	}
	
	public void drawRacket(Graphics g)
	{
		g.drawImage(racketImage, x,y, w,h,null);
	}
}
