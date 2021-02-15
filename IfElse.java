package org.training;

import java.util.Scanner;

public class IfElse 
{
	public static void main(String[] args) 
	{
		int age = 34;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age1 = scan.nextInt();
		if(age == age1)
		{
			System.out.println("Age is matched");
		}
		else
		{
			System.out.println("Age isn't matched");
		}
		
		
	}

}
