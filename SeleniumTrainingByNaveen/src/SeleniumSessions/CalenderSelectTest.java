package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://www.timeanddate.com/calendar/");// It will add the URL String title

		String dateCountry = "05-January-2006-United States";
		// split the date, month, and year.
		String dateCountryArr[] = dateCountry.split("-");
		// split() function will retuen one array.
		// The array will be like the following {05,February,2020,United States}

		String day = dateCountryArr[0];
		String month = dateCountryArr[1];
		String year = dateCountryArr[2];
		String country = dateCountryArr[3];

		// Use the dropdown by using select class.

		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText(month);

		Select select1 = new Select(driver.findElement(By.xpath("//input[@id='year']")));
		select1.selectByVisibleText(year);

		Select select2 = new Select(driver.findElement(By.xpath("//input[@id='year']")));
		select2.selectByVisibleText(year);

		Select select3 = new Select(driver.findElement(By.xpath("//select[@id='country']")));
		select3.selectByVisibleText(country);

		driver.findElement(By.xpath("//body//input[6]")).click();

	}

}
