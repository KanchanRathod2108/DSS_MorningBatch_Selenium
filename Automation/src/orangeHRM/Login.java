package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Dashboard')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Assign Leave')]")).click();
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Kanchan Rathod");
		WebElement a=driver.findElement(By.id("assignleave_txtLeaveType"));
		a.click();
		Actions k=new Actions(driver);
		for(int i=0;i<4;i++) {
			k.sendKeys(Keys.ARROW_DOWN).build().perform();
				}
		k.sendKeys(Keys.ENTER).build().perform();
		WebElement b=driver.findElement(By.id("assignleave_txtFromDate"));
		b.click();
		String month="Aug 2022";
		while(true) {
			String text=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).getText();
			if(text.equals(month)) {
				break;
			}
		
		else 
		{
			driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/div[1]/div[1]/select[1]")).click();
		}
			Actions j= new Actions(driver);
			for(int i=0;i<8;i++) {
				j.sendKeys(Keys.ARROW_DOWN).build().perform();
			}
			j.sendKeys(Keys.TAB).build().perform();
			
			
			
			driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'30')]")).click();
		}
	}
}
			
		
		   
		
	         
	        


	

