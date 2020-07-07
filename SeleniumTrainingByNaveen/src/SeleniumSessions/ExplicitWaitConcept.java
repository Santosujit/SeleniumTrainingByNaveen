package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		// Explicit wait is used when for e.g Log in button is not visible or
		// clickable immediately, so selenium will throw an error, but if we use
		// explicit wait for a particular element like log in
		// button, it will wait for 20 seconds for the log in button to be visible and
		// clickable, if 20 seconds passes,
		// and log in button is not clickable then only it will throw error

		// if you give explicit wait for 20 seconds, but log in button is visible in 2
		// seocnds
		// then rest 18 seconds will be ignored, it is dynamic in nature

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser
		driver.get("http://www.facebook.com/");// It will add the URL String title

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

		clickON(driver, driver.findElement(By.xpath("//input[@id='u_0_4']")), 20);
		clickON(driver, driver.findElement(By.xpath("//a[@class='_8esh']")), 10);

		driver.quit();

	}

	// declare a static method and pass three parameters
	// create an object of WebDriverWait class which is available in selenium
	public static void clickON(WebDriver driver, WebElement locator, int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
