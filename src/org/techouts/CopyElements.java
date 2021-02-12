package org.techouts;

import java.util.Scanner;

public class CopyElements 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = scan.nextInt();
			
		}
		int[] b = new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]= a[i];
		}
		for (int i = 0; i < b.length; i++) 
		{
			System.out.print(b[i]+" ");
			
		}
	}

}
