package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange_HRM_Assign_Leave {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.manage().window().maximize();
		
		
		
driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Admin")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("somesh fate");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchSystemUser_userType")).click();
		
		Actions a= new Actions(driver);
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		
		a.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Somesh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("searchSystemUser_status")).click();
		
		a.sendKeys(Keys.ARROW_DOWN).build().perform();
		 
		a.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(2000);
		driver.findElement(By.id("searchBtn")).click();
	}


	}


