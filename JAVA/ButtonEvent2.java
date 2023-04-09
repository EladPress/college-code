import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 *                                           איסטרטגיה 3
	                          יצירת מחלקה פנימית אנונימית
	                          .
*/

public class ButtonEvent extends JFrame{
     private JPanel p;
     private  JButton b1, b2, b3;
     
	 ButtonEvent(){
		this.setTitle("Button Event");	
	    p=new JPanel();
	    b1=new JButton("Click me 1");
	    b1.setActionCommand("Button 1 Pressed");
	    b2=new JButton("Click me 2");
	    b2.setActionCommand("Button 2 Pressed");
	    b3=new JButton("Disable/Enable Button 1");
	    JButton [] vec = {b1,b2,b3};
	    for( int i=0; i<3;i++){
	    	vec[i].addActionListener(new ActionListener(){
	    		 public void actionPerformed(ActionEvent e){
	    		    	String s =  e.getActionCommand();
	    		        System.out.println(s);  
	    		        JButton b = (JButton)e.getSource();
	    		        Color c = new Color((int)(Math.random()*128+128),
	    	                    (int)(Math.random()*128+128),
	    	                    (int)(Math.random()*128+128));
	    	            b.setBackground(c);  
	    	            
	    		        if( s.compareTo("Disable/Enable Button 1")==0){
	    		        	if( b1.isEnabled())
	    		        		b1.setEnabled(false);
	    		        	else
	    		        		b1.setEnabled(true);			
	    		        }
	    		   }  
	    });
	    p.add(b1);
	    p.add(b2);
	    p.add(b3);
	    add(p);
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }
	 }
	
	public static void main(String[] args) {
       new ButtonEvent();
	}
}
