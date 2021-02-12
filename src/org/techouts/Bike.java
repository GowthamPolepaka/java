package org.techouts;

public class Bike 
{
	String bName;
	String bColor;
	double mileage;
	public Bike(double mileage)
	{
		this.bColor = "red";
		this.bName = "Royal Enfield";
		this.mileage = mileage;
		
	}
	public Bike(String bName)
	{
		this.bColor = "blue";
		this.mileage = 34.8;
		this.bName = bName;
	}

}
