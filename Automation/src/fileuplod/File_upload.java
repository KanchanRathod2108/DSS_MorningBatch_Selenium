package fileuplod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement an= driver.findElement(By.id("uploadfile_0"));
		
		an.sendKeys("C:/Users/Aakash/Documents");
		driver.findElement(By.name("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		

	}

}
