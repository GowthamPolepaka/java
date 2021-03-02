package org.trainingDay8;

import java.io.File;
import java.io.IOException;

public class Demo1 
{
	public static void main(String[] args) 
	{
		File f1 = new File("D:/FileStorage");
		boolean data = f1.mkdir();
		File f2 = new File("D:/FileStorage/Data.txt");
		try 
		{
			f2.createNewFile();
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
