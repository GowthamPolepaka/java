package org.trainingDay4;

import java.util.Scanner;

public class Gowtham6 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into an array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		try
		{
			for(int i=0;i<=a.length;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Print the Array Correctly");
			
		}
		
	}

}
