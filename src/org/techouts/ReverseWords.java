package org.techouts;

import java.util.Scanner;

public class ReverseWords
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String s1 = scan.nextLine();
		String[] sArr = s1.split(" ");
		for(int i=sArr.length-1;i>=0;i--)
		{
			System.out.print(sArr[i]+" ");
		}
	}

}
