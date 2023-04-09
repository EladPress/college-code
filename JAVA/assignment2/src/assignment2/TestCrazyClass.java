package assignment2;

public class TestCrazyClass {

	public static void main(String[] args) 
	{
		CrazyClass cc1 = new CrazyClass("abc", "123");
		CrazyClass cc2 = new CrazyClass("def", "456");
		
		cc1.show();
		cc2.show();
		
		cc1.setFirstString("ghi");
		cc1.setSecondString("789");
		cc1.show();
	}

}
