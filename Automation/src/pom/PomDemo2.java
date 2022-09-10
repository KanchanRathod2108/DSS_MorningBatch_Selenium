package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomDemo2 {
	@FindBy(linkText="Gmail")
	private WebElement GMAIL;
	
	public PomDemo2(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	}
	public void gmail()
	{
		GMAIL.click();
	}

}
