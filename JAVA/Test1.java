import javax.swing.*;
import java.awt.*;

public class Test1 extends JFrame {

	public Test1(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Draw1Panel p=new Draw1Panel();
		add(p,BorderLayout.CENTER);//same as: add(p);
		setSize(600,600);
		setVisible(true);
	}	
	public static void main(String[] args) {
	
		new Test1();
	}

}
