package assignment2;

public class CrazyClass 
{
	private String firstString;
	private String secondString;
	
	public CrazyClass()
	{
		this.setFirstString("");
		this.setSecondString("");
	}
	
	public CrazyClass(String firstString, String secondString)
	{
		this.setFirstString(firstString);
		this.setSecondString(secondString);
	}
	
	public void setFirstString(String firstString)
	{
		this.firstString = firstString;
	}
	
	public void setSecondString(String secondString)
	{
		this.secondString = secondString;
	}
	
	public String getFirstString()
	{
		return this.firstString;
	}
	
	public String getSecondString()
	{
		return this.secondString;
	}
	
	public boolean equals(CrazyClass cc)
	{
		if(this.getFirstString() == cc.getFirstString() && this.getSecondString() == cc.getSecondString())
			return true;
		else
			return false;
	}
	
	public void show()
	{
		System.out.println(this.getFirstString() + " " + this.getSecondString());
	}
}
