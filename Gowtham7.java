package org.trainingDay4;

import java.util.Scanner;

public class Gowtham7
{
	public static void main(String[] args) 
	{
		try
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the num");
		int i = scan.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Enter the Number");
			Scanner scan = new Scanner(System.in);
			int i = scan.nextInt();
			System.out.println(i);
		
		}
		
	}

}
