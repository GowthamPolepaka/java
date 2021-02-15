package org.training;

public class Rectangle 
{
	int l;
	int b;
	public Rectangle()
	{
		this.l = 9;
		this.b = 5;
	}
	public Rectangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}
	public void perimeter()
	{
		int perimeter = 2*(this.l*this.b);
		System.out.println("perimeter of rectangle"+" "+perimeter);
	}

}
