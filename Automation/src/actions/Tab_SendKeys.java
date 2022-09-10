package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_SendKeys {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		    
		    WebDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.facebook.com/");
		    
		    driver.manage().window().maximize();
		    
		    Thread.sleep(2000);
		    
		    
		    
		    
		    Actions a = new Actions(driver);
		    a.sendKeys(Keys.TAB).build().perform();
	}

}
