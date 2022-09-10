package totalLinkOnWebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_link_on_Web_Page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>ab=driver.findElements(By.tagName("a"));
		for(int i=0;i<ab.size();i++)
		{
			String k=ab.get(i).getText();
			System.out.println(k);
			Thread.sleep(1000);
		}
				
	}

}
