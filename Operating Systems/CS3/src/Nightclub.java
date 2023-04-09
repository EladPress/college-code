import java.util.concurrent.Semaphore;

public class Nightclub 
{
  private Semaphore sem;
  public Nightclub() 
  {
    sem = new Semaphore(2); // Two threads may access the Night (Before Corona 2020)!
  }
  public void enter() throws InterruptedException 
  {
    this.sem.acquire();
    System.out.println("Entered the nightclub");
  }
  public void leave() throws InterruptedException
  {
    this.sem.release();
    System.out.println("Left the nightclub");
  }
}