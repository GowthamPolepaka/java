package org.trainingDay8;

import java.io.Serializable;

public class Employee implements Serializable
{
	int empId;
	String empName;
	int salary;
	public Employee(int empId, String empName,int salary)
	{
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		
	}
	public void office()
	{
		System.out.println("The Name of the Employee"+" "+empName);
		System.out.println("The Id of the employee"+" "+empId);
		System.out.println("The Salary of the employee"+" "+salary);
	}

}
