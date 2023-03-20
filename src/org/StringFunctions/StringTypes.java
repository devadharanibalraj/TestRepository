package org.StringFunctions;


/* String Types:
 * Mutable - non-literal string
 * Immutable - literal string
 * _____________________________________
 * Immutable - literal string
 * Syntax: String refName = " ";
 * When we do:
 * Backend Operations:
 * duplicate values : it will share the memory
 * concatenation : it will create the new memory
 */

public class StringTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal string initialization - immutable string, literal string
		
		String object1 = "deva";
		String object4 = "deva";
		String object2 = "dharani";
		String Object3 = "devadharanibalraj";
		String Object5 = object1.concat(object2);
		
		//to find the memory - System.identityHashCode
		
		System.out.println(System.identityHashCode(object1));
		System.out.println(System.identityHashCode(object2));
		System.out.println(System.identityHashCode(Object3));
		System.out.println(System.identityHashCode(Object5));

	}

}
