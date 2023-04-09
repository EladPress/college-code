//working
package assignment1;

import java.util.*;
public class Bonus6 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		int max = 0;
		int min;
		if(num1 < num2)
			min = num1;
		else
			min = num2;
		
		for(int i = 1; i <= min; i++)
		{
			if(num1 % i == 0 && num2 % i == 0 && i > max)
			{
				max = i;
			}
		}
		
		System.out.println(max);
	}

}
