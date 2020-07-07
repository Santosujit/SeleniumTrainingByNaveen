package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
	//Google changes their html code everyday so that nobody can automate.

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		// Dynamic Wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");// It will add the URL String title
		driver.findElement(By.name("q")).sendKeys("Java");
		// I want to select javatpoint, the second option
		// You have to create customised xPath, use findelements(), store the elements
		// in List, iterate the List

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant/::div[@class='sbl1']"));
		//Inside UL Tag, navigate to role property having listbox attribute, then there are many li are there
		//for every serach recommendation. Inside each li, many div are there, go the proper div with descendant
		
		System.out.println("Total No of suggestions in serach box::+list.size()");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			if (list.get(i).getText().contains("javatpoint")) {
				list.get(i).click();
				break;
			}

		}

	}

}