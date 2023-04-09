// update 26-5-2021

import java.awt.*;
//import java.awt.event.*;

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
			if(BoxIntersectsBall(panel.ball))
			{
				panel.ball.diry *= -1;
			}
			panel.repaint();
		}	
	}
	
	public void drawRacket(Graphics g)
	{
		g.drawImage(racketImage, x,y, w,h,null);
	}

	public Rectangle getRect()
	{
		Rectangle rect = new Rectangle(this.x, this.y, this.w, this.h);
		return rect;
	}

	public  boolean  BoxIntersectsBall ( Ball b)
	{
		Rectangle coverBox;
		Rectangle centerBall;
		
		int x1=x-b.width/2;
		int y1=y-b.width/2;
		int w1=w+b.width;
		int h1=h+b.width;
		
		coverBox=new Rectangle(x1,y1,w1,h1);
		centerBall=new Rectangle(b.x,b.y,1,1);
		
		//if( centerBall.intersects(coverBox))
		
		if(coverBox.contains(b.x, b.y))
			return true;
		
	
		return false;
	}

	public int GetX()
	{
		return this.x;
	}

	public int GetY()
	{
		return this.y;
	}

	public int GetWidth()
	{
		return this.w;
	}
	public int GetHeight()
	{
		return this.h;
	}

	public void offsetWidth(int offset)
	{
		this.w += offset;
	}
}
