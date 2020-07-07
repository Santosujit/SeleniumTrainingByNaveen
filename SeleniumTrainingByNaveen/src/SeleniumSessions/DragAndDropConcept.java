package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://jqueryui.com/droppable/");// It will add the URL String title

		driver.switchTo().frame(0);// It will switch the control from web page to the zeroth frame

		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();

	}

}
