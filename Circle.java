package org.training;

public class Circle 
{
	int r;
	static double pi = 3.14;
	public Circle()
	{
		this.r = 5;
		
	}
	public Circle(int r)
	{
		this.r = r;
	}
	public void area()

	{
		double area = pi*this.r*this.r;
		System.out.println("Area of circle"+" "+area);
	}
}
