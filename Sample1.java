package org.trainingDay8;

public class Sample1 implements Runnable
{
	String threadName;
	public Sample1(String threadName)
	{
		this.threadName = threadName;
		System.out.println("Creating"+" "+threadName);
	}

	@Override
	public void run() 
	{
		System.out.println("Running.."+" "+threadName);
		try
		{
			for(int i=threadName.length()-1;i>=0;i--)
			{
				char ch = threadName.charAt(i);
				System.out.println(ch);
				Thread.sleep(500);
				Thread.onSpinWait();
			}
		}
		catch(Exception e)
		{
			System.out.println("Thread Name Interrupted");
		}
		this.jump();
		
	}
	
	public void jump()
	{
		int height = 89;
		System.out.println("Jumping"+" "+threadName+""+" "+"at the height of "+" "+height);
	}
	
	
	

}
