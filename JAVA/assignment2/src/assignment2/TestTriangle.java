package assignment2;

import java.util.*;
public class TestTriangle {

	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Triangle test = new Triangle(8);
		Triangle test1 = new Triangle(4);
		Triangle test2 = new Triangle(24);
		test.show('r', 'b');
		test1.show('l', 'p');
		test2.show();
		test1.show('r');
		test2.show('r', 'a');
	}

}
