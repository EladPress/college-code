//working
package assignment1;

import java.util.*;
public class MoreBonus1 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int min = reader.nextInt();
		int max = min;
		int num = 0;
		while(num != -1)
		{
			num = reader.nextInt();
			if(num < min && num != -1)
				min = num;
			if(num > max)
				max = num;
		}
		System.out.println("max = " + max + ", min = " + min);
	}

}
