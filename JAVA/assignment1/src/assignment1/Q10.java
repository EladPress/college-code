//working
package assignment1;

import java.util.*;
public class Q10 {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Height: ");
		int height = reader.nextInt();
		System.out.println("Width: ");
		int width = reader.nextInt();
		
		if(width <= 20 & width >= 1 && height <= 20 && width >= 1)
		{
			String edge = "";
			String middle = "";
			for(int i = 1; i <= width; i++)
			{
				edge += "*";
				if(i == 1 || i == width)
				    middle += "*";
				else
					middle += " ";
			}
			
			for(int i = 1; i <= height; i++)
			{
				if(i == 1 || i == height)
					System.out.println(edge);
				else
					System.out.println(middle);
			}
		}
	}

}
