import java.util.*;
import java.awt.*;

public class Ball extends Thread{
	private  int x,y,width;
	private Color color;
	private BallsPanel panel;
	Ball[] balls;
	Random rand = new Random();
	public Ball(int x,int y,int width,Color color, BallsPanel p){
		this.x=x;
		this.y=y;
		this.width=width;
		this.color=color;
		this.panel=p;
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		g.fillOval(x-width/2,y-width/2,width,width);
		//g.fillRect(x,y,width,width);
	}
	public void run(){
		
		int dirx=1,diry=1;
		while (true) {
			int h=panel.getHeight();
			int w=panel.getWidth();
				
			if (x + width/2  > w)
					dirx = -1;
				
			if (x-width/2  < 0)
					dirx = 1;
				
			if (y + width/2  > h)
					diry = -1;
				
			if (y -width/2 < 0)
					diry = 1;
				
			x+=dirx;
			y+=diry;
				
				
			balls = panel.getBalls();
			//Ball other, current;
			/*if (b1 == this)
				other = b2;
			else
				other = b1;*/
			/*for(int i = 0; i < balls.length; i++)
			{
				if(balls[i] == this)
				{
					current = balls[i];
					break;
				}
			}*/
			for(int i = 0; i < balls.length; i++)
			{
				if(distance(this.x - balls[i].x, this.y - balls[i].y) < this.width/2 + balls[i].width/2 && this != balls[i])
				{
					dirx *= -1;
					diry *= -1;
				}
				System.out.println(distance(this.x - balls[i].x, this.y - balls[i].y));
			}
			

				
			/*if( distance(x-other.x,y-other.y)<width/2+other.width/2)
			{
				dirx*=-1;
				diry*=-1;
			}*/
			
			try {
				Thread.sleep(rand.nextInt(30));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			panel.repaint();	
		}	
	}
	public  double distance(int a,int b){
		return Math.sqrt(Math.pow(a,2.0)+Math.pow(b,2.0));
	}
	
}
