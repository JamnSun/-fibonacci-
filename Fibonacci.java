package review;

public class Fibonacci 
{
	public static void getFib()
	{
		int c1 = 1;
		int c2 = 1;
		int c3;
		System.out.println(""+c1);
		System.out.println(""+c2);
		for (int i = 3;i<=14;i++)
		{
			c3=c1+c2;
			System.out.println(""+c3);
			c1=c2;
			c2=c3;
		}
	}
	public static void main (String[] args)
	{
		getFib();
	}
}
