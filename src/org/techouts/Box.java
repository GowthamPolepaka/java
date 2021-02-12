package org.techouts;

public class Box 
{
	int l;
	int w;
	int h;
	public Box(int l,int w)
	{
		this.l = l;
		this.w = w;
		
	}
	public Box(int l,int w,int h)
	{
		this(l,w);
		this.h = h;
		
	}
	public void dimensions()
	{
		System.out.println("The length of Box"+ l);
		System.out.println("The width of Box"+ w);
		System.out.println("The length of Box"+ h);
	}
}
