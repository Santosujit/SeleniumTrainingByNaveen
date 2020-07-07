package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//No Idea why it is not highlighting --- Query

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		System.out.println(driver.getTitle());

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Dynamic Wait

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// I want Log in button to be highlighted changing colours
		// It will change to some other colour, then return back to default colour for
		// no of times
		// To execute Javascript codes, we have a class in Selenium JavascriptExecutor

		WebElement LogInButton = driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));

		flash(LogInButton, driver);// highlight the element(LogInButton)
		drawBorder(LogInButton, driver);// draw a broder above LogInButton

		// Take screen shots

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copy file method
		FileUtils.copyFile(src, new File("E:\\SeleniumScreenshots\\element.png"));// why I am getting error in this line
		// generate Alert
		// generateAlert(driver, "There is a issue with the LogInButton");

		//click on element by JS Exeuctor		
		clickElementbyJS(LogInButton, driver);
		
		//refresh the page
		//1.by using selenium
		//2.by using Javascript
		driver.navigate().refresh();
		
		refreshBrowserByJS(driver);
		
		//to get the page title by JS
		
		System.out.println(getTitleByJS(driver));
		
		//to get inner text of a Page
		
		System.out.println(getPageInnerText(driver));
		
		//scroll page down
		
		scrollPageDown(driver);
		
		//scroll until forgot password id visible
		
		WebElement forgotpwd= driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		scrollIntoView(forgotpwd, driver);
		
		
		

		Thread.sleep(4000);
		driver.quit();

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);// we are type casting or converting our driver to
																// JavascriptExecutor class
		String bgcolour = element.getCssValue("backgroundcolour");// getCssValue will bring default colour of the
																	// element
		for (int i = 0; i < 100; i++) {
			changeColor("rgb(255,255,0)", element, driver);// every colour has unique rgb value
			changeColor(bgcolour, element, driver);// will change to default colour
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolour = '" + color + "'", element);

		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {

		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");// only pass one argument
	}

	public static void clickElementbyJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);// only pass one argument
	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");	//only pass one argument
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title=js.executeScript("return document.title;").toString();	//only pass one argument
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String PageText=js.executeScript("return document.documentElement.innerText;").toString();
		return PageText;
	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}



}
