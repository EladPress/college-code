package assignment2;

public class TestMyClass {

	public static void main(String[] args) 
	{
		MyClass mc1=new MyClass(-5,7);
		MyClass mc2=new MyClass(5,7);
		MyClass mc3=mc2;
		MyClass mc4=new MyClass();
		
		mc1.show();
		mc2.show();
		
		System.out.println("mc1: Sum = " + mc1.sum() + ", mult = " + mc1.mult() + ", powerSum = " + mc1.powerSum());
		
		System.out.println(mc1 == mc2);
		System.out.println(mc1.equals(mc2));
	}

}
