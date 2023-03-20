package org.JavaLearning;

//single inheritance child class

public class Single_Inheritance_Child extends Single_Inheritance_Parent {

	private void team1() {

		System.out.println("support team");
	}

	private void team2() {
		System.out.println("development team");
	}

	private void team3() {
		System.out.println("Testing team");
	}

	public static void main(String[] args) {

		Single_Inheritance_Child departments = new Single_Inheritance_Child();
		departments.floor1();
		departments.floor2();
		departments.team1();
		departments.team2();
		departments.team3();

	}

}
