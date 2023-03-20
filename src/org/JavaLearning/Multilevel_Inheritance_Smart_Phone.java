package org.JavaLearning;

//multilevel inheritance child class 2

public class Multilevel_Inheritance_Smart_Phone extends Multilevel_Inheritance_Button_Phone {

	private void internet() {

		System.out.println("Internet");

	}

	private void video_Call() {

		System.out.println("Video_Call");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multilevel_Inheritance_Smart_Phone mobileFeatures = new Multilevel_Inheritance_Smart_Phone();
		mobileFeatures.call();
		mobileFeatures.sms();
		mobileFeatures.games();
		mobileFeatures.internet();
		mobileFeatures.video_Call();
	}

}
