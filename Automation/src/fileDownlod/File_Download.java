package fileDownlod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.134/");
		    
		    driver.manage().window().maximize();
		    
		    Thread.sleep(2000);
		    
		    driver.findElement(By.linkText("chromedriver_win32.zip")).click();
		
	}

}
