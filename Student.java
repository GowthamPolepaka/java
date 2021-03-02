package org.trainingDay8;

import java.io.Serializable;

public class Student implements Serializable
{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks)
	{
		this.id = id;
		this.marks = marks;
		this.name = name;
		
	}
	public void display()
	{
		System.out.println("Student name");
		System.out.println("Student ID"+" "+id);
		System.out.println("Student marks"+" "+marks);
		
	}
}