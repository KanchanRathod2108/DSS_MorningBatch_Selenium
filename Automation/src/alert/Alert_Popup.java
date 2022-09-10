package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("Kanchan");
		driver.findElement(By.name("submit")).click();
		Alert ale=driver.switchTo().alert();
		ale.accept();
		//ale.dismiss(); 
		//String ka=ale.getText();
		//System.out.println(ka);
		driver.quit();
		
		
		
		
		

	}

}
