package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMDemo1 {
	@FindBy(name="q")//Annotation //google ke search box mai name=q
	private WebElement SEARCH;
	
	public POMDemo1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);//pagefactory is class
		//init element static method
	}
	public void search() {
		SEARCH.sendKeys("Selenium");
	}
	

}
