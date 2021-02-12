package org.techouts;

public class ExceptionHandling 
{
	public static void main(String[] args)
	{
		try
		{
		int[] a = new int[2];
		a[1] = 2;
		a[2] = 4;
		System.out.println(a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println();
		}
		
		
		
	}
}
