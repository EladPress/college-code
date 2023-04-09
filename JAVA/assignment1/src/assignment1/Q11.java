//working
package assignment1;

import java.util.*;
public class Q11 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int height = reader.nextInt();
		String width = "*";
		
		//System.out.println(width);
		for(int i = 0; i < height; i++)
		{
			for(int j = 1; j <= (height - i); j++)
			{
				System.out.print(" ");
			}
			System.out.println(width);
			width += "**";
			
			
		}
	}

}
