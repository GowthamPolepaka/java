package org.training;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Num1");
		int num1 = scan.nextInt();
		System.out.println("enter num2");
		int num2 = scan.nextInt();
		System.out.println("Enter the operator");
		char op = scan.next().charAt(0);
		double ans;
		
		switch(op)
		{
		case '+' : ans = num1+num2;
		break;
		case '-' : ans = num1-num2;
		break;
		case '*' : ans  = num1*num2;
		break;
		case '/' : ans = num1/num2;
		break;
		default:System.out.println("Enter the correct operator");
		return;
		}
		System.out.println(num1+" "+op+" "+num2+" "+'='+" "+ans);
		
	}

}
