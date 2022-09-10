package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/Desktop/Selenium/chromedriver_win32 (1)/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File d=new File("C:/Users/Aakash/Desktop/Screenshot/New Bitmap Image.bmp");
		FileUtils.copyFile(s, d);
	}

}
