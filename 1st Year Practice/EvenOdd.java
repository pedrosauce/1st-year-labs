import java.util.Scanner;

public class EvenOdd
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();

		if (num % 2 == 0)  //even
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}