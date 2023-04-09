//working
package assignment1;

import java.util.*;
public class Bonus5 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num = reader.nextInt();
		for(int i = 2; i <= num; i++)
		{
			if(num % i == 0)
			{
				System.out.print(i + ", ");
				num = num / i;
				i = 1;
			}
		}
		
	}

}
