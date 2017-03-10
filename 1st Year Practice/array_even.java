import java.util.Scanner;
import java.util.Random;

public class array_even
{
	public static void main (String args[])
	{
		double largest_even = 0;
		double ar[] = new double[10];
		Random rand = new Random();

		for (int i = 0; i < ar.length; i++)
		{
			ar[i] = rand.nextInt(100);

		System.out.println("The elements in the array are " + ar[i]);
		}
		for (double j = ar[0]; j < ar.length; j++)
		{
			while (j > ar[0] && j % 2 == 0)
			{
				largest_even = j;
				System.out.println(largest_even);
			}
		}

	}
}