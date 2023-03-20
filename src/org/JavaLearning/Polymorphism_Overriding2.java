package org.JavaLearning;

public class Polymorphism_Overriding2 extends Polymorphism_Overriding1 {
	

 public void name() {
	 
	 super.name();
	}
 
 
 public void mobile_number(long mobile_Number, String city, short member_Id) {
	 
	 super.mobile_Number(mobile_Number,city,member_Id);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism_Overriding2 obj = new Polymorphism_Overriding2();
		obj.name();
		obj.mobile_Number(9801234567l, "portland", ((short)20000));

	}

}
