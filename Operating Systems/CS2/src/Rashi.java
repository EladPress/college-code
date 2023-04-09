import java.util.ArrayList;
import java.util.Scanner;

public class Rashi implements Runnable 
{
  public static Scanner kelet=new Scanner(System.in);
  static MyList list = null;
  public static void main(String[] args) throws InterruptedException 
  {
    list = new MyList();
    ArrayList<Thread> threads = new ArrayList<Thread>(); 
    for (int i = 0; i < 5; i++)
    {
      Thread t = new Thread(new Rashi());
      t.start();
      threads.add(t);
    }
    for (Thread t : threads)
    {
      t.join();            
    }
    System.out.println("end !");
  }
  @Override
  public void run() 
  {
    System.out.println("\t running...");
    list.add("Hello 1!");
    list.add("Hello 2!");
    list.add("Hello 3!");
    list.add("test ");

  }
}