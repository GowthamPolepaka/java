package org.trainingDay5;

import java.util.ArrayList;

public class List5 
{
	public static void main(String[] args)
	{
		ArrayList<Comparable> a1 = new ArrayList<Comparable>();
		a1.add(67);
		a1.add("Gowtham");
		a1.add(8.5);
		a1.add('t');
		
		//System.out.println(a1);
		
		Object o1 = a1.get(0);
		Integer i1 = (Integer)o1;
		System.out.println(i1);
		
		Object o2 = a1.get(1);
		String s1 = (String)o2;
		System.out.println(s1);
		
		Object o3 = a1.get(2);
		Double d1 = (Double)o3;
		System.out.println(d1);
		
		Object o4 = a1.get(3);
		Character c1 = (Character)o4;
		System.out.println(c1);
	}

}
