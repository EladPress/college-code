package assignment4;

public class MyLine 
{
	private MyPoint start, end;
	
	public MyLine()
	{
		this.start = new MyPoint();
		this.end = new MyPoint();
	}
	
	public MyLine(MyPoint start, MyPoint end)
	{
		this.start = new MyPoint(start.getX(), start.getY());
		this.end = new MyPoint(end.getX(), end.getY());
	}
	
	public MyLine(double endX, double endY, double startX, double startY)
	{
		this.start = new MyPoint(startX, startY);
		this.end = new MyPoint(endX, endY);
	}
	
	public double length()
	{
		return this.start.distance(this.end);
	}
	
	public String show()
	{
		return "Line starts at: " + this.start.show() +  "\n Line ends at: " + this.end.show();
	}
	
}
