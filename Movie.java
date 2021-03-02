package org.trainingDay8;

import java.util.Scanner;

public class Movie extends Thread
{
	Scanner scan = new Scanner(System.in);
	String movieName = scan.next();
	int budget;
	public Movie( int budget)
	{
		this.movieName = movieName;
		this.budget = budget;
	}
	@Override
	public void run()
	{
		this.horror();
		this.action();
	}
	String s2 = "";
	public void horror()
	{
		for(int i=0;i<=movieName.length()-1;i++)
		{
			char ch = movieName.charAt(i);
			if(ch == 'G' || ch == 'R' || ch=='U' || ch == 'D' || ch == 'E')
			{
				//System.out.print(ch);
				s2 = s2+ch;
			}
			else
			{
				System.out.println("Movie isnt horror film");
			}
		}
		System.out.println(s2);
		System.out.println("The Budget of movie is"+" "+budget);
	}
	public void action()
	{
		System.out.println("Enter the Size of an array");
		int size = scan.nextInt();
		String[] sArr = new String[size];
		System.out.println("Enter the elements");
		for(int i=0;i<=sArr.length-1;i++)
		{
			sArr[i] = scan.next();
		}
		System.out.println("Enter the movie Name");
		String s3 = scan.next();
		for(int i=0;i<=sArr.length-1;i++)
		{
			if(s3.contains(sArr[i]))
			{
				System.out.println(s3);
			}
			else
			{
				System.out.println("Not an Action movie");
			}
		}
	}

}
