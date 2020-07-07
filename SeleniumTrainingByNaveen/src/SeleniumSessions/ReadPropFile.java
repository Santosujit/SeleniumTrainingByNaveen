package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//It's kind of Data Driven Framework. We are driving data from the property file into the Code.
//getProperty() method inside Properties class is used to read test data and object repository from property file

public class ReadPropFile {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties prop = new Properties();// Properties is a class available in java.util used to read property file
		// FileInputStream is used to establich a stream(connection) between java code
		// and property file
		FileInputStream ip = new FileInputStream(
				"\\C:\\Eclipse\\SeleniumTrainingByNaveen\\src\\SeleniumSessions\\config.properties");
		prop.load(ip);

		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");
		System.out.println(url);
		String browser_name = prop.getProperty("browser");
		System.out.println(browser_name);

		if (browser_name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser_name.equals("FF")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium_Training_By_Naveen\\Drivers\\geckodriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser_name.equals("IE")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium_Training_By_Naveen\\Drivers\\geckodriver_win32\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.xpath(prop.getProperty("surname_xpath"))).sendKeys(prop.getProperty("surname"));
		driver.findElement(By.xpath(prop.getProperty("email_xpath"))).sendKeys(prop.getProperty("email"));
		;

		Thread.sleep(3000);

		driver.quit();

	}

}
