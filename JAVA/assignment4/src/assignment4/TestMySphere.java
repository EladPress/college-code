package assignment4;

public class TestMySphere {

	public static void main(String[] args) 
	{
		MySphere s1 = new MySphere();
		MyPoint point = new MyPoint(2,32);
		MySphere s2 = new MySphere(12, point);
		System.out.println("s1 = " + s1.GetRadius() + ", " + s1.PI * Math.pow(s1.GetRadius(),2));
		System.out.println("s2 = " + s2.GetRadius() + ", " + s2.PI * Math.pow(s2.GetRadius(),2));
	    System.out.println("Count = " + s2.GetCount());
	}
	

}
