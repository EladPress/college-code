package assignment4;

public class TryPoint {

	public static void main(String[] args) 
	{
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(6, 3);
		MyPoint p3 = new MyPoint(12, 324);
		System.out.println(p1.distance(p2));
		System.out.println(p1.show());
		System.out.println(p2.show());
		System.out.println(p3.show());
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
