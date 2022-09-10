package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Element {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	     //Absolute xpath
	    
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Printed dress");
	    
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();

	}

}
