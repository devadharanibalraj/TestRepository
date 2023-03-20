package org.JavaLearning;

//Hierarichical inheritance child class1

public class Hierarichical_Inheritance_Primary_Schools extends Hierarichical_Inheritance_Schools {
	
	private void Kids() {
		
	     System.out.println("kids");
	}
	
	private void upto_5th() {
		System.out.println("Upto_5th");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hierarichical_Inheritance_Primary_Schools obj = new Hierarichical_Inheritance_Primary_Schools();
		obj.classrooms();
		obj.subjects();
		obj.teachers();
		obj.Kids();
		obj.upto_5th();
		
		
	}

}
