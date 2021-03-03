package org.trainingDay5;

import java.util.Iterator;
import java.util.Vector;

public class Sample2 
{
	public static void main(String[] args) 
	{
		Vector<Object> v1 = new Vector<Object>();
		v1.add("Gowtham");
		v1.add("Telangana");
		v1.add("TamilNadu");
		v1.add("Hyderabad");
		
		//By using Iterator..
		Iterator<Object> i1 =  v1.iterator();
		
		Object o1 = i1.next();
		String s1 = (String)o1;
		System.out.println(s1);
		
		//By using Get
		Object o2 = v1.get(1);
		String s2 = (String)o2;
		System.out.println(s2);
		
	}

}
