package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("https://freecrm.com/");// It will add the URL String title

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Freecrm$1");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Calendar')]")).click();

		// driver.switchTo().frame("mainframe"); If there are more than one frame then
		// use it. But This web page has only one frame.
		// Hierarchy is like this --- Browser -> WebPage -> Frame -> WebElements

	}

}
