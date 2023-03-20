package org.JavaLearning;

//Hierarichical inheritance child class2

public class Hierarichical_Inheritance_Higher_Secondary_Schools extends  Hierarichical_Inheritance_Schools {
	
	
	private void kidsToYouth() {
		
		System.out.println("KidsToYouth");		
	}
	
	private void upto_12th() {
		
		System.out.println("upto_12th");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hierarichical_Inheritance_Higher_Secondary_Schools obj = new Hierarichical_Inheritance_Higher_Secondary_Schools();
		obj.classrooms();
		obj.subjects();
		obj.kidsToYouth();
		obj.upto_12th();

	}

}
