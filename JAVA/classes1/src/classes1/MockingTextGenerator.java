package classes1;
//working
import java.util.*;
public class MockingTextGenerator 
{

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("enter string: ");
		String str = reader.nextLine();
		System.out.println(mockingTextGenerator(str));
	}
	
	public static String mockingTextGenerator(String str)
	{
		Random rand = new Random();
		String str2 = "";
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			boolean bool = rand.nextBoolean();
			char c2 = (bool) ? (char)((int)c - 32) : c;
			str2 += c2;
		}
		return str2;
	}

}
