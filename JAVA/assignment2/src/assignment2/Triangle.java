package assignment2;

public class Triangle 
{
	private int size;
	
	public Triangle()
	{
		this.size = 0;
	}
	
	public Triangle(int size)
	{
		this.setSize(size);
	}
	
	public void setSize(int size)
	{
		this.size = size;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public double area()
	{
		return Math.pow(this.size, 2) / 2;
	}
	
	public double hypot()
	{
		return Math.sqrt(2 * Math.pow(this.getSize(), 2));
	}
	
	public void show()
	{
		System.out.println("length = " + this.getSize() + ", area = " + this.area());
		
	}
	
	public void show(char type)
	{
		String width = "*";
		if(type == 'l')
		{
			for(int i = 1; i <= this.getSize(); i++)
			{
				System.out.println(width);
				width += "*";
			}
		}
		
		if(type == 'r')
		{
			for(int i = 1; i <= this.getSize(); i++)
			{
				//int space = this.getSize() - i;
				for(int j = 1; j <= (this.getSize() - i); j++)
				{
					System.out.print(" ");
				}
				System.out.println(width);
				width += "*";
			}
		}
//		else
//			System.out.println("fail");
	}
	
	public void show(char type, char c)
	{
		
		if(type == 'l')
		{
			for(int i = 1; i <= this.getSize(); i++)
			{
				for(int j = 1; j <= i; j++)
				{
					System.out.print(c);
				}
				System.out.print("\n");
			}
		}
		
		if(type == 'r')
		{
			for(int i = 1; i <= this.getSize(); i++)
			{
				//int space = this.getSize() - i;
				for(int j = 1; j <= (this.getSize() - i); j++)
				{
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++)
				{
					System.out.print(c);
				}
				System.out.print("\n");
			}
		}
//		else
//			System.out.println("fail");
	}
	
}
