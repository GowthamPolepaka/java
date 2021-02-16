package org.techouts;

import java.util.Scanner;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("The reverse order of an array");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
	}

}
