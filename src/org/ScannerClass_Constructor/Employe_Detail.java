package org.ScannerClass_Constructor;

public class Employe_Detail {

	public Employe_Detail() // Default Constructor
	{
		System.out.println("Employee Details");
	}
	public Employe_Detail(String employee_First_Name, String employee_Last_Name) // Parameterized constructor
	{
		System.out.println("First Name:" + employee_First_Name);
		System.out.println("Last Name:" + employee_Last_Name);
	}
	public Employe_Detail(byte age, long mobile_Number) {
		System.out.println("Age:" + age);
		System.out.println("Mobile Number:" + mobile_Number);
	}
	public Employe_Detail(short salary)
	{
		System.out.println("salary:" + salary);
	}
	public static void main(String[] args) {

		Employe_Detail employee_Details = new Employe_Detail();
		Employe_Detail employee_Details1 = new Employe_Detail("Matt", "Leaf");
		Employe_Detail employee_Details2 = new Employe_Detail(((byte) 12), 1234567890l);
		Employe_Detail employee_Details3 = new Employe_Detail((short) 30000);

	}
}
