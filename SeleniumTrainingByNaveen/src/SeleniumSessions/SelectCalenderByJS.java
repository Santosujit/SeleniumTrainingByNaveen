package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class SelectCalenderByJS {

	public static void main(String[] args) {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://www.spicejet.com/default.aspx");// It will add the URL String title

	}

	// create a utility method

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal) {
		// on which element you want to perform the action, pass that WebElement.

		JavaScriptExecutor js = ((JavaScriptExecutor) driver);// cast your driver to javascriptExecutor

	}
}
