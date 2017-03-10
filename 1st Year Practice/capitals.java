//Declare a string. Convert string to lower case. Start a for loop that runs through the string character by character until it reaches the length of the string.
//When the for loop starts at position 0 on the string, make the character next to 0 a new substring called firstletter. Convert the substring to uppercase and print to the screen.
//If the loop comes across a space, make the space and the letter beside it a new substring called remaining. Convert substring remaining to uppercase and print to screen.
//For all other characters, print them to the screen as they are
public class capitals
{
	public static void main (String args[])
	{
		String s1 = new String("My dog is black");
		String s2 = new String(s1.toLowerCase());

		for (int i = 0; i < s1.length(); i++)

		{
			if (i == 0)
			{
				String firstletter = s1.substring(i,i+1);
				String firstletterUpper = firstletter.toUpperCase();
				System.out.print(firstletterUpper);
			}

			else if (s1.charAt(i-1) == ' ')
			{
				String remaining = s1.substring(i,i+1);
				String remainingUpper = remaining.toUpperCase();
				System.out.print(remainingUpper);
			}

			else
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}