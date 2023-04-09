//working
package assignment1;

import java.util.Scanner;
public class Q6 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("number 1 = ");
		int a = reader.nextInt();
		System.out.println("number 2 = ");
		int b = reader.nextInt();
		System.out.println("number 3 = ");
		int c = reader.nextInt();
		System.out.println("number 4 = ");
		int d = reader.nextInt();
		System.out.println("number 5 = ");
		int e = reader.nextInt();
		
		int max = Math.max(a, Math.max(b, Math.max(c, Math.max(d, e))));
		int min = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
		System.out.println("Max = " + max + ", Min = " + min);
	}

}

