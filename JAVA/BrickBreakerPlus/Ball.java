//23-5-2021
import java.awt.*;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class Ball extends Thread
{
    int x,y,width;
    Color color;
    BallsAndBoxesPanel panel;
    int dirx, diry;
	public static int ballSpeed = 5;
	
	public Ball(int x,int y,int width,Color color, BallsAndBoxesPanel p)
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
	    dirx=1;
	    diry=1;
		
		while (true) 
		{
			int h=panel.getHeight();
			int w=panel.getWidth();
			
			if(BallsAndBoxesPanel.deadBricks == 0)
			{
				BallsAndBoxesPanel.nextLevel();
				break;
			}

				if(h>0) // until panel gets size from frame 23-5-2021
				{
				
					if (x + width/2  > w)
						dirx = -1;
				
					if (x-width/2  < 0)
						dirx = 1;
				
					if (y + width/2  > h)
					{
				
				//.showMessageDialog(null, "game over, score = " + BallsAndBoxesPanel.score);
						BallsAndBoxesPanel.s.stop();
						BallsAndBoxesPanel.endDialog();
				
						break;
					}
				
					if (y -width/2 < 0)
						diry = 1;
				
					x+=dirx;
					y+=diry;
				
					try {
							Thread.sleep(ballSpeed);
						} catch (InterruptedException e) {}
			}

			//System.out.println(y);
			panel.repaint();	
			
		}	
	}
	
	
}
