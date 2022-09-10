package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		 
		POMDemo1 pom=new POMDemo1(driver);
		pom.search();
		
		Thread.sleep(1000);
		
		PomDemo2 pom2=new PomDemo2(driver);
		pom2.gmail();
	}

}
