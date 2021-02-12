package org.techouts;

import java.util.ArrayList;

public class List2 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(89);
		a1.add(59);
		a1.add(23);
		a1.add(90);
		a1.add(67);
		
		Object o1 = a1.get(2);
		Integer i1 = (Integer)o1;
		System.out.println(i1);
		
		Object o2 = a1.get(4);
		Integer i2 = (Integer)o2;
		System.out.println(i2);
		
		for(int i=0;i<=a1.size()-1;i++)
		{
			Object o3 = a1.get(i);
			Integer i3 = (Integer)o3;
			System.out.print(i3);
		}
	}

}
