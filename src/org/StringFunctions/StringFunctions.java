package org.StringFunctions;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "DEVA";
		String b = " Dhar ani ";
		String c = "devadharani";
		String d = "Devadharani";
		String e = "Devadharani";
		
		//int length = a.length(); to find no of characters in the given string - value based
		System.out.println(a.length());
		
		//boolean equals = a.equals(c); // to compare the two values and case sensitive
		System.out.println(a.equals(c));
		
		boolean equalsIgnoreCase = a.equalsIgnoreCase(c); // to compare the two values without
		//case sensitive
		System.out.println(equalsIgnoreCase);
		
		
		System.out.println(b.toUpperCase()); //to convert all the characters into uppercase
		System.out.println(c.toLowerCase()); //to convert all the characters into lowercase
		
		boolean startsWith = d.startsWith("e"); // to confirm that string starts with given character
		System.out.println(startsWith);
		
		boolean endsWith = b.endsWith("i"); // to confirm that string ends with given character
		System.out.println(endsWith);
		
	    String upperCase = c.toUpperCase(); // to convert the whole string in capital letters
	    System.out.println(upperCase);
	    
	    String lowerCase = a.toLowerCase(); // to convert the whole string in small letters
	    System.out.println(lowerCase);
	    
	    System.out.println("+++++++++++++++++");
	    
	    boolean contains = c.contains("dhi"); // to check that given data is present in the specific string
	    System.out.println(contains);
	    
	    char charAt = d.charAt(0); // to get the character in the specific index
	    System.out.println(charAt);
	    
	    c = c.replace("deVa","dharani"); //to replace the string 
	    System.out.println(c);
	    
	    String de = d.substring(2); // print the string from the given index
	    System.out.println(de);
	    
	    //when using the return type, new values can't be assigned to the same variable.
	    //when return type is not used, we can use assign the new values to the same variable.
	   
	    
	    d = d.substring(2,5); // print the string from the index 2 to index 5. First is start index
	   // and second is end index
	    
	   System.out.println(d);
	   
	 String trim = b.trim(); // truncate the blank space before the string and after the string
	 System.out.println(trim);
	 
	 String concat = a.concat(b); // to join the two strings
	 System.out.println(concat);
	 
	 System.out.println("++++++++++++++++++++++++++++++++++++");
	 
	 String name = "geeks for geeks for java";
	 //String[] - array of strings = stores the string value as an array.
	 String[] split = name.split("for");
	 //System.out.println(split[1]);
	 
	 for(String individual_Character:split) { // To print the array value of string
		 
		 System.out.println(individual_Character);
	 }
	 System.out.println("++++++++");
	 int indexOf = e.indexOf("a"); // to find out the first index value of the character
	 System.out.println(indexOf);
	 
	 int lastIndexOf = e.lastIndexOf("a"); //to find out the last index value of the character
	 System.out.println(lastIndexOf);
	 
	 boolean empty = c.isEmpty();
	 System.out.println(empty);
	 
	 boolean blank = c.isBlank();
     System.out.println(blank);
     
	 
	 
	 
	 
	 
	 
	
	 
	
	   
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
	}

}
