package org.trainingDay4;

import java.util.Scanner;

public class Gowtham2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		try
		{
			for(int i=0;i<=a.length-1;i++)
			{
			   System.out.println("Enter the index number");
			   int index = scan.nextInt();
			   System.out.println(a[index]);
			   break;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Array Index Num must be B/w"+" "+0+" "+"to"+" "+ (a.length-1));
			int index = scan.nextInt();
			System.out.println(a[index]);
			
		}
		
		
	}

}
