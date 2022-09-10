package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement a =driver.findElement(By.id("uploadfile_0"));
		a.sendKeys("C:/Users/Aakash/Pictures/ Amezon.bmp");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();
		
	}

}
