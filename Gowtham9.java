package org.trainingDay4;

import java.util.Scanner;

public class Gowtham9 
{
	public static void main(String[] args) throws TechoutsException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		String[] s1 = new String[size];
		System.out.println("Enter the elements into array");
		for(int i=0;i<=s1.length-1;i++)
		{
			s1[i] = scan.next();
		}
		
		System.out.println("Enter the Name");
		String name = scan.next();
		for(int i=0;i<=s1.length-1;i++)
		{
			if(s1[i] == name)
			{
				System.out.println(name);
			}
			else
			{
				throw new TechoutsException();
			}
			
		}
		}
		
		
	}

		
		
	
		
		
	

