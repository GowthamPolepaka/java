package org.trainingDay4;

import java.util.Scanner;

public class Demo2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		try
		{
		int[] b = new int[size-1];
		for(int i=0;i<=a.length-1;i++)
		{
			b[i] = a[i];
		}
		for(int i=0;i<=b.length-1;i++) 
		{
			System.out.println(b[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Please check the size of an array");
		}
		System.out.println("hello");
	}

}
