package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//How to handle Javascript Alerts or Pop ups

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");// It will add the URL String title

		// If you press OK without giving ID or Password, it will give you a pop up, you
		// can't spy that javascript pop up

		driver.findElement(By.xpath("//input[@name='proceed']")).click();// It will click on the Go button

		// To come to the pop up window from the main window, we have to use Alert class
		// object

		Alert alert = driver.switchTo().alert();// This method is used to come to pop up window
												// Alert is a class

		String text = alert.getText();// It will bring the alert message

		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct alert message");
		} else {
			System.out.println("in-correct alert message");
		}

		Thread.sleep(3000);

		alert.accept();// It will click on the OK button

		// alert.dismiss();//It will cancel the pop up

		Thread.sleep(2000);

		driver.quit();

	}

}
