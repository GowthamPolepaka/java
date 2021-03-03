package org.trainingDay5;

import java.util.Iterator;
import java.util.Vector;

public class Sample3 
{
	public static void main(String[] args) 
	{
		Vector<Comparable> v1 = new Vector<Comparable>();
		v1.add(23);
		v1.add(56);
		v1.add(9.3);
		v1.add("Chakra");
		v1.add(false);
		
		Iterator i1 = v1.iterator();
		
		Object o1 = i1.next();
		Integer i2 = (Integer)o1;
		System.out.println(i2);
		
		Object o2 = i1.next();
		Integer i3 = (Integer)o2;
		System.out.println(i3);
		
		Object o3 = i1.next();
		Double d1 = (Double)o3;
		System.out.println(d1);
		
		Object o4 = i1.next();
		String s1 = (String)o4;
		System.out.println(s1);
		
		Object o5 = i1.next();
		Boolean b1 = (Boolean)o5;
		System.out.println(b1);
	}

}
