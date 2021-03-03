package org.trainingDay5;

import java.util.ArrayList;

public class List4 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Gowtham");
		a1.add("Pranay");
		a1.add("Vikas");
		a1.add("Chanti");
		//System.out.println(a1);
		
		for(int i=0;i<=a1.size()-1;i++)
		{
			Object o1 = a1.get(i);
			String s1 = (String)o1;
			System.out.println(s1);
			
		}
		
		
		
	}

}
