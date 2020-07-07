package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

//Please help. Not able to do.

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {

		// Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
												// ChromeDriver is a class which implements WebDriver Interface
												// This Line will launch the Chrome Browser

		driver.manage().window().maximize();// To maximize the window
		driver.manage().deleteAllCookies();// every time you refresh all the cookies will be deleted

		driver.get("https://freecrm.co.in/");// It will add the URL String title

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("w.mohanty@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("freecrm$1");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();//This step is not happening.
		
		//Method 1 ASK Why It is not workoing
		
		//Absolute xPaths of different rows.
		//tr stands for row no, and td stands for column no. row no changing, column no being same.
		
		 
		// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]		  
		// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]
		// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]
		// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[4]/td[2]
		// /html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[2]
				
		/*
		 * String before_xpath =
		 * "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		 * String after_xpath = "]/td[2]";
		 * 
		 * for(int i=1;i<=5;i++) { String name =
		 * driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
		 * System.out.println(name);
		 * 
		 * //I want Ashok Kumar Mohanty check box to be checked
		 * ///html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1
		 * ]/tr[2]/td[2]
		 * 
		 * //if (name.contains("Ashok Kumar Mohanty")){ driver.findElement(By.
		 * xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[+ i + ]/td[2] "
		 * )).click();; }
		 */
		
		//Method 2 By using Customized X Path
		
		

	}
}
