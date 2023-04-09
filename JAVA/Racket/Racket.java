// update 20-10-2020

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Racket extends Thread  
{
	GamePanel panel;
	int x=500, y=600, w=120, h=50;
	 
	Image aircraftImage;
	
	boolean isPaused=false;

	public Racket(GamePanel panel)
	{
		ImageIcon ii;
		this.panel=panel;
		ii =new ImageIcon("racket.png");
		aircraftImage=ii.getImage();
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
		g.drawImage(aircraftImage, x,y, w,h,null);
	}
}
