package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_switchTo_another_Frame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		Thread.sleep(1000);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		Thread.sleep(2000);
		driver.findElement(By.linkText("By.Remotable")).click();
		
		
	}
	

}
