package waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplictWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}

}
