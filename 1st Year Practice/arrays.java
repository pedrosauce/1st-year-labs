import java.util.Scanner;

public class arrays
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What size array would you like to create: ");
		//read in a value and create an array of that size
		int size = sc.nextInt();
		//create an array of doubles of size "size"
		double ar[] = new double[size];
		//ask the user to populate the array

		for (int i = 0; i < ar.length; i++)
		{
			System.out.println("please enter a value for position " + i + ": " );
			ar[i] = sc.nextDouble();
		}
		//get the largest value in our array
		double largest = ar[0], smallest = ar[0], sum = 0.0;
		//Traverse through the array
		for(int j = 0; j < ar.length; j++)
		{
			//find the largest
			if(ar[j] > largest)
			{
				largest = ar[j];
			}
			//find the smallest
			if(ar[j] < smallest)
			{
				smallest = ar[j];
			}
			sum = sum + ar[j]; //keep running total of the sum
		}//end for loop

		System.out.println("The largest value is: " + largest);
		System.out.println("The smallest value is: " + smallest);
		System.out.println("The average of the elements in the array is : " + sum/size);
	}
}