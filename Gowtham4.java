package org.trainingDay4;

import java.util.Iterator;
import java.util.Scanner;

public class Gowtham4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		try {
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		int result;
		int num1 = a[0];
		int num2 = a[1];
		int num3 = a[2];
		int num4 = a[3];
		int num5 = a[4];
	    result = num1*num2*num3*num4;
		System.out.println("The Result is"+" "+result);
		for(int i=4;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		}
		catch(Exception e)
		{
			//System.out.println("Exception Occured"+ e);
			System.out.println("Enter the valid Index Num for printing the array");
			main(args);
		}
	}

}
