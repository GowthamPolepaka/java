package org.trainingDay4;

import java.io.FileReader;

public class Gowtham5 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader fr = new FileReader("D://eclipse/derby.txt");
			char[] a = new char[50];
			fr.read(a);
			for(char ch=0;ch<=a.length-1;ch++)
			{
				System.out.println(ch);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}
