import java.awt.*;
public class Rectangle extends Thread
{
    private int x, y, width, height;
    private Color color;
    RectPanel panel;
    private int dirx, diry;
    public Rectangle(int x, int y, int width, int height, Color color, RectPanel panel)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.panel = panel;
    }
    public void run()
    {
        dirx = 1; diry = 1;
        while(true)
        {
            
            //System.out.println(dirx);
            this.x += dirx;
            this.y += diry;
            dirx *= XCheck();
            diry *= YCheck();
            //this.y += 1;
            try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            this.panel.repaint();
        }
        
        
    }

    public int GetX()
    {
        return this.x;
    }

    public int GetY()
    {
        return this.y;
    }

    public int getWidth()
    {
        return this.width;
    }

    public void setX()
    {
        this.dirx *= -1;
    }
    public void SetY()
    {
        this.diry *= -1;
    }

    public int XCheck()
    {
        int width = this.panel.getWidth();
        //int height = this.panel.getHeight();

        if(this.x + this.width > width || this.x < 0)
        {
            return -1;
        }
        return 1;
    }
    public int YCheck()
    {
        int height = this.panel.getHeight();

        if(this.y + this.height > height || this.y < 0)
        {
            return -1;
        }
        return 1;
    }

    
    
    public void draw(Graphics g)
    {
        g.setColor(this.color);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    public  double distance(int a,int b){
		return Math.sqrt(Math.pow(a,2.0)+Math.pow(b,2.0));
	}

    public double distance(Rectangle rect)
    {
        int x = this.GetX() - rect.GetX();
        int y = this.GetY() - rect.GetY();
        return Math.sqrt(Math.pow(x, 2.0)+ Math.pow(y, 2.0));
    }
}
