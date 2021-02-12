package org.techouts;

import java.util.Scanner;

public class PrimeNum 
{
	public static void main(String[] args) 
	{
	 
		for(int n=1;n<=10;n++)
		{
			int count = 0;
			for(int i=1;i<=n;i++)
			{
				if(n%i == 0)
				{
					count++;
					
				}
			}
		
			if(count == 2)
			{
			System.out.print(n+" ");
			}
	  }
		
		System.out.println();
		int[] a = new int[4];
		a[0] = 2;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index");
		int index = scan.nextInt();
		for(int i=0;i<=a.length-1;i++)
		{
			if(i==index)
			{
				System.out.println(a[i]);
			}
			
		}
	
	

}
}
