import java.awt.*;

public class EButton 
{
    private Graphics g;
    private String text;
    private int txtx;
    private int txty;
    private int x;
    private int y;
    private int width;
    private int height;

    public EButton(Graphics g, String text, int x, int y, int txtx, int txty, int width, int height)
    {
        this.g = g;
        this.text = text;
        this.txtx = txtx;
        this.txty = txty;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawButton(Color color)
    {
        g.setColor(color);
        g.drawRect(this.x, this.y, this.width, this.height);
        g.drawString(text, this.txtx, this.txty);
    }

    public boolean MouseOver(int mx, int my)
    {
        if(mx > this.x && mx < this.x + this.width && my > this.y && my < this.y + this.height)
        {
            return true;
        }
        return false;
    }

    //public Rectangle
}
