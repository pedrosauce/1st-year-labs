public class test
{
	public static void main (String args [])
	{
		//find the lowest common multiple of 2 numbers
		int x = 37899, y = 657;
		//we want to keep checking numbers from 1 to see if the number is divisible by x and y
		boolean found = false;
		int i = 1;
		while (found == false)
		{
			if (i % x == 0 && i % y == 0)
			{
				System.out.println(i + " is divisible by " + x + " and " + y);
				found = true;
			}
			i++;
		}
	}
}