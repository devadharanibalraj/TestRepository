package org.JavaLearning;

//Hierarichical inheritance child class3

public class Hierarichical_Inheritance_CBSE extends Hierarichical_Inheritance_Schools {
	
	private void different_Syllabus() {
		
		System.out.println("Different Syllabus");
		
	}
	
	private void grade_System() {
		
		System.out.println("Grade System");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hierarichical_Inheritance_CBSE obj = new Hierarichical_Inheritance_CBSE();
		obj.classrooms();
		obj.teachers();
		obj.different_Syllabus();
		obj.grade_System();

	}

}
