package org.techouts;

public class Circle 
{
	int r;
	static double pi = 3.14;
	public Circle()
	{
		this.r = 5;
		double area = pi*this.r*this.r;
		System.out.println("area of circle is"+ area);
	}
	public Circle(int r)
	{
		this.r = r;
	}
	

}
