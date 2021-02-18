package org.trainingDay4;

import java.util.Scanner;

public class Demo3
{
	public static void main(String[] args) 
	{
		
	try
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the String");
	
	String s1 = scan.next();
	System.out.println(s1);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

}
}
