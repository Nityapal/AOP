package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment() {
		
		//payment code
		System.out.println("amount debited..");
		//process
		System.out.println("amount credited..");
		
	}

}
