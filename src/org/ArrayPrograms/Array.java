package org.ArrayPrograms;

public class Array {
	
	public Array() { //default constructor
		
		int arr[] =  new int [5];
		
		arr[0] = 90;
		arr[1] = 100;
		arr[2] = 40;
		System.out.println(arr[1]);	
	}
	public Array(int a) {	
	  String employee_Details[] = new String [a];
	 employee_Details[0] = "Employee1";
	 employee_Details[1] = "Employee2";
	 System.out.println(employee_Details[1]); 
	}
     public void employee_Details() {
    	String employee_Name[]= {"Varshi", "Charvi", "Mega"};
    	for (int  i = 0; i<=2; i++) {
    		System.out.println(employee_Name[i]);
    	}
    	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array object = new Array();
		//object.array(5);
		Array object1 = new Array(5);
		Array object2 = new Array();
		object2.employee_Details();

	}

}
