

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lotto extends JFrame{
	private JButton[] bts;
	private JButton b;
	private JPanel pnorth, pcenter;
	public Lotto(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnorth=new JPanel();
		bts=new JButton[6];
		for (int i=0;i<6;i++){
			bts[i]=new JButton(String.valueOf(i+1));
			pnorth.add(bts[i]);
		}
		add(pnorth,BorderLayout.NORTH);
		
	    pcenter=new JPanel();
		b=new JButton(" Pick Loto Numbers ");
		b.addActionListener(new AL());
	    pcenter.add(b);
		add(pcenter,BorderLayout.CENTER);
		setSize(400,150);
		setVisible(true);
		
	}
	
	class AL implements ActionListener{
		public void actionPerformed(ActionEvent e){
			int[] histogram = new int[49];
			int val;
		    boolean done;
			for(int i=0; i<bts.length; i++){
				// Select 6 different numbers:
				done=false;
				do{
					val=(int)(Math.random()*49);
					if(histogram[val]==0){
						histogram[val]=1;
						bts[i].setText(String.valueOf(val+1));
						done=true;
					}
				}while(!done);
			}
		}
	}
	
	public static void main(String[] args){
		new Lotto();
	}
	
}
	