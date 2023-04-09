package assignment2;

public class MyClass 
{
	private int fieldX;
	private int fieldY;
	
	public MyClass()
	{ 
		fieldX = 0;
		fieldY = 0;
	}
	
	public MyClass(int fieldX, int fieldY)
	{
//		if(fieldX < 0)
//			this.fieldX = (fieldX * -1);
//		else
//			this.fieldX = fieldX;
//		
//		if(fieldY < 0)
//			this.fieldY = (fieldY * -1);
//		else
//			this.fieldY = fieldY;
		
		this.setFieldX(fieldX);
		this.setFieldY(fieldY);
	}
	
	public void setFieldX(int fieldX)
	{
	     this.fieldX = Math.abs(fieldX);
	}
	
	public void setFieldY(int fieldY)
	{
	     this.fieldY = Math.abs(fieldY);
	}
	public int getFieldX()
	{
		return this.fieldX;
	}
	
	public int getFieldY()
	{
		return this.fieldY;
	}
	
	public void show()
	{
		System.out.println("fieldX = " + this.getFieldX() + ", fieldY = " + this.getFieldY());
	}
	
	public int sum()
	{
		return this.getFieldX() + this.getFieldY();
	}
	
	public int mult()
	{
		return this.getFieldX() * this.getFieldY();
	}
	
	public int powerSum()
	{
		return (int) Math.pow(this.getFieldX(), 2) + (int) Math.pow(this.getFieldY(), 2);
	}
	
	public boolean equals(MyClass mc)
	{
		if(this.getFieldX() == mc.getFieldX() && this.getFieldY() == mc.getFieldY())
			return true;
		else
			return false;
	}
}
