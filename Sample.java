package org.trainingDay5;

import java.util.Vector;

public class Sample 
{
	public static void main(String[] args) 
	{
		Vector<Object> v1 = new Vector<Object>();
		v1.add(98);
		v1.add(45);
		v1.add(33);
		v1.add(24);
		v1.add(21);
		//System.out.println(v1);
		
		for(int i=0;i<=v1.size()-1;i++)
		{
			Object o1 = v1.get(i);
			Integer i1 = (Integer)o1;
			System.out.println(i1);
		}
		
	}

}
