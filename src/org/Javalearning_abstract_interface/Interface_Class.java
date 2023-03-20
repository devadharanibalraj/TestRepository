package org.Javalearning_abstract_interface;

//Interface accessed by class using implements keyword 

public class Interface_Class implements Book_fees,Van_fees {
	
		
	@Override
	public void student_Name(String name) {
		System.out.println("Student Name:"+ name);
	}

	@Override
	public void total_Van_Fees() {
		System.out.println("Total Van Fees:30000");
	}

	@Override
	public void amount_Paid() {
		// TODO Auto-generated method stub
		System.out.println("Amount Paid:20000");
	}

	@Override
	public void pending_Amount() {
		// TODO Auto-generated method stub
		System.out.println("Pending Amount:10000");
	}


	@Override
	public void student_Id() {
		// TODO Auto-generated method stub
		System.out.println("Student ID: 90");
	}

	@Override
	public void total_Book_Fees() {
		// TODO Auto-generated method stub
		
		System.out.println("Total Book Fees: 50000");
		
	}

	@Override
	public void paid_Book_Fees() {
		// TODO Auto-generated method stub
		System.out.println("Paid Book Fees: 20000");
	}

	@Override
	public void remaining_Book_Fees() {
		// TODO Auto-generated method stub
		System.out.println("Remaining Book Fees: 30000");
	}
	

	public static void main(String[] args) {
		
		Interface_Class obj = new Interface_Class();
		obj.student_Name("Varshini");
		obj.student_Id();
		obj.total_Van_Fees();
		obj.amount_Paid();
		obj.pending_Amount();
		obj.total_Book_Fees();
		obj.paid_Book_Fees();
		obj.remaining_Book_Fees();

	}

	

}
