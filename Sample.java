package org.trainingDay8;

public class Sample extends Thread
{
	int a ;
	int b ;
	public Sample()
	{
		this.a = 38;
		this.b = 23;
		
	}
	@Override
	public void run()
	{
		int c = a*b;
		System.out.println("The speed of Running"+" "+c);
		this.move();
	}
	public void move()
	{
		System.out.println("move");
	}
	

}
