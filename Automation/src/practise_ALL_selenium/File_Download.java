package practise_ALL_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.134/");
		driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		

	}

}
