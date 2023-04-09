
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ColorButtonsPanel extends JPanel{
	private CirclePanel p;
	
	public ColorButtonsPanel(CirclePanel p){
		this.p=p;
		setLayout(new GridLayout(6,2));
	
		for (int i=0; i<12; i++){
				JButton b=new JButton();
				b.setBackground(new Color((int)(Math.random()*256),
						                  (int)(Math.random()*256),
						                  (int)(Math.random()*256)));
				b.addActionListener(new AL());
				add(b);			
			}
	}
	
	public class AL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Color color=((JButton)(e.getSource())).getBackground();
			p.setColor(color);
			p.repaint();
		}
	}
}
