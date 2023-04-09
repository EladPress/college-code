
import java.awt.*;

public class Ball extends Thread{
	private  int x,y,width;
	private Color color;
	private BallsPanel panel;
	
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
				
				
			Ball b1 = panel.getB1();
			Ball b2 = panel.getB2();
			Ball other;
			if (b1 == this)
				other = b2;
			else
				other = b1;
				
			if( distance(x-other.x,y-other.y)<width/2+other.width/2)
			{
				dirx*=-1;
				diry*=-1;
			}
			
			try {
				Thread.sleep(2);
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
