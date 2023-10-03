package com.paymoney.maindriver;

import com.paymoney.service.Paymoney_service;

public class Paymoney_maindriver {

	public static void main(String[] args) {
		
		// creating object for Service class
		
		Paymoney_service object = new Paymoney_service();
		
		// calling methods from Service class 
		
		object.arraydetails();
		object.targetcalculations();

	}

}
