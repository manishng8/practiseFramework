package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement homePageTitle;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePage(String  expectedHomePageTitle) {
		// TODO Auto-generated method stub
		Assert.assertEquals(homePageTitle.getText(), expectedHomePageTitle);

		
	}
	
}
