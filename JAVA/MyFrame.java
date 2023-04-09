
import javax.swing.*;
import java.awt.*;
public class MyFrame extends JFrame{
	public MyFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CirclePanel p1=new CirclePanel();
		ColorButtonsPanel p2=new ColorButtonsPanel(p1);
		add(p2,BorderLayout.WEST);
		add(p1,BorderLayout.CENTER);//same as: add(p1);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args){
		new MyFrame();
	}
}
