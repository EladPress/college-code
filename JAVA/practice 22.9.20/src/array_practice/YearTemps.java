package array_practice;


public class YearTemps 
{
	private static String[] months = new String[13];
	
	
	
	private double[] tempPerMonth = new double[13];
	private double avgTemp;
	private int year;
	
	public YearTemps(int year)
	{
		
		months[1] = "January";
		months[2] = "February";
		months[3] = "March";
		months[4] = "April";
		months[5] = "May";
		months[6] = "June";
		months[7] = "July";
		months[8] = "August";
		months[9] = "September";
		months[10] = "October";
		months[11] = "November";
		months[12] = "December";
		
		this.year = year;
		this.avgTemp = 0;
		for(int i = 1; i <= 12; i++)
		{
			this.tempPerMonth[i] = Math.random() * (40 - -10) - 10;
			this.avgTemp += this.tempPerMonth[i];
		}
		this.avgTemp /= 12;
	}
	
	public double getAverage()
	{
		return this.avgTemp;
	}
	
	public void print()
	{
		System.out.println("The year: " + this.year);
		for(int i = 1; i <= 12; i++)
		{
			System.out.println(months[i] + ": " + this.tempPerMonth[i]);
		}
	}
}
