import java.util.concurrent.Semaphore;

public class UdisThread extends Thread
{
  public static final int MAX=5;
  public static final int SECS=3; 
  Semaphore sem; 
  String threadName;
  //AePlayWave voice; 

  public UdisThread(Semaphore sem, String threadName) 
  { 
    super(threadName); 
    this.sem = sem; 
    this.threadName = threadName; 
  }

  @Override
  public void run() { 

    // Run By t0
    if(this.getName().equals("t0")) 
    { 
      
      System.out.println("Starting " + threadName); 
      try
      { 
        // Will get the permit to access shared resource
        System.out.println(threadName + " waiting for a permit."); 
        
        // acquiring the lock 
        sem.acquire(); 
        Thread.sleep(SECS*1000); 

        System.out.println(threadName + " gets a permit.");
        //voice=new AePlayWave("enterCS.wav");
        //voice.start();

        // Now, accessing the shared resource and rest will wait  

        for(int i=0; i < MAX; i++) 
        { 
          Resource.count++; 
          System.out.println(threadName + ": " + Resource.count); 
          // Now thread t1 will try  to execute 
          Thread.sleep(SECS*1000); 
        } 
      } catch (InterruptedException exc) { 
        System.out.println(exc); 
      } 

      // Release the permit. 
      System.out.println("\t"+threadName + " releases the permit.");

      sem.release(); 
    } 

    // run by thread t1 
    else
    { 
      System.out.println("Starting " + threadName); 
      try
      { 
        // First, t1 will try to get permit
        System.out.println("\t"+threadName + " waiting for a permit."); 

        // acquiring the lock 
        sem.acquire(); 

        System.out.println("\t"+threadName + " gets a permit.");

        //voice=new AePlayWave("enterCS.wav");
        //voice.start();

        // Now, accessing the shared resource and others will wait

        for(int i=0; i < MAX; i++) 
        { 
          Resource.count--; 
          System.out.println(threadName + ": " + Resource.count); 

          // Now, allowing a context switch -- if possible. 
          // for thread t0 to execute 
          Thread.sleep(SECS*1000); 
        } 
      } catch (InterruptedException exc) { 
        System.out.println(exc); 
      } 
      // Release the permit.
      //voice=new AePlayWave("outofCS.wav");
      //voice.start();
      System.out.println(threadName + " releases the permit.");

      sem.release(); 
    } 
  } 
}