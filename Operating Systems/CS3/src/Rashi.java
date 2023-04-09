import java.util.Scanner;

public class Rashi implements Runnable
{
	public static Scanner kelet=new Scanner(System.in);

	static Nightclub nightclub;

	public static void main(String[] args) throws InterruptedException 
	{
		nightclub = new Nightclub();
		for (int i = 0; i < 5; i++)
		{
			Thread t = new Thread(new Rashi());
			t.start();
		}
	}

	@Override
	public void run() 
	{
		while(true)
		{
			try {
				nightclub.enter();

				System.out.println("\t\tIndise nightclub..."+Thread.currentThread().getName());
				Thread.sleep(10000);

				nightclub.leave();
				Thread.sleep(10000);
				System.out.println("\tLeft nightclub..."+Thread.currentThread().getName());
			} catch (InterruptedException ex) {

			}
		}


	}


}