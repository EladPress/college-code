//working
package assignment1;

import java.util.*;
//import java.util.Scanner;
public class Q4 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double PI = 3.14159;
		System.out.print("Radius = ");
		int radius = reader.nextInt();
		System.out.println("Diameter = " + 2 * radius);
		System.out.println("Circumference = " + 2 * PI * radius);
		System.out.println("Area = " + PI * radius * radius);
	}

}

