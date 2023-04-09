//working
package assignment1;

import java.util.*;
public class Bonus3 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num = reader.nextInt();
		int counter = 0;
		while(num != 0)
		{
			num /= 10;
			counter++;
		}
		System.out.println(counter);
	}

}
