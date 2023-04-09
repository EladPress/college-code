package assignment3;

public class Bank {

	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount(123456, "Elad Press");
		BankAccount b2 = new BankAccount(654321, "Amit Krul");
		b1.deposit(3100);
		b1.withdraw(100);
		b2.deposit(800);
		b2.withdraw(200);
		b2.transfer(b1, 600);
		b1.show();
		b2.show();
		BankAccount.getCount();
	}

}
