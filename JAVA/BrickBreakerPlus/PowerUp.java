//import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

public class PowerUp extends Thread
{
    static int diameter = 20, x, y;
    BallsAndBoxesPanel panel;
    Image image;

    //String path;
    public PowerUp(String path, int x, int y, BallsAndBoxesPanel panel)
    {
        //this.path = path;
        this.x = x;
        this.y = y;
        this.panel = panel;
        ImageIcon ii;
		//this.panel=panel;
		ii =new ImageIcon(path);
		image=ii.getImage();
    }

    public PowerUp(PowerUp powerUp, BallsAndBoxesPanel panel)
    {
        this.x = powerUp.x;
        this.y = powerUp.y;
        this.panel = panel;
        //ImageIcon ii;
        this.image = powerUp.image;
        
    }

    public void run()
    {
        while(true)
        {
            this.y++;

            Rectangle thisRect = new Rectangle(this.x, this.y, 1, 1);
            Rectangle racket = new Rectangle(panel.racket.GetX(), panel.racket.GetY(), panel.racket.GetWidth(), 1);
            if(racket.contains(thisRect))
            {
                if(this instanceof Minus)
                {
                    panel.racket.offsetWidth(-50);
                }
                else
                    panel.racket.offsetWidth(100);
            }

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {}
            panel.repaint();
        }
    }

    public void drawPowerUp(Graphics g)
    {
        g.drawImage(this.image, this.x, this.y, 20, 20, null);
    }
}
