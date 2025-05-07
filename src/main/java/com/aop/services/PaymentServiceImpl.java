package com.aop.services;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public void makePayment(int amt) {
		
		//payment code
		System.out.println(amt+ " amount debited..");
		//process
		System.out.println(amt+ " amount credited..");
		
	}

}
