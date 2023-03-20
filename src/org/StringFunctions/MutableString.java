package org.StringFunctions;

/* Mutable string:
 * for duplicate value - it will create the memory
 * append - The memory will be shared s1.append(s2)
 * to concat the stringBuffer and stringBuilder, append function is used.
 * Two types of mutable string.
 * StringBuffer - StringBuffer refName = new StringBuffer("value");
 * StringBulider - StringBulider refName = new StringBuilder("value");
 * ________________________________________________
 * StringBuffer - Mutable,synchronized, one by one process, thread safe. but it is slow process.
 *                Stored inside the heap memory.
 * StringBulider -Mutable,Asynchronized, It is not thread safe, but it is fast process.
 *                Stored in the heap memory.
 * 
 * 
 */

//Mutable - shares the memory during append and replace, create new memory for duplicate values

public class MutableString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
           
		StringBuffer object1 = new StringBuffer("name");
		StringBuffer object2 = new StringBuffer("name1");
		StringBuffer object3 = new StringBuffer("name2");
		StringBuffer dup = new StringBuffer("name2");
		
		System.out.println(System.identityHashCode(object1));
		System.out.println(System.identityHashCode(object2));
		System.out.println(System.identityHashCode(object3));
		System.out.println(System.identityHashCode(dup));
		
		//append
		StringBuffer append = object1.append(object2);
		System.out.println(append);
		
		StringBuffer replace = object1.replace(1,1,"devadharani");
		System.out.println(replace);
		System.out.println(System.identityHashCode(replace));
		
		System.out.println(System.identityHashCode(append));
		
		System.out.println("+++++++++++++++++++++++++");
		
		StringBuilder object4 = new StringBuilder("name");
		StringBuilder object5 = new StringBuilder("name1");
		StringBuilder object6 = new StringBuilder("name2");
		StringBuilder dup1 = new StringBuilder("name2");
		
		System.out.println(System.identityHashCode(object4));
		System.out.println(System.identityHashCode(object5));
		System.out.println(System.identityHashCode(object6));
		System.out.println(System.identityHashCode(dup1));
		
		//append
		StringBuilder append1 = object4.append(object5);
		System.out.println(append1);
		

		StringBuilder replace1 = object4.replace(0,9,"devadharani");
		System.out.println(replace1);
		System.out.println(System.identityHashCode(replace1));
		
		System.out.println(System.identityHashCode(append1));
		
		
	}

}
