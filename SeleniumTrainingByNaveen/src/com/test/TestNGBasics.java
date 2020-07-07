package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	//Annotation starts with @
	//Each and every annotation it should be associated with one method ().
	//why it is not Running
	//define diff pre conditions
	//TestNG class divided into three parts. Pre conditions, Test Case, and Post conditions.
	//Execution sequence of each and every annotation will be different
	//No of @Test annotation = No of Test Cases. You can create infinite no of test cases
	//Pre-conditions --- starting with @Before
	
	@BeforeSuite //--- Executed 1st
	public void setUp() {
		System.out.println("@BeforeSuite---set up system property for chrome");
	}
	
	@BeforeTest  //2 before TestNG class it will be executed
	public void launchBrowser() {
		System.out.println("@BeforeTest---launchBrowser");
	}
	
	@BeforeClass  //3 This will come from TestNG JAR Files after importing
	public void login() {
		System.out.println("@BeforeClass---Enter URL");
	}
	
	@BeforeMethod  //4
	public void enterURL() {
		System.out.println("@BeforeMethod---Log in");
	}	
	
	//Test case starting with annotation @Test
	
	@Test   //5
	public void googleTitileTest() {
		System.out.println("@Test--- Google Title Test");
	}
	@Test   
	public void searchTest() {
		System.out.println("@Test --- search Test");
	}
	
	@Test   
	public void googleLogoTest() {
		System.out.println("@Test --- googleLogoTest");
	}
	
	/*It will execute a pair (@BeforeMethod,@Test,@AfterMethod)
	 * Once all the Test Cases are done, then it will move to @AfterClass
	 * @BeforeMethod
	 * @Test1
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test2
	 * @AfterMethod
	 * 
	 *  @BeforeMethod
	 *  @Test3
	 *  @AfterMethod
	 *  
	 *  Randomly it will pick test case but pairing with the methods will be there
	 *  If we have 100 test case it will create 100 pairs*/
	
	//Post-conditions --- starting with @After annnotation
	
	@AfterMethod  //6
	public void logOut() {
		System.out.println("@AfterMethod---Log Out from app");
	}
	
	@AfterClass //7
	public void closeBrowser() {
		System.out.println("@AfterClass---Close Browser");
	}
	
	@AfterTest //8
	public void deleteAllCookies() {
		System.out.println("@AfterTest---deleteAllCookies");
	}
	
	/*@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite ---- generateTestReport");
		
		Confused on @AfterSuite
			
		}*/
	
	
	
	
}
