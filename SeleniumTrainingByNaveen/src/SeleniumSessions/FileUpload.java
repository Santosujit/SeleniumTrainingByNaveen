package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("https://easyupload.io/");// It will add the URL String title

		// If you click on Browse or Upload button, then it will take you your local
		// drive (windoes pop up) which can't be
		// handled through selenium, so pass the local drive location values as
		// parameter

		driver.findElement(By.xpath("//form[@class='valign-wrapper']"))
				.sendKeys("C:\\Users\\Dell\\Downloads\\Suleman_ Resume.doc");

	}

}
