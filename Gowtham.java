package org.trainingDay4;

import java.util.Scanner;

public class Gowtham  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		try
		{
		System.out.println("Enter the index number");
		int index = scan.nextInt();
		while(true)
		{
			
				char ch = s1.charAt(index);
				System.out.println(ch);
				break;
			}
		}
		
			catch(Exception e)
			{
				System.out.println(e);
				System.out.println("Index Number must be B/W"+" "+0+" "+" "+"to"+" "+(s1.length()-1));
				int index = scan.nextInt();
				//main(args);
			}
		}
		
	}


