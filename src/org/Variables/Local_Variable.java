package org.Variables;

//Local variable must be inside the method
//its lifecycle only be throughout the method
//we must initialize the local variable
// We can declare the local variable

public class Local_Variable {
	
	public void Local_variable() {
		
		boolean /* local variable */ condition = true; // Intialization
		System.out.println(condition);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Local_Variable statement = new Local_Variable();
                statement.Local_variable();
                
	}

}
