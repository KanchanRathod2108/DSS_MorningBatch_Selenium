package datadriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_Driven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");

		    WebDriver driver=new ChromeDriver();

		    driver.get("https://www.facebook.com/");

		    driver.manage().window().maximize();

		    Thread.sleep(2000);
		
		
		FileInputStream excel=new FileInputStream("C:/Users/Aakash/Desktop/Book1.xlsx");
		
		 Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		 
		long b= (long) a.getRow(0).getCell(0).getNumericCellValue();
	    String c= a.getRow(1).getCell(0).getStringCellValue();

	    Thread.sleep(2000);

	    driver.findElement(By.name("email")).sendKeys(""+b);
	    driver.findElement(By.name("pass")).sendKeys(c);

	    Thread.sleep(2000);

	    driver.findElement(By.name("login")).click();

	}

}
