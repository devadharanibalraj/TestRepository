package org.StringFunctions;
public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("******LiteralString********");
	//for duplicate(same) values literal string shares the memory
//stores in the string constant pool - which is inside the heap memory
		String name = "deva";
		String name1 = "deva";
		String a = "dharani";
		System.out.println(name+System.identityHashCode(name));
		System.out.println(name1+System.identityHashCode(name1));
		if(name == name1) { //comparing the memory locations
			
			System.out.println("True");	
		}
	
		else {
			System.out.println("False");
		}
		
		name = name.concat(a);// during concatenation, value is stored in different memory
		System.out.println("After Concatenation");
		System.out.println(name+System.identityHashCode(name));
		System.out.println("After replace");
		name = name.replace("devadharani", "Logu");
		System.out.println(name+System.identityHashCode(name));
		System.out.println("******StringObject*******");

	String name3 = new String("deva");//whenever we use new, it allocates the different memory
	String name4 = new String("deva");
	String b = new String("dharani");
	System.out.println(name3+System.identityHashCode(name3));
	System.out.println(name4+System.identityHashCode(name4));
	// for duplicate(same) values StringObject creates the memory
			// stores in the heap memory
	
	if(name3 == name4) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	if(name.equals(name1)) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
    if(name3.equals(name4)) {
    	System.out.println("True");
    }
    else {
    	System.out.println("False");
    }
    name3 = name3.concat(b);
    System.out.println("After Concatenation");
    //System.out.println(name3.concat(name4));3
    System.out.println(name3+System.identityHashCode(name3));
    name3 = name3.replace("devadharani","Logu");
    System.out.println("After Replace");
    System.out.println(name3+System.identityHashCode(name3));
    System.out.println("Immutable string - duplicate values stored in the same memory, concat and replaced value stored in the different memory");
    System.out.println("String Object in Immutable String - all values stored in different memory, even duplicate values stored in different memory");
}
}

