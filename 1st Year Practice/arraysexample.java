
public class arraysexample
{
	public static void main (String args[])
	{
		int a[] = new int[5];
		a[0] = 2;
		a[1] = 12;
		a[2] = -76;
		a[3] = 78;
		a[4] = -674;

		for(int x = 0; x < a.length; x++)
		{
			System.out.println(a[x]);
		}
		int b[] = {1, 15, 25, -67, -999, 123};
		int len = b.length;
		System.out.println("Length: " + len);
		b[2] = b[2] * 4;
			for(int y = 0; y < b.length; y++)
		{
			System.out.println(b[y]);
		}
	}
}