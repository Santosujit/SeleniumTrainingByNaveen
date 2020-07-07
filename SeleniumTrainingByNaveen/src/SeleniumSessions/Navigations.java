package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		// get() vs navigate().to()
		// Both are used to launch URLs but navigate().to() is used to launch external
		// URLs.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser
		driver.get("http://www.newtours.demoaut.com/");// It will add the URL String title

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		// Dynamic Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);// If the web page is slow, and taking time to
																			// get loaded

		driver.navigate().to("http://www.amazon.in");// It will navigate to the external URL of amazon.in
		// forward and back buttons are not web elements, you can't inspect them, they
		// are browser elements
		Thread.sleep(2000);
		driver.navigate().back();// It will go back to newtour website
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();// It will refresh the web page
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
