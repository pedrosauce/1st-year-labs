public class lab1_2
{

	public static void main (String args[])
	{
		int num = 2578;
		int digitone = 0, digittwo = 0, digitthree = 0, digitfour = 0;

		//extract first digit
		digitone = num % 10;
		num = num / 10;
		digittwo = num % 10;
		num = num / 10;
		digitthree = num % 10;
		num = num / 10;
		digitfour = num;

		System.out.println("The digits of our number are:  \n" + digitfour +  "\n" + digitthree + "\n" + digittwo + "\n" + digitone);

	}
}