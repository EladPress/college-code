//working
package assignment1;

import java.util.Scanner;
public class Q3 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args)
	{
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		
		System.out.println("Sum = " + (a + b + c));
		System.out.println("Average = " + (double)((a + b + c) / 3));
		System.out.println("Multiplication = " + a * b * c);
		
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
