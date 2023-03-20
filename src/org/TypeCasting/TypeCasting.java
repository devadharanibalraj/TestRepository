package org.TypeCasting;
public class TypeCasting {
	public static void main(String[] args) {
		//Widening Type casting - Low memory to High Memory
		byte amount = 121;
		float value1 = amount;
		short amount1 = amount;
		int amount2 = amount1;
		long amount3 = amount2;
		float value2 = amount3;
		double amount6 = amount2;
		//System.out.println(amount1);
		//System.out.println(amount2);
		System.out.println(amount3);
		System.out.println(amount6);
		System.out.println(value1);
		System.out.println(value2);
		char a = 'a';
		int b = a;
		System.out.println(b);
		//narrowing Type casting - High memory to low memory
		System.out.println("==========================================");
		//long amount2 = 190909098981l;
		int amount4 = (int)amount3;
		byte amount5 = (byte)amount4;
		//int c = 97;
		//char p = (char)c;
		//System.out.println("char"+c);
		System.out.println(amount4);
		System.out.println(amount5);
		long mobile_Number = 9123456789l;
		float mobile_Number1 = (float)mobile_Number;
		System.out.println(mobile_Number1);
	}
}
