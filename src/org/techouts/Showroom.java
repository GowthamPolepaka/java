package org.techouts;

public class Showroom 
{
	public static void main(String[] args) 
	{
		Bike b1 = new Bike(34.5);
		Bike b2 = new Bike("Ktm");
		System.out.println(b1.bName);
		System.out.println(b1.bColor);
		System.out.println(b1.mileage);
		System.out.println(b2.bName);
		System.out.println(b2.bColor);
		System.out.println(b2.mileage);
		
	}

}
