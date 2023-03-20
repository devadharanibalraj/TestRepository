package org.Javalearning_abstract_interface;

public class Abstract2 extends Abstract1{
	
	@Override
	public void abstract_Method(byte a, byte b) {
		
		System.out.println( a+b);
	}
	
	@Override
	public void non_Abstract_Method(byte x, byte y) {
		// TODO Auto-generated method stub
		super.non_Abstract_Method(x, y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstract2 obj = new Abstract2();
		obj.abstract_Method((byte)2,(byte)3);
		obj.non_Abstract_Method((byte)4,(byte)5);

	}

}
