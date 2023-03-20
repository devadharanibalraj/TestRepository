package org.ScannerClass_Constructor;
//scanner
import java.util.Scanner;

public class Employee_Details {

	public static void main(String[] args) {
		Scanner employee_Details = new Scanner(System.in);
		System.out.println("Enter Name, Years of Experience, Mobile Number");
		String name = employee_Details.next();
		byte experience = employee_Details.nextByte();
		long mobileNumber = employee_Details.nextLong();
		System.out.println();
		System.out.println("Enter Monthly Salary, Annual Salary");
		short monthly_Salary = employee_Details.nextShort();
		int annual_Salary = employee_Details.nextInt();
		System.out.println();
		System.out.println("Are you an Experienced Person? Type True/False");
		boolean statement = employee_Details.nextBoolean();
		System.out.println();
		System.out.println("CGPA, ID Number");
		float cgpa = employee_Details.nextFloat();
		double id = employee_Details.nextDouble();
		System.out.println("Employee Name" + name);
		System.out.println("Years of Experience" + experience);
		System.out.println("Mobile Number" + mobileNumber);
		System.out.println("Monthly Salary" + monthly_Salary);
		System.out.println("Annual Salary" + annual_Salary);
		System.out.println("Experienced Person:" + statement);
		System.out.println("CGPA" + cgpa);
		System.out.println("ID" + id);
		employee_Details.close();

	}
}
