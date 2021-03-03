package org.trainingDay5;

import java.util.ArrayList;

public class List6 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(98);
		a1.add(56);
		a1.add(66);
		a1.add(00);
		a1.add(45);
		a1.add(34);
		a1.add(76);
		System.out.println(a1);
		//Contains Method to check whether the Given element contains in the List or Not...
		boolean status = a1.contains(34);
		System.out.println(status);
		
		//isEmpty Method to check whether the Arraylist is empty or not...
		boolean value = a1.isEmpty();
		System.out.println(value);
		
		
		
	}

}
