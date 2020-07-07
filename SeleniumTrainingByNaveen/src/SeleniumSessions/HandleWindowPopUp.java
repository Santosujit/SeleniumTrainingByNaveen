package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
		// Javscript Pop Up vs Window Pop Up
		// Javascript pop up comes when you want to delete something, and a pop up comes
		// saying do you want to delete it
		// Javascript pop up you can't maximize, or minimize or close

		// where as window pop up are altogether different brwoser window having a
		// unique dynamic window id
		// window pop up have a URL, you can maximize, or minimize or close it
		
		//Pop Ups
		// 1.Javascript pop up ---Alert API (accept,dismiss)
		// 2. File upload pop up ---Browse/Attach Button ---(type=file, sendKeys(path))
		// 3. Browse Window pop up --- Advertisement pop up --- windowHandler API --- getWindowsHandles()

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser
		driver.get("http://www.popuptest.com/goodpopups.html");// It will add the URL String title

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.findElement(By.xpath("//a[@class='black']")).click();// To click on the Pop up
		Thread.sleep(2000);

		Set<String> handler = driver.getWindowHandles();// WindowHandler API is used to get window ID
		// getWindowHandles will return a Set object which will consist of strings
		// To get elements from Array or ArrayList you use for loop as elements are
		// stored based on indexes
		// but here in Set you have to use iterator
		// Iterator will point above the Set object
		// To point to the first element you have to use it.next() method
		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("Parent window Id" + parentWindowId);
		Thread.sleep(2000);

		String childWindowId = it.next();
		System.out.println("Child window Id" + childWindowId);
		Thread.sleep(2000);

		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		System.out.println("child window pop up title: " + driver.getTitle());
		driver.close();// it will close the child wiondow pop up, but if you use quit() then it will
						// close both the window

		driver.switchTo().window(parentWindowId);
		System.out.println("parent window title: " + driver.getTitle());

	}

}
