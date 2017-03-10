//Declare ints num, mult and answer and set them all to 0. While num is less than or equal to 12 print stars to the screen to seperate the rest of the output
//While mult is less than or equal to 12, multiply num by mult and save the answer in the answer int. Print this to the screen then do the same with the
//next mult, until you get to 12 and the same with num until you get to 12

public class times_tables
{
	public static void main (String args[])
	{
		int num = 0, mult = 0, answer = 0 ;

		while (num <=12)
		{
			System.out.println("\n************\n");
			mult = 0;

			while (mult <= 12)
			{
				answer = num * mult;
				System.out.println(num + " * " + mult + " =  " + answer);
				mult++;
			}
			num++;
		}
	}
}