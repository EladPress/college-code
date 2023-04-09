package array_practice;

public class IceCream 
{
	private static String[] tastes = {"Chocolate", "Mocha", "Strawberry", "Vanilla", "Oreo"};
	private String[] flavors;
	
	public IceCream(int n)
	{
		this.flavors = new String[n];
		int range = (tastes.length - 1 - 0) + 1;
		
		for(int i = 0; i < this.flavors.length; i++)
		{
			int random = (int)(Math.random() * range);
			this.flavors[i] = tastes[random];
		}
	}
	
	public void show()
	{
		System.out.println();
		for(int i = 0; i < flavors.length; i++)
		{
			System.out.print(this.flavors[i] + ", ");
		}
	}
}
