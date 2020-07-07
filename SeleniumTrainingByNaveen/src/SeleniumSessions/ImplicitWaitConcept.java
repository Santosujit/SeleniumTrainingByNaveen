package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser

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
		// selenium will 40 seconds before giving us error, if the page is loaded
		// successfully in 2 seconds, then rest 38 seconds
		// will be ignored, so it is dynamic in nature
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// If the web page is loaded but some elements
																		// are not
		// still loaded, like to the Go button, then it will wait 30 seconds after which
		// selenium will give us time out error
		// if all the elements are loaded in 5 seconds, then rest 25 seconds will be
		// ignored, so it is dynamic in nature

		Thread.sleep(3000);// Hard Wait, not advisable to use this as script will wait for 3 seconds,
							// static in nature

		driver.quit();

	}

}
