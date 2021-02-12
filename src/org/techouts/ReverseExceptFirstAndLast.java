package org.techouts;

import java.util.Scanner;

public class ReverseExceptFirstAndLast 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = scan.next();
		String s2 = "";
		for(int i=s1.length()-2;i>0;i--)
		{
			char ch = s1.charAt(i);
			s2 = s2+ch;
		}
		System.out.println(s1.charAt(0)+s2+s1.charAt(s1.length()-1));
		
	}

}
