package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Using Customized xPath.
//Not able to click the checkbox in contact

public class DynamicWebTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://ui.freecrm.com/");// It will add the URL String title
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("freecrm$1");
		
		driver.findElement(By.xpath("//div[contains(text(),'Login') and @class='ui fluid large blue submit button']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		

		
		
		
		
	      

	}

}
