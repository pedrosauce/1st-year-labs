import java.util.Scanner;

public class person
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);

		//prompt the user to input
		System.out.println("Please enter your name: ");
		String name = new String(sc.nextLine());

		System.out.println("Please enter your address: ");
		String address = new String(sc.nextLine());

		System.out.println("Please enter your date of birth: ");
		String DOB = new String(sc.nextLine());

		System.out.println("Please enter your wages: ");
		double wages = sc.nextDouble();

		System.out.println("Please enter number of brothers: ");
		int brothers = sc.nextInt();

		System.out.println("Hello: " + name);
		System.out.println("Your wages are " + wages);
		System.out.println("Your date of birth is " + DOB);
		System.out.println("Your address is " + address);
		System.out.println("You have " + brothers + " brothers");
	}
}