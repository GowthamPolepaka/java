package org.trainingDay5;

import java.util.ArrayList;

public class List1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(65);
		a1.add(77);
		a1.add(67);
		a1.add(90);
		a1.add(88);
		
		//Retrieving First Object...
		Object o1 = a1.get(0);
		Integer i1 = (Integer)o1;
		System.out.println(i1);
		
		//Retrieving Second Object...
		Object o2 = a1.get(1);
		Integer i2 = (Integer)o2;
		System.out.println(i2);
		
		//Retrieving Third Object...
		Object o3 = a1.get(2);
		Integer i3 = (Integer)o3;
		System.out.println(i3);
	}

}
