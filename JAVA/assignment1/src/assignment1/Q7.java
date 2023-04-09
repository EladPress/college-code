//working
package assignment1;

import java.util.Scanner;
public class Q7 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a = 0;
		int b = 0;
		do
		{
			a = reader.nextInt();
			b = reader.nextInt();
			
			if(a % b == 0)
				System.out.println("First number is a multiplication of the second number");
			else
				System.out.println("First number is not a multiplication of the second number");
		}while(a >= 0 && b >= 0);
	}

}
