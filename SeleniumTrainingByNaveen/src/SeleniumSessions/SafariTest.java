package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new SafariDriver();//SafariDriver is a class implementing WebDriver interface.
											//All the methods in WebDriver Interface you have to define inside SafariDriver class
											//But Selenium people have already done it, and given us in form of JAR files.
		
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.wait(3000);
		driver.quit();
		

	}

}
