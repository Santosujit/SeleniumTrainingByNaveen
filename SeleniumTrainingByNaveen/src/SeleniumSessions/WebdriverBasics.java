package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("http://google.com");// It will add the URL String title
		String title = driver.getTitle();
		System.out.println(title);

		// validation point

		if (title.equals("Google")) {
			System.out.println("correct title");
		}

		else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

		driver.quit();

		// FireFoxBrowser

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium_Training_By_Naveen\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver(); // This Line will launch the
		 * Firefox // for every Browser selenium people have given us a separate driver.
		 * // FirefoxDriver is a class which implements WebDriver Interface
		 * 
		 * driver.get("http://google.com");// It will add the URL String title = String
		 * title = driver.getTitle(); System.out.println(title);
		 */

		// IE Browser

		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 * WebDriver driver = new FirefoxDriver(); // for every Browser selenium people
		 * have given us a separate driver. // e.g // FirefoxDriver is a class which
		 * implements WebDriver Interface // This Line will launch the Firefox Browser
		 * 
		 * driver.get("http://google.com");// It will add the URL String title =
		 * driver.getTitle(); System.out.println(title);
		 */

	}

}
