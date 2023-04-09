// 8-8-2020
import java.awt.*;

public class BallGame extends Thread
{
	  int x,y,width;
	  Color color;
	  BallsPanel panel;
	
	public BallGame(int x,int y,int width,Color color, BallsPanel p)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.color=color;
		this.panel=p;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillOval(x-width/2,y-width/2,width,width);
	}
	
	public void run()
	{
		int dirx=1,diry=1;
		
		while (true)
		{
			synchronized (this)
			{
				if(panel.pauseFlag)
					try {
							wait();
						} catch (InterruptedException e) {}		
			}	
			
			int h=panel.getHeight();
			int w=panel.getWidth();
			
			if (x+width/2 >= w)
				dirx = -1;
			
		   if (x-width/2 <= 0)
				dirx = 1;	
		
			if (y+ width/2 >= h)
					diry = -1;
				
			if (y-width/2 <= 0)
					diry = 1;
			
			if(panel.moveFlag)	
			{
				x+=dirx;
				y+=diry;
			}
			
			for( int i=0; i<panel.vec.length; i++)
			{
				if(  panel.vec[i]!=this )
				{
					if( distance(x-panel.vec[i].x,y-panel.vec[i].y)<
							width/2+panel.vec[i].width/2)
					{
						dirx*=-1;
						diry*=-1;
					}
				}
			}
			
			int x1=panel.player.x;
			int y1=panel.player.y;
			int cx1= x1+panel.player.size/2;
			int cy2= y1+panel.player.size/2;
			
			if( distance(x-cx1,y-cy2)<
					width/2+panel.player.size/2 &&
					panel.player.size>width )
			{
				 panel.player.size+=4;
					break;
			}
			
			if( distance(x-cx1,y-cy2)<
					width/2+panel.player.size/2 &&
					panel.player.size<=width )
			{
				System.exit(1);
			}
			
			try {
					Thread.sleep(7);
				} catch (InterruptedException e) {}
			
		}	
	}
	
	public static double distance(int a,int b)
	{
		return Math.sqrt(Math.pow(a,2.0)+Math.pow(b,2.0));
	}
	
}
