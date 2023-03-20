package org.JavaLearning;

//multilevel inheritance child class1

public class Multilevel_Inheritance_Button_Phone extends Multilevel_Inheritance_Phone {

	public void sms() {

		System.out.println("sms");

	}

	public void games() {

		System.out.println("games");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multilevel_Inheritance_Button_Phone mobile_features = new Multilevel_Inheritance_Button_Phone();
		mobile_features.call();
		mobile_features.sms();
		mobile_features.games();
		
	}

}
