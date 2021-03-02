package org.trainingDay8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(45,"Gowtham",78.9);
		File f1 = new File("D:/Gowtham.txt");
		try 
		{
			f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(s1);
			s1.display();
			os.flush();
			os.close();
			fos.close();
		}
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}

}
