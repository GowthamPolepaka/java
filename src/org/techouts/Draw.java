package org.techouts;

public class Draw 
{
	public static void main(String[] args) 
	{
		Circle c1 = new Circle();
		Circle c2 = new Circle(7);
		Circle c3 = new Circle(8);
		
		Rectangle r3 = new Rectangle();
		System.out.println(c1.r);
		System.out.println(c2.r);
		System.out.println(c3.r);
		System.out.println(r3.l);
		System.out.println(r3.b);
		System.out.println(r3.h);
		
		
	}

}
