
import javax.swing.*;
import java.awt.*;
public class CirclePanel extends JPanel{
	private Color color;
	
	public  CirclePanel(){
		color=Color.RED;
	}
	
	public void setColor(Color c){
		color=c;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(color);
		int radius = Math.min(getWidth(),getHeight())/4;
		int x=getWidth()/2-radius;
		int y=getHeight()/2-radius;
		g.fillOval(x,y,radius*2,radius*2);
	}
}
