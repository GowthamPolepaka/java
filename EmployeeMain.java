package org.trainingDay8;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1553,"Gowtham",12000);
		File f1 = new File("D:/Polepaka");
		f1.mkdir();
		File f2 = new File("D:/Polepaka/Employee.txt");
		try 
		{
			f2.createNewFile();
			FileOutputStream fos = new FileOutputStream(f2);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(e1);
			e1.office();
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
