package org.techouts;

import java.util.Scanner;

public class Array1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int[] a =new int[size];
		System.out.println("Enter the elements into an array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
			
		}
		int[] b =new int[size+1];
		System.out.println("Enter the index num");
		int index = scan.nextInt();
		System.out.println("enter the value to insert");
		int value = scan.nextInt();
		b[index] = value;
		for(int i=0;i<=a.length-1;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else 
			{
				
				b[i+1] = a[i];
			}
		}
		for(int i=0;i<=b.length-1;i++)
		{
			System.out.print(b[i]);
		}
	}

}
