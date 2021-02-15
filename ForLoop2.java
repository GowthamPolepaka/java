package org.training;

import java.util.Scanner;

public class ForLoop2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			int a = 5;
			int b = 8;
			System.out.println(a*b);
		}
		
	}

}
