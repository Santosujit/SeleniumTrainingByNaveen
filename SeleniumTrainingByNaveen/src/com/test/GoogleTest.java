package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	//why  the entire program is not working.
   
	WebDriver driver;//Initialise the WebDriver. You can use this driver instance throughout the program
	
	//Follow good naming conventions. Name your Class adding Test Keyword
	
	@BeforeMethod
	public void setUp() {
		//Define the system property
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		//Launch my browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//maximise the window   
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Logo")
	public void googleLogoTest{
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
	}
	
	@Test(priority=3,groups="Test")
	public void test1{
		System.out.println("test1");
		
	}
	
	@Test(priority=4,groups="Test")
	public void test2{
		System.out.println("test2");
		
	}
	
	@Test(priority=5,groups="Test")//priority is a key word, so small letter
	public void test3{
		System.out.println("test3");
		
	}
	
	@AfterMethod
	public void tearDown{
		driver.quit();
	}
}
