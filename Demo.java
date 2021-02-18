package org.trainingDay4;

public class Demo 
{
	public static void main(String[] args)
	{
		try
		{
		int data = 100/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		