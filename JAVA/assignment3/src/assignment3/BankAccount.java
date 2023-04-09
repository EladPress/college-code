package assignment3;

public class BankAccount 
{
	private double balance;
	private int accountNumber;
	private String owner;
	private static int counter;
	
	public BankAccount(int accountNumber, String owner)
	{
		this.setBalance(0);
		this.setAccountNumber(accountNumber);
		this.setOwner(owner);
		this.counter++;
	}
	
	public void deposit(double ammount)
	{
		this.setBalance(this.getBalance() + ammount);
	}
	
	public boolean withdraw(double ammount)
	{
		if(ammount <= this.getBalance())
			this.setBalance(this.getBalance() - ammount);
		return ammount <= this.getBalance();
	}
	
	public void transfer(BankAccount ba, double ammount)
	{
		this.withdraw(ammount);
		ba.deposit(ammount);
	}
	
	public void show()
	{
		System.out.println("Name of owner: " + this.getOwner() + ", account number: " + this.getAccountNumber() + ", balance: " + this.getBalance());
	}
	
	public static void getCount()
	{
		System.out.println(counter);
	}
	
	public boolean setBalance(double balance)
	{
		if(balance >= 0)
			this.balance = balance;
		return balance >= 0;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public boolean setAccountNumber(int accountNumber)
	{
		if(accountNumber > 0)
			this.accountNumber = accountNumber;
		return accountNumber > 0;
	}
	
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	
	public boolean setOwner(String owner)
	{
		if(owner != "")
			this.owner = owner;
		return owner != "";
	}
	
	public String getOwner()
	{
		return this.owner;
	}
	
}
