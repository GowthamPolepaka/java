package org.trainingDay4;

import java.util.Scanner;

public class Gowtham8 
{
	public static void main(String[] args) throws TechoutsException
	{
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the String");
	 String s1 = scan.next();
	 if(s1.length() == 6) 
	 {
		 System.out.println(s1);
	 }
	 else
	 {
		 throw new TechoutsException();
	 }
		 
	 }
}