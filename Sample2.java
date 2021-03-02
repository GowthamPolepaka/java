package org.trainingDay8;

import java.util.Scanner;

public class Sample2 extends Thread
{
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	
	String color;
	public Sample2( String color)
	{
		
		this.color = color;
	}
	public void run()
	{
		this.sprinkle();
		this.Duplicate();
	}
	int count;
	public void sprinkle()
	{
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch = name.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
			
		}
		System.out.println("The count of Digits"+" "+count);
		System.out.println(color+" "+"The Colour Sprinkles"+" at"+" "+name);
	}
	String name2 = "";
	public void Duplicate()
	{
		for(int i=0;i<=name.length()-1;i++)
		{
			char ch = name.charAt(i);
			int k = name2.indexOf(ch);
			if(k == -1)
			{
				name2 = name2+ch;
			}
		}
			System.out.println("The name after removing duplicates"+" "+name2);
		
	}

}
