package org.techouts;

import java.util.Iterator;
import java.util.TreeSet;

public class Collections 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add("White");
		t1.add("red");
		t1.add("blue");
		t1.add("Yellow");
		
		Iterator i1 = t1.iterator();
		//while(i1.hasNext())
		//{
			Object o1 = i1.next();
			String s1 = (String)o1;
			System.out.println(s1);
			
		//}
			Object o2 = i1.next();
			String s2 = (String)o2;
			System.out.println(s2);
		
	}

}
