package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String[] args) {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("http://www.newtours.demoaut.com/");// It will add the URL String title

		driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();	
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("modirocs");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		//To create custom XPath --- //html tag[@id,'value']
		//dynamic id
		//id = test_123
		//By.id("test_123")
		
		//ends-with
		//id - 123_test_123
		//id - 145678_test_123
		//id - 90_test_123
		
		//starts-with 
		//test_345
		//test_123
		//test_039
		
		//driver.findElement(By.xpath("//input[contains(@id,test_)]"));
		//driver.findElement(By.xpath("//input[starts-with(@id,test_)]"));
		//driver.findElement(By.xpath("//input[ends-with(@id,test_123)]"));
		
		//Links are always represented by a<> html tag
		//driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();

	}

}
