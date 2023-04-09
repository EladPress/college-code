import java.io.ObjectInputStream.GetField;



public class TwoThreadTest
{ 
     public static void main(String[] args)
     {    
	     TwoThread tt = new TwoThread();    
		 tt.start();    
		 for ( int i=0; i<10; i++ )
		 {
		       System.out.println("Main thread"); 
		       
		       try {
					Thread.sleep(123);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				
		 }
		 System.out.println("End of main");
		       
	}
}
/////////////////////////////
 class TwoThread extends Thread{  
     public void run()
     {  
	     for ( int i = 0; i < 10; i++ )
	     {
	    	 System.out.println("New thread"); 
	    	
	    	 
	    	 try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		 }   
	}
}
