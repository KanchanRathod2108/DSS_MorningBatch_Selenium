package autosuggection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		    
		    driver.manage().window().maximize();
		    driver.findElement(By.name("q")).sendKeys("Redmi");
		    Thread.sleep(1000);
		  List<WebElement>k =driver.findElements(By.tagName("li"));
		    Actions a= new Actions(driver);
		    for(int i=0;i<7;i++) {
		    	a.sendKeys(Keys.ARROW_DOWN).build().perform();
		    	Thread.sleep(1000);
		    }
		    a.sendKeys(Keys.ENTER).build().perform();
	}

}
