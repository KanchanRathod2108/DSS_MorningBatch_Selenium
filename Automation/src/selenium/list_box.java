package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_box {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		WebElement a2=driver.findElement(By.id("fruits"));
		Select s=new Select(a2);
		s.selectByIndex(3);
		s.selectByValue("banana");
		s.selectByVisibleText("Orange");
	}

}
