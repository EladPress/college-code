//working
package assignment1;

import java.util.*;
public class Bonus4 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num = reader.nextInt();
		Boolean bool = true;
		for(int i = 2; i < num; i++)
		{
			if(num / i != 0 && num % i == 0)
				bool = false;
		}
		//System.out.print(97 / 12);
		if(bool)
			System.out.print("prime");
		else
			System.out.print("Not prime");
	}

}
