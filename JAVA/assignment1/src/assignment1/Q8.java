//working

package assignment1;

import java.util.*;
public class Q8 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int num = reader.nextInt();
		if(!((num / 10000) < 10 && (num / 10000) > 0))
			System.out.println("Error");
		else
		{
			int divide = 10000;
			String s = "";
			do {
				s+= (num / divide) + "     ";
				num %= divide;
				divide /= 10;
				
			}while(divide != 0);
			System.out.println(s);
		}
		
		
	}

}
