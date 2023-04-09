import java.awt.Graphics;



public class ERectangle extends java.awt.Rectangle
{
    //private int x;
    //private int y;
    //private int width;
    //private int height;
    public ERectangle(int x, int y, int width, int height)
    {
        super(x, y, width, height);
    }    

    public void drawRect(Graphics g)
    {
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}
