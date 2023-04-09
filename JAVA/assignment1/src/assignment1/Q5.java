//working
package assignment1;

public class Q5 {

	public static void main(String[] args) 
	{
		char eng = 'A';
		for(int i = 1; i <= 58; i++)
		{
			if((int)(eng) < 91 || (int)(eng) > 96)
			{
				System.out.println(eng + " = " + (int)(eng));
				
			}
			eng++;
		}
		
		char heb = 'à';
		for(int i = 0; i < 27; i++)
		{
			System.out.println((int)(heb) + " = " + heb);
			heb++;
		}
	}

}
