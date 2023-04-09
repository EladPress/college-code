import java.awt.*;
import javax.swing.*;
public class CenteredFrame extends JFrame {
	public CenteredFrame() {
		super("Centered Frame");
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int  screenHeight = d.height;
		int  screenWidth = d.width;
		setSize(screenWidth/2, screenHeight/2);
		setLocation(screenWidth/4, screenHeight/4);
		
	}
	public static void main(String[] args) {
		CenteredFrame fr = new CenteredFrame();
		fr.setVisible(true);
	}
}
