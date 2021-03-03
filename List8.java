package org.trainingDay5;

import java.util.ArrayList;
import java.util.Scanner;

public class List8 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		System.out.println("Enter The size of the list");
		int size = scan.nextInt();
		System.out.println("Enter the elements into list");
		for(int i=0;i<=size-1;i++)
		{
		 a1.add(scan.nextInt());
		}
		System.out.println(a1);
		
	}

}
