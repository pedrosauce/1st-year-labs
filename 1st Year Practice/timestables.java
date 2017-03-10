public class timestables
{
	public static void main (String args[])
	{
		int num = 0, mul = 0, answer = 0;

		while (num <= 12)
		{

			System.out.println("\n******************\n");
			mul = 0;

			while (mul <= 12)
			{
				answer = num * mul;
				System.out.println(num + " x " + mul + " = " + answer);
				mul++;
			}

			num++;
		}
	}
}