package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_on_Youtube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("chrome://history/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"checkmark\"]")).click();
		driver.findElement(By.id("delete")).click();
		//Alert ale=driver.switchTo().alert();
		//ale.accept();
	}

}
