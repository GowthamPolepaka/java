package org.trainingDay5;

import java.util.ArrayList;

public class List9 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(34);
		a1.add(56);
		a1.add(87);
		a1.add(75);
		a1.add(90);
		a1.add(33);
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		a1.add(2,34);
		System.out.println(a1);
		a1.remove(3);
		System.out.println(a1);
		
		
	}

}
