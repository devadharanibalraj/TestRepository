package org.ScannerClass_Constructor;
//Constructor using this keyword

public class Employee_Detail {
	public Employee_Detail() // Default Constructor
	{
		this("Matt","Leaf");
		System.out.println("Employee Details");
	}
	public Employee_Detail(String employee_First_Name, String employee_Last_Name) // Parameterized constructor
	{
		this(((byte) 12), 1234567890l);
		System.out.println("First Name:" + employee_First_Name);
		System.out.println("Last Name:" + employee_Last_Name);
	}
	public Employee_Detail(byte age, long mobile_Number) {
		this((short) 30000);
		System.out.println("Age:" + age);
		System.out.println("Mobile Number:" + mobile_Number);
	}
	public Employee_Detail(short salary)
	{
		System.out.println("salary:" + salary);
	}
	public static void main(String[] args) {

		Employee_Detail employee_Details = new Employee_Detail();
	}

}
