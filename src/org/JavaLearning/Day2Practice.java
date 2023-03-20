package org.JavaLearning;

public class Day2Practice {

	public void class_Definition() {

		System.out.println("class:Combination of object and method");
	}

	public void method() {

		System.out.println("method: set of actions to be performed. Collections of statements within curly braces");

	}

	public void object() {

		System.out.println("object:helps to call method and it allocates memory");

	}

	public static void main(String[] args) {
		Day2Practice object = new Day2Practice();
		object.class_Definition();
		object.method();
		object.object();
		
		

	}

}