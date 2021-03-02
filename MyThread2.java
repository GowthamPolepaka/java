package org.trainingDay8;

public class MyThread2 extends Thread
{
		public void run()
		{
			for(int i=17;i<=56;i++)
			{
				System.out.print(i+" ");
				System.out.println();
			}
			
		}	
}


