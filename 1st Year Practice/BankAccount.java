public class BankAccount
{
	//declare attributes
	private String name;
	private double balance;
	private int accountID;
	private static int counter = 10001;


	//constructor with parameters
	public BankAccount(String name, double balance)
	{
		this.name = name;
		setBalance(balance);
		accountID = counter++;
	}

	//set method for balance
	public void setBalance(double balance)
	{
		if(balance >=0)
			this.balance = balance;
		else
		{
			System.out.println("Balance must be 0 or more");
			this.balance = 0;
		}
	}

	//set method for name
	public void setName(String name)
	{
		this.name = name;
	}

	//get method for balance
	public double getBalance()
	{
		return balance;
	}

	//get method for name
	public String getName()
	{
		return name;
	}


	//method to make a deposit
	public void deposit(double amount)
	{
		balance += amount;
	}

	//method to make a withdrawl
	public void withdrawl(double amount)
	{
		if(amount > balance)
			System.out.println("Insufficient funds");
		else
		{
			balance -= amount;
		}
	}

	//print the details of account
	public void print()
	{
		System.out.println("******************");
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("Account ID: " + accountID);
		System.out.println("******************");
	}

	//To string method
	public String toString()
	{
		String details = null;
		details = "Name:; " + name + "\nBalance: " + balance + "\nAccount ID: " + accountID;
		return details;
	}
}