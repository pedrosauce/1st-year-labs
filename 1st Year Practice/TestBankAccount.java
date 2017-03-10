import java.util.Scanner;


	public static void main (String args[])
{

	{
		BankAccount acc1 = new BankAccount("Susan Bergin", 100000);
		double amount = acc1.getBalance();
		System.out.println(amount);
		acc1.setBalance(200000);
		System.out.println(acc1.getBalance());
		acc1.withdrawl (300000);
		acc1.deposit (120000);
		acc1.withdrawl (300000);
		System.out.println(acc1.getBalance());
		System.out.println(acc1.toString());
		acc1.print();

		BankAccount list[] = new BankAccount[3];
		list [0] = new BankAccount("John Black", 10000);
		list [1] = new BankAccount("Mary Smith", 3);
		list [2] = new BankAccount("Oliver Dunne", 300000);

		//keyboard input
		Scanner scan = new Scanner(System.in);

	}
}