import java.util.Scanner;

public class stringreplace
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String s1 = scan.nextLine();

		int counter = 0;

		for(int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == 'a')
			{
				counter++;
			}
		}

		if (counter > 1)
		{
			String newS1 = s1.replace('a','*');
			System.out.println(newS1);
		}

		else
		{
			String newS1 = s1.replace('a','%');
			System.out.println(newS1);
		}
	}
}