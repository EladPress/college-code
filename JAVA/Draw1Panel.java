import javax.swing.*;
import java.awt.*;
public class Draw1Panel extends JPanel 
{
	
	public void paintComponent ( Graphics g){
		super.paintComponent(g);
	
		g.setColor(Color.BLUE);
		g.fillRect(10,10,300,20);// Fixed location
		
		g.setColor(Color.RED);
		int w = getWidth();
		int h = getHeight();
		int x = w/2-w/4;
		int y = h/2-h/4;
		g.fillOval(x,y,w/2,h/2);// Relative location 	
	}
}
