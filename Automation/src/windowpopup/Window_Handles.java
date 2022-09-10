package windowpopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Click Here")).click();
		 
		Set<String> a=driver.getWindowHandles();
		Iterator<String>b=a.iterator();
		b.next();
		String c=b.next();
		driver.switchTo().window(c);
		
		driver.findElement(By.name("emailid")).sendKeys("kanchan@12345gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Click Here")).click();
		

	}

}
