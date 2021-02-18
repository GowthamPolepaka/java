package org.trainingDay4;

public class Demo1 
{

	public static void main(String[] args) 
	{
		try
		{
		int[] a = new int[5];
		a[0] = 23;
		a[1] = 34;
		a[2] = 45;
		a[3] = 56;
		a[4] = 78;
		System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exceptoin Occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index bound Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occurs");
		}
	}
}
