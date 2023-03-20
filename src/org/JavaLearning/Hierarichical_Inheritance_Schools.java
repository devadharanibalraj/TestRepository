package org.JavaLearning;

//Hierarichical inheritance parent class

public class Hierarichical_Inheritance_Schools {
	
	public void classrooms() {
		 
		System.out.println("classrooms");
	}
	
	public void teachers() {
		System.out.println("teachers");
	}
	
	public void subjects() {
		
		System.out.println("subjects");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierarichical_Inheritance_Schools obj = new Hierarichical_Inheritance_Schools();
		obj.classrooms();
		obj.teachers();
		obj.subjects();
		
	}

}
