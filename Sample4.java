package org.trainingDay5;

import java.util.Vector;

public class Sample4 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(45);
		v1.add(65);
		v1.add(33);
		v1.add(89);
		
		System.out.println(v1);
		System.out.println(v1.size());
		v1.addElement(56);
		System.out.println(v1);
		v1.remove(3);
		System.out.println(v1);
		v1.add(2, 100);
		System.out.println(v1);
	}

}
