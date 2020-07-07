package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

//No Idea why it is failing---Query

public class HTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// HTMLUnit Driver is not available after Selenium 3.0. So you have to download
		// the JAR file separately
		// HTMLUnit Driver is very fast, execution of test cases is very fast
		// Browser does not get launched
		// Headless Browser or Ghost Driver
		// HTMLUnit Driver---with java
		// PhantonJS--- Javascript
		// Not suitable for User Actions ---Mouse movement, drag and drop, double click
		// Suitable for smoke and sanity testing

		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://freecrm.co.in/");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Dynamic Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("freecrm$1");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.quit();

	}

}
