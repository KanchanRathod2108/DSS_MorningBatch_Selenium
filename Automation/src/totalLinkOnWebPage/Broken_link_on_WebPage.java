package totalLinkOnWebPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link_on_WebPage {

	private static final String url2 = null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are"+links.size());
		for(int i=0;i<links.size();i++) {
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			verifyLinkActive(url);
		}
	}
	private static void verifyLinkActive(String url) {
		{
			try {
				URL url2=new URL(url);
				HttpURLConnection
				httpURLConnect=(HttpURLConnection)url2.openConnection();
				httpURLConnect.connect();
				if(httpURLConnect.getResponseCode()==200) {
					System.out.println(url2+"-"+httpURLConnect.getResponseMessage());
				}
				if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(url2+"-"+HttpURLConnection.HTTP_NOT_FOUND);
					
				}
			}catch(Exception e) {
				
				
			}
		}
		
	}
	
		
	

}
