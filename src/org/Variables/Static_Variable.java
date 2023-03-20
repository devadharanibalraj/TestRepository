package org.Variables;

//static variable must be 

public class Static_Variable {
	
	static short amount = 10000;
	static byte id = 12;
	
	public static void static_method() {
		
		System.out.println(amount);
		System.out.println(id);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            static_method();
	}

}
