package org.trainingDay8;

public class MyThread extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		
	}

}
