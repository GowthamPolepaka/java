package org.trainingDay5;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked2 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(89);
		l1.add(45);
		l1.add(98);
		l1.add(23);
		l1.add(35);
		
		Iterator<Integer> i1 = l1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			Integer i2 = (Integer)o1;
			System.out.println(i2);
		}
		
	}

}
