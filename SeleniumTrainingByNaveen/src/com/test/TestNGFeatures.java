package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	//why the entire program is not working

	@Test
	public void loginTest() {
		System.out.println("log in test");
		int i =9/0;
	}
	
	@Test(dependsOnMethods="loginTest")//HomePageTest is totally dependent upon loginTest. If loginTest fails, this HomePageTest will not be executed,skipped
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
}
