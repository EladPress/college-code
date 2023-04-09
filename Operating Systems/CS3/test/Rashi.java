import java.util.Scanner;

public class Rashi implements Runnable
{
	public static Scanner kelet=new Scanner(System.in);

	static Nightclub nightclub;
	public static int[] time = new int[7];
	
	public static void main(String[] args) throws InterruptedException 
	{
		for(int i = 0; i < 7; i++) time[i] = 0;
		nightclub = new Nightclub();
		System.out.println("hi");
		for (int i = 0; i < 7; i++)
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
				int name = Integer.parseInt(String.valueOf(Thread.currentThread().getName().charAt(Thread.currentThread().getName().length()-1)));
				
				int sleep = 10000;
				int minTime = Integer.MAX_VALUE;
				if(Thread.currentThread().getName().charAt(Thread.currentThread().getName().length()-1) % 2 != 0)
				{
					sleep *= 1.3;
				}
				System.out.println("\t\tInside nightclub..."+Thread.currentThread().getName());
				Thread.sleep(sleep);
				time[name] += sleep;
				
				nightclub.leave();
				for(int i = 0; i < 7; i++)
				{
					System.out.println("Thread number " + i + " was in the club for " + time[i]/1000 + " seconds");
					if(time[i] < minTime)
					{
						minTime = time[i];
					}
				}
				for(int i = 0; i < 7; i++)
				{
					if(time[i] == minTime)
					{
						System.err.println("Thread no. " + i + " at " + minTime/1000 + " secs");
					}
				}
				Thread.sleep(sleep);
				
			} catch (InterruptedException ex) {

			}
		}


	}


}