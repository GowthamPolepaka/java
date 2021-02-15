package org.training;

public class Sample 
{
	static double pi = 3.14;
	int a;
	int b;
	public Sample()
	{
		this.a = 34;
		this.b = 56;
	}
	public void method()
	{
		int v = 99;
		double k = this.a*this.b*pi;
		System.out.println(v*k);
		
	}
	public void method2()
	{
		System.out.println(a*b+pi);
	}

}
