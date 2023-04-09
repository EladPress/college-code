//working
package assignment1;

import java.util.*;
public class Q9 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int positiveCounter = 0, negativeCounter = 0, zeroCounter = 0;
		for(int i = 0; i < 5; i++)
		{
			System.out.println("enter number " + (i + 1) + ":");
			
			int temp = reader.nextInt();
			if(temp == 0)
				zeroCounter++;
			if(temp > 0)
				positiveCounter++;
			if(temp < 0)
				negativeCounter++;
			
			
		}
		System.out.println(zeroCounter + " zeros.");
		System.out.println(positiveCounter + " positive numbers.");
		System.out.println(negativeCounter + " negative numbers.");
	}

}
