package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {
	
	//Suppose an execution is going on in chrome, you don't want to disturb it, so you do testing using headless browser.
	//Mandatory Options:-
	//1-Chrome version should be greater than 60 on windows.
	//2-window-size=1400,800
	//Useful on Linux machines, or Jenkins. very very fast
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");//If you don't give this line of code, it will open in mobile browser size window
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://ui.freecrm.com/");// It will add the URL String title
		
		
		

	}



}
