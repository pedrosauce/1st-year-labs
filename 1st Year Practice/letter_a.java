 public class letter_a
{
	public static void main (String args[])
	{
		String s1 = new String ("The rain in spain falls mainly on the plane");

			int counter = 0;

			for(int i = 0 ; i < s1.length(); i++)
			{
				if (s1.charAt (i) == 'a')
				{
					counter++;
				}
			}
			if (counter > 3)
			{
				String s2 = s1.replace('a','*');
				System.out.println(s2);

			}
			else
			{
				String s2 = s1.replace('a','%');
				System.out.println(s2);
			}
	}
}