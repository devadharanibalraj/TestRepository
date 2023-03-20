package org.JavaLearning;

public class Polymorphism_Overriding1 {

	
public void name() {
		
		System.out.println("Harish");
	}
	public void mobile_Number(long mobile_Number, String city, short member_Id) {

		System.out.println(mobile_Number);	
		System.out.println(city);
			System.out.println(member_Id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism_Overriding1 obj = new Polymorphism_Overriding1();
		obj.name();
		obj.mobile_Number(9812345678l, "Orlando", ((short)20000));
		
	}

}




