package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("http://www.newtours.demoaut.com/");// It will add the URL String title
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("REGISTER")).click();
		// Locator --- linkText

		driver.findElement(By.name("firstName")).sendKeys("Santosujit");// Locator --- name
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mohanty");// Locator --- Relative xPath
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]"))
				.sendKeys("7809302346");

		driver.findElement(By.id("userName")).sendKeys("Santosh");// Locator --- id

		driver.findElement(By.name("address1")).sendKeys("S1/46 Niladri Vihar");
		driver.findElement(By.name("city")).sendKeys("Bhubaneswar");
		driver.findElement(By.name("state")).sendKeys("Orissa");
		driver.findElement(By.cssSelector(
				"table:nth-child(2) tbody:nth-child(1) tr:nth-child(11) td:nth-child(2) > input:nth-child(1)"))
				.sendKeys("751021");

		driver.findElement(By.id("email")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.name("password")).sendKeys("modirocs");
		driver.findElement(By.name("confirmPassword")).sendKeys("modirocs");
		driver.findElement(By.name("register")).click();
		driver.quit();

		// Priority is given to id first, if id is there use id locator
		// 2nd Priority is given to xpath, CSSSelector
		// 3rd Priority is given to name

	}

}
