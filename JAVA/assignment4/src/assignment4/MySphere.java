package assignment4;

public class MySphere 
{
	public static double PI = 3.14;
	private double Radius;
	private MyPoint center;
	private static int count;
	
	public MySphere(double radius, MyPoint center)
	{
		this.center = center;
		this.SetRadius(radius);
		count++;
	}
	
	public MySphere()
	{
		this.center = new MyPoint();
		this.SetRadius(0);
		count++;
	}
	
	public double GetRadius()
	{
		return this.Radius;
	}
	
	public void SetRadius(double radius)
	{
		if(radius >= 0)
			this.Radius = radius;
	}
	
	public int GetCount()
	{
		return count;
	}
	
	
}
