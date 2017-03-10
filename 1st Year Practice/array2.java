import java.util.Scanner;
public class array2
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array to create: ");
		int size = sc.nextInt();
		double a[] = new double [size];

		for(int x = 0; x < a.length; x++)
		System.out.println("Please enter a value for position: " + x);
		a[x] = sc.nextDouble();
	}
	double sum = 0.0, average = 0.0;
	for(int y = 0; y < a.length; y++)
	{
		System.out.print(a[y] + " ");
		sum = sum + a[y];
	}
	System.out.println("\nThe sum of the array is: " + sum);
	}
}