package com.java.Tshepi;

import java.util.Scanner;

public class Java_Basic_Concepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		String name = scan.nextLine();
		System.out.print("Anter Age : ");
		int age = scan.nextInt();
		System.out.print("Enter Gross Salary : ");
		double salary = scan.nextDouble();
		System.out.print("Enter Tax Rate (%) :");
		int tax = scan.nextInt();
		
		double netSalary = salary -(salary * tax/100 );
		System.out.print("Net Salary :" + netSalary);
		
	}

}
