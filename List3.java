package org.trainingDay5;

import java.util.ArrayList;

public class List3 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(56);
		a1.add(98);
		a1.add(87);
		a1.add(77);
		a1.add(55);
		a1.add(87);
		
		//Retrieving all objects one by one....
		for(int i=0;i<=a1.size()-1;i++)
		{
			Object o = a1.get(i);
			Integer i1 = (Integer)o;
			System.out.println(i1);
		}
		
		
	}

}
