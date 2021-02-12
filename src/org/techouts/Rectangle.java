package org.techouts;

public class Rectangle 
{
	int l;
	int b;
	int h;
	public Rectangle()
	{
		this.l = 6;
		this.l = 5;
		this.l = 8;
		int perimeter = this.l*this.b*this.h;
		System.out.println("The perimeter of rectangle"+ perimeter );
	}
	public Rectangle(int l,int b)
	{
		this.l = l;
		this.b = b;
	}

}
