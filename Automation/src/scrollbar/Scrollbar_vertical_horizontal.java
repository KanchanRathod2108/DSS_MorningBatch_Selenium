package scrollbar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar_vertical_horizontal {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
	    
	    WebDriver driver=new ChromeDriver();
	        
	    driver.get("https://gaana.com/radio/mirchiplay-mirchi-top-20");
	        
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    
	    JavascriptExecutor   j  =  (JavascriptExecutor)driver;

	    j.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(3000);

	    j.executeScript("window.scrollBy(0,-1000)");
		
	}

}
