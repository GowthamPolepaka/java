package org.training;

import java.util.Scanner;

public class ForLoop3 
{
	public static void main(String[] args) 
	{
		//Best examples for "ForLoops" are String and array Programs... 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = scan.nextInt();
		}
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
