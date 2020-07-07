package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		// when we want to find how many links are there inside a webpage
		// or how many input fields, or no of buttons inside a web page, then we use
		// FindElements method
		// If we want to get the link name or text we have to use tagName method

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("http://www.newtours.demoaut.com/");// It will add the URL String title

		List<WebElement> linkList = driver.findElements(By.tagName("a"));// It will give no of links in the web page

		// size of linkList
		System.out.println(linkList.size());

		// To print all the values in the linkList we use for loop

		for (int i = 0; i < linkList.size(); i++) {
			String linkTest = linkList.get(i).getText();
			System.out.println(linkTest);
		}

		// List <WebElement> inputFields = driver.findElements(By.tagName("input"));//It
		// will give no of input fields in the web page
		// List <WebElement> Buttons = driver.findElements(By.tagName("button"));//It
		// will give no of input fields in the web page
	}

}
