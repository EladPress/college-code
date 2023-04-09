//working
package assignment1;

import java.util.*;
public class Bonus7 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num = reader.nextInt();
		int temp = num;
		int reverse = 0;
		while(temp != 0)
		{
			reverse *= 10;
			reverse += (temp % 10);
			temp /= 10;
			
			//reverse += 
		}
		if(reverse == num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
	}

}
