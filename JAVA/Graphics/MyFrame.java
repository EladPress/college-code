
// 29-11-2020.
import java.awt.*;
import javax.swing.*;
	public class MyFrame extends JFrame{
		public MyFrame(){
			super("MS(c)");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocation(0,0);
			setSize(150,150);
		    setResizable(false);
			setVisible(true);
		}
		public static void main(String[] args) {
			MyFrame f =new MyFrame();
			
			f.setAlwaysOnTop(true);
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension d = tk.getScreenSize();
			int  h= d.height;
			int  w = d.width;
			int x=1, y=1;
			int dirx=1, diry=1;
			
			//
			do
			{
				Graphics  g = f.getGraphics();		             
				g.setColor(Color.WHITE);
				g.fillRect(0,0,150,150);
				g.setColor(Color.BLUE);
				
				g.drawOval(25,35,100,100);
				g.fillOval(55,65,10,10);
				g.fillOval(70,85,10,10);
				g.fillOval(90,65,10,10);
				
				g.fillOval(55,105,40,10);
				f.setLocation(x,y);
		
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();}
				
				
				if(x<=0)
					dirx=1;
				
				if(x>= w-150)
					dirx=-1;
				
				if(y<=0)
					diry=1;
				
				if(y>= h-150 )
					diry=-1;
				
				x+=dirx*1;
				y+=diry*1;
				
			}while(true)
				
		}
	}
