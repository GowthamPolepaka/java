package org.trainingDay8;

public class Demo extends Thread
{
	@Override
	public void run()
	{
		this.walk();
	}
	public void walk()
	{
		String name = "Gowtham";
		int speed = 34;
		System.out.println("Gowtham walks at a speed of "+" "+speed);;
		
	}

}
