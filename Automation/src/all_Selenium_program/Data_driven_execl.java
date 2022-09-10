package all_Selenium_program;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_driven_execl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		  driver.manage().window().maximize();
		   // for excel data
		  
		  FileInputStream execl= new  FileInputStream("C:/Users/Aakash/Desktop/Amzon.xlsx");
		   Sheet a = WorkbookFactory.create(execl).getSheet("Sheet1");
		    long b =(long) a.getRow(4).getCell(0).getNumericCellValue();
		    String c= a.getRow(5).getCell(0).getStringCellValue();
		    
		    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(" "+b);
		    driver.findElement(By.xpath("//input[@id='continue']")).click();
		    driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(c);
		    driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		    
	
	}

}
