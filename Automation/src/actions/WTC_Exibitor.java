package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTC_Exibitor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wetrade.org/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("View Details")).click();
		driver.findElement(By.linkText("Exhibition")).click();
		driver.findElement(By.className("login_button")).click();
		driver.findElement(By.xpath("//input[@id='reg-no']")).sendKeys("4234567890");
		driver.findElement(By.xpath("//input[@id='email-id']")).sendKeys("ab@123gmail.com");
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[4]/button[1]")).click();
		
		
	}

}
