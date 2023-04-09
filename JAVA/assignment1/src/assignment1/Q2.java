//working
package assignment1;

public class Q2 {

	public static void main(String[] args) 
	{
		char c = 'A';
		for(int i = 1; i <= 26; i++)
		{
			if(c != 'A' && c != 'E' && c != 'U' && c != 'I' && c != 'O')
				System.out.print(c);
			
			c++;
		}
	}

}
