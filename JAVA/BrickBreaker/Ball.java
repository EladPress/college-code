//23-5-2021
import java.awt.*;

public class Ball extends Thread
{
    int x,y,width;
    Color color;
    BallsAndBoxesPanel panel;
    int dirx, diry;
	
	public Ball(int x,int y,int width,Color color, BallsAndBoxesPanel p)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.color = color;
		this.panel = p;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x - width / 2, y - width / 2, width, width);
	}
	
	public void run()
	{
	    dirx = 1;
	    diry = 1;
		while (true) 
		{
			int h = panel.getHeight();
			int w = panel.getWidth();
			
			
			if(h > 0) // until panel gets size from frame 23-5-2021
			{
				
			if (x + width /2 > w)
					dirx = -1;
				
			if (x - width / 2  < 0)
					dirx = 1;
				
			if (y + width /2 > h)
					diry = -1;
				
			if (y - width / 2 < 0)
					diry = 1;
				
			x += dirx;
			y += diry;
				
			try {
					Thread.sleep(5);
				} catch (InterruptedException e) {}
			}
			panel.repaint();	
		}	
	}
	
	
}
