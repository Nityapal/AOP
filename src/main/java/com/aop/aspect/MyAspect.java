package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	public void printbefore() {
		System.out.println("payment started..");
	}
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	public void printafter() {
		System.out.println("payment done..");
	}

}
