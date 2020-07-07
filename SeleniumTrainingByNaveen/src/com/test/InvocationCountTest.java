package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	//why the entire program is not working.
	@Test(invocationCount=10)//I want to execute this 10 times
	public void sum() {
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("sum is "+ c);
	}
}
