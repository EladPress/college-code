import javax.swing.*;
 public class TryJFrame extends JFrame{
	public TryJFrame(String title){
		super(title);	                 
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/* setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) המתודה  
	             ,מבטיחה את סגירת התכנית, עם סגירת החלון 		      
(ניתן לסגור את החלון ואין צורך במאזין לארוע חלון לשם כך) */      	
	}
	public static void main(String[] args) {
		new TryJFrame("TestTryJFrame");
		
		
		int i=0;
		while( true){
			i++;
			System.out.println("Close window to exit program. i="+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 }