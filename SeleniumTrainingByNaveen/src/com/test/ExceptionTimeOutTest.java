package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
	
	@Test(invocationTimeOut=30000,expectedExceptions =NumberFormatException.class)//This test cases should be executed in 30 seconds, otherwise it should be terminated.Useful to avoid infinite loop situation
	//Please I am expecting this exception, don't fail them
	public void infiniteLoopTest() {
		int i=1;
		while(i==1) {
			System.out.println(i);
		}
	}
}
