package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		// Chrome Browser - Declared outside of the foor loop or else it will be called repeatedly

					System.setProperty("webdriver.chrome.driver",
							"C:\\Selenium_Training_By_Naveen\\Drivers\\chromedriver_win32\\chromedriver.exe");
					WebDriver driver = new ChromeDriver(); // for every Browser selenium people have given us a separate driver
															// ChromeDriver is a class which implements WebDriver Interface
															// This Line will launch the Chrome Browser

					driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fin.ebay.com%2F");// It will add the URL String title
		
		//To read data from Excel - Use XLs_Reader Utility Class which is already created by naveen - 
		//Create an object of this class and use its functions
		
		Xls_Reader reader = new Xls_Reader("C:\\Eclipse\\SeleniumTrainingByNaveen\\src\\com\\excel\\utility\\Xls_Reader.java");
		int rowCount = reader.getRowCount("RegTestData");//why it is not working
		
		//Add a column named Status to the Excel, pass or fail
		reader.addColumn("RegTestData", "Status");//why it is not working
		
		//Parametarization - It will register 5 customers in eBay
		
		//why it is not working
		
		for (int rowNum=2; rowNum<=rowCount; rowNum++) {
			
			//Read data one by one row
			
			String firstName=reader.getCellData("RegTestData", "firstname",2);
			System.out.println(firstName);
			
			String lastName=reader.getCellData("RegTestData", "lastname" ,2);
			System.out.println(firstName);
			
			String Email=reader.getCellData("RegTestData", "email",2);
			System.out.println(lastName);
			
			String Password=reader.getCellData("RegTestData", "password" , 2);
			System.out.println(Password);
			
			//Enter data one by one in the eBay webside
			
			driver.findElement(By.xpath("//input[@id='firstname']")).clear();//If you don't give this line of code, when for loop iterates it will concatenate first name	
			driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("firstName");
			
			driver.findElement(By.xpath("//input[@id='lastname']")).clear();
			driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("lastName");
			
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Email");
			
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).clear();
			driver.findElement(By.xpath("//input[@id='PASSWORD']")).sendKeys("Password");
			
			reader.setCellData("RegTestData", "Status", rowNum, "Pass");//why it is not working
			

}
	}
}

