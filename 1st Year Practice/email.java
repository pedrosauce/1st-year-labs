import java.util.Scanner;

public class email
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter email address:");
		String input = new String(sc.nextLine());
		for (int i = 0; i < input.length(); i++)
		{
			if (input.charAt(i) == '@')
			{
				String emailname = input.substring(0,i);
				String name = emailname.replace(".", " ");
				String domain = input.substring((i+1), input.length());

				System.out.println("Name: " + name);
				System.out.println("Domain: " + domain);

				boolean found = false;
				int pos = 0;

				while (found == false)
				{
					if (emailname.charAt(pos) == '@')
					{
						name = emailname.substring(0,pos);
						domain = emailname.substring(pos + 1);
						found = true;

					}
					pos++;
				}
			}
		}
	}
}