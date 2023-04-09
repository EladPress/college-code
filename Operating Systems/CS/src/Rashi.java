import java.util.concurrent.Semaphore;

public class Rashi 
{
  public static void main(String[] args) throws InterruptedException 
  {
     // creating a Semaphore object 
        // with number of permits 1
        Semaphore sem = new Semaphore(1); 
        // creating two threads with name t0 and t1 
        // Here thread t0 will increment and t1 will decrement the counter
        UdisThread md1 = new UdisThread(sem, "t0"); 
        UdisThread md2 = new UdisThread(sem, "t1"); 
         
        // stating threads t0 and t1 
        md1.start(); 
        md2.start(); 
         
        // waiting for threads t0 and t1 
        md1.join();
        md2.join();
     
        System.out.println("count: " + Resource.count); 
    } 	
}