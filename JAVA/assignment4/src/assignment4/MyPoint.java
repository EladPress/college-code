package assignment4;

public class MyPoint 
{
	private double x, y;
	
	public MyPoint()
	{
		this.setX(0);
		this.setY(0);
	}
	
	public MyPoint(double x, double y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	public void move(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
	
	public double distance(MyPoint point)
	{
		return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2));
	}
	
	public boolean equals(MyPoint point)
	{
		return (this.getX() == point.getX() && this.getY() == point.getY());
	}
	
	public String show()
	{
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
