package assignment3;

public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	public Date()
	{
		this.setDay(1);
		this.setMonth(1);
		this.setYear(2000);
	}
	
	public boolean setDay(int day)
	{
		if(day <= 31 && day >= 1)
			this.day = day;
		return day >= 1 && day <= 31;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public boolean setMonth(int month)
	{
		if(month >= 1 && month <= 12)
			this.month = month;
		return month >= 1 && month <= 12;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public boolean setYear(int year)
	{
		if(year >= 1900 && year <= 2100)
			this.year = year;
		return year >= 1900 && year <= 2100;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public void print()
	{
		System.out.println(this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
	}
}
