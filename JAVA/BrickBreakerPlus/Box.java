//23-5-2021
// The Box don't moves as in break breaker game
import java.awt.*;
import java.util.*;

//import java.awt.*;

public class Box extends Thread
{
	int x,y,width,height;
	Color color;
	BallsAndBoxesPanel panel;
	
	

	public Box(int x,int y,int width,int height,Color color, BallsAndBoxesPanel p)
	{
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color=color;
		this.panel=p;
	}

	public void draw(Graphics g)
	{
		g.setColor(color);
		g.fillRect(x,y,width,height);
	}

	public void run()
	{
		
		while (true) 
		{
			
			
			if( BoxIntersectsBall(panel.ball))
			{
				BallsAndBoxesPanel.score++;
				panel.ball.diry*=-1;
				 
				// Next two if's to interact as in
				// break breaker game.
				int deltaX=1; //may ball is deltaX inside the box
				
				//ball comes from the left side of box
				if(panel.ball.x+panel.ball.width/2-deltaX<=x )
				{
					panel.ball.dirx*=-1;
					panel.ball.diry*=-1;
				}
				
				//ball comes from the right side of box
				if(panel.ball.x-panel.ball.width/2+deltaX>=x+width )
				{
					panel.ball.dirx*=-1;
					panel.ball.diry*=-1;
				}

				//Random rand = new Random();
				//int num = rand.nextInt(20);
				//if(num == 0)


				BallsAndBoxesPanel.deadBricks--;
				System.out.println(BallsAndBoxesPanel.deadBricks);
				break;	
			}
			try {
					Thread.sleep(3);
				} catch (InterruptedException e) {}
			
				
			panel.repaint();	
		}	
	}
	
	public  boolean  BoxIntersectsBall ( Ball b)
	{
		Rectangle coverBox;
		Rectangle centerBall;
		
		int x1=x-b.width/2;
		int y1=y-b.width/2;
		int w1=width+b.width;
		int h1=height+b.width;
		
		coverBox=new Rectangle(x1,y1,w1,h1);
		centerBall=new Rectangle(b.x,b.y,1,1);
		
		//if( centerBall.intersects(coverBox))
		
		if(coverBox.contains(b.x, b.y))
			return true;
		
	
		return false;
	}
}


