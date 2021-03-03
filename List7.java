package org.trainingDay5;

import java.util.ArrayList;

public class List7 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(98);
		a1.add(77);
		a1.add(66);
		a1.add(34);
		System.out.println(a1);
		
		a1.remove(2);
		System.out.println(a1);
		
		a1.set(2, 90);
		System.out.println(a1);
		
		a1.clear();
		System.out.println(a1);
		
		
		
	}

}
