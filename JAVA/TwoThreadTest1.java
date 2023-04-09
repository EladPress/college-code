


public class TwoThreadTest1
{ 
  public static void main(String[] args)
  {
	    TwoThread1 tt = new TwoThread1();
	    
	    for ( int i = 0; i < 10; i++ )
	    {
	    	System.out.println("Main thread"); 
	    	/*
	    	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/	
			
	    }
  }
}
  ////////////////////////////////
class TwoThread1 implements Runnable
{  
    Thread thread;  
    
	TwoThread1()
	{   
	      thread=new Thread(this);   
		  thread.start();  
	} 
	
   public void run()
   {    
	    for ( int i = 0; i < 10; i++ )
	    {
	    	System.out.println("New thread"); 
	    	/*
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
	    }
   } 
}



