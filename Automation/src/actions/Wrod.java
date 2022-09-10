package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wetrade.org/exhibition/bf350a4e6d234379a9bc7785f8137495#");
		driver.findElement(By.id("reg-no")).sendKeys("1234567890");
		driver.findElement(By.className("email")).sendKeys("abc@123gmail.com");
		driver.findElement(By.className("submit")).click();
	}

}
