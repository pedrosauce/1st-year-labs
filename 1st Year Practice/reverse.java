//Declare a string. Use a for loop to run backwards through the string. If the character is not not a space, then print out the character to the screen.
//If the character is a space then start a new print line.


public class reverse
{
	public static void main (String args[])
	{
		String s1 = new String ("My name is not Pedro");

		for (int i = s1.length(); i > 0; i--)
		{
			if (s1.charAt (i-1) != ' ')
			{
				System.out.print(s1.charAt(i-1));

			}
			else
			{
				System.out.println();
			}
		}
	}
}