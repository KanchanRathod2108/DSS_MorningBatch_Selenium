package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		WebElement s=driver.findElement(By.id("draggable"));
		WebElement d=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(s,d).build().perform();
		
	}	

}
