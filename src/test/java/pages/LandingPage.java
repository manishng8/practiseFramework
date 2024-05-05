package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage {
	public WebDriver driver;
	
	
	@FindBy(xpath="//*[@class='login-title']")
	WebElement loginTitle;
	
	@FindBy(id="userEmail")
	WebElement email;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToURL(){
		driver.get("https://rahulshettyacademy.com/client/");
	}

	public void verifyLoginSection(String expectedLoginSectionHeading) {
		
		Assert.assertEquals(loginTitle.getText(), expectedLoginSectionHeading);
	}

	public void loginWithValidDetails(String userName, String password1) {
		// TODO Auto-generated method stub
		email.sendKeys(userName);
		password.sendKeys(password1);
		
		login.click();
		
	}

	
}
