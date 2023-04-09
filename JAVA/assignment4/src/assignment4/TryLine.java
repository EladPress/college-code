package assignment4;

public class TryLine {

	public static void main(String[] args) 
	{
		MyLine l1 = new MyLine();
		MyPoint p1 = new MyPoint(3, 6);
		MyPoint p2 = new MyPoint(12, 54);
		MyLine l2 = new MyLine(p1, p2);
		MyLine l3 = new MyLine(123, 432, 12, 9);
		System.out.println(l1.length());
		System.out.println(l2.length());
		System.out.println(l3.length());
	}

}
