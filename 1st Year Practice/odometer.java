import java.util.Scanner;

public class odometer
{
	public static void main(String args[])
	{
		int right_counter = 0, left_counter = 0, centre_counter = 0;

			//outer loop
			for (left_counter = 0; left_counter < 10; left_counter++)
			{
				//inner loop
				for(centre_counter = 0; centre_counter < 10; centre_counter++)
				{
				//inner inner loop
				for (right_counter = 0; right_counter < 10; right_counter++)
				{
				System.out.println(left_counter + " " + centre_counter + " " + right_counter);
				}
				right_counter = 0;
			}//end inner loop
				centre_counter = 0;
			}//end outer loop
	}
}