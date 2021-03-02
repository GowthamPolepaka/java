package org.trainingDay8;

public class MyThreadMain 
{
	public static void main(String[] args)
	{
	 MyThread m1 = new MyThread();
	 MyThread2 m2 = new MyThread2();
	 m1.start();
	 m2.start();
	}
	

}
