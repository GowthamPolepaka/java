package org.trainingDay5;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked3 
{
	public static void main(String[] args) 
	{
		LinkedList<Comparable> l1  = new LinkedList<Comparable>();
		l1.add(23);
		l1.add('G');
		l1.add("Gowtham");
		l1.add(6.7);
		
		Iterator<Comparable> i1 = l1.iterator();
		
		Object o1 = i1.next();
		Integer i2 = (Integer)o1;
		System.out.println(i2);
		
		Object o2 = i1.next();
		Character c1 = (Character)o2;
		System.out.println(c1);
		
		Object o3 = i1.next();
		String s1 = (String)o3;
		System.out.println(s1);
		
		Object o4 = i1.next();
		Double d1 = (Double)o4;
		System.out.println(d1);
		
	}
}
