package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("http://www.newtours.demoaut.com/");// It will add the URL String title
		driver.findElement(By.linkText("REGISTER")).click();

		// I want to select India in the Dropdown Box

		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");

	}

}
