package org.JavaLearning;

public class polymorphism_overloading {

	private void fees() {

		System.out.println("Fee Structure");
	}

	private void total_fees(short total_fees) {

		System.out.println("Total Fees:" + total_fees);

	}

	private void book_fees(String name, short amount, short pending_amount) {

		System.out.println("Student Name:" + name);
		System.out.println("Amount Paid:" + amount);
		System.out.println("Remaining amount:" + pending_amount);

	}

	private void book_fees(short pending_amount, short amount, String name) {

		System.out.println("Student Name:" + name);
		System.out.println("Amount Paid:" + amount);
		System.out.println("Remaining amount:" + pending_amount);

	}

	private void book_fees(short pending_amount, short amount, String name, long phoneNumber) {

		System.out.println("Student Name:" + name);
		System.out.println("Amount Paid:" + amount);
		System.out.println("Pending Amount:" + pending_amount);
		System.out.println("Phone Number:" + phoneNumber);
	}

	private void van_fees(byte sno, int member_Id, short paid_fees, char variable) {
		System.out.println("S.No" + sno);
		System.out.println("Member Id" + member_Id);
		System.out.println("Amount Paid" + paid_fees);
		System.out.println("Variable" + variable);
	}

	private void van_fees(long mobile_Number) {

		System.out.println(mobile_Number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		polymorphism_overloading obj = new polymorphism_overloading();
		obj.fees();
		obj.total_fees((short) 30000);
		obj.book_fees("Swetha", ((short) 15000), ((short) 15000));
		obj.book_fees(((short) 20000), ((short) 10000), "Dharshi");
		obj.book_fees(((short) 20000), ((short) 10000), "Dharshi", 9712345690l);
		obj.van_fees(((byte) 2), 219078237, ((short) 17000), 'q');
		obj.van_fees(1234567890l);
	}

}
