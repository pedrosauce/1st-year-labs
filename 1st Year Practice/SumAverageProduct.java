public class SumAverageProduct

{
	public static void main (String args[])
	{

		//declare our 6 decimals
		float num1 = 12.5f, num2 = -45.32f, num3 = 98.3f, num4 = 908.54f, num5 = -23.4f, num6 = 137.89f;

		float sum = 0.0f, average = 0.0f, product = 0.0f;

		//calculate the sum
		sum = num1 + num2 + num3 + num4 + num5 + num6;
		System.out.println("The sum is: " + sum);

		//calculate average
		average = sum / 6;
		System.out.println("The average is: " + average);

		//calculate product
		product = num1 * num2 * num3 * num4 * num5 * num6;
		System.out.println("The product is: " + product);
	}
}