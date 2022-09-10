package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String>a=driver.getWindowHandles();
		Iterator<String> b=a.iterator();
		b.next();
		String c=b.next();
		driver.switchTo().window(c);
		driver.findElement(By.name("emailid")).sendKeys("kanchan@123gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		
		
		
	}

}
