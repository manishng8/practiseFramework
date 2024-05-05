package stepDefinitions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import base.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;


public class RSA_Login_StepDef extends BaseClass{
	public LandingPage landingPage;
	public HomePage homePage;
	public BaseClass base;
	public Properties prop;
	WebDriver driver;
	
	
	public RSA_Login_StepDef()
	{
		this.driver = createDriver();
		
		prop= new Properties();
		try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/utility/stringList.properties");
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	@Given("^User have the rsa url$")
	public void userGaveTheRsaUrl() {

		landingPage = new LandingPage(this.driver);

		
	}
	
	@When("^User navigate to RSA url User can see login section$")
	public void userNavigateToRSAUrlUserCanSeeLoginSection() {
	    // Write code here that turns the phrase above into concrete actions
		landingPage = new LandingPage(this.driver);
		System.out.println("Landing Page Object Initialised");
		
		landingPage.navigateToURL();
		System.out.println("Navigated to RSA");
		
		landingPage.verifyLoginSection(prop.getProperty("login"));
	}
	
	@Then("^User enters valid email and password details$")
	public void userEntersValidEmailAndPasswordDetails(DataTable data) {
		List<List<String>> obj = data.asLists();
		landingPage.loginWithValidDetails(obj.get(1).get(0), obj.get(1).get(1));
		System.out.println("Entered valid username and password");

	}
	
	@Then("^User is able to navigate to the homepage$")
	public void user_is_able_to_navigate_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		homePage = new HomePage(this.driver);
		
		homePage.verifyHomePage(prop.getProperty("automation"));
		System.out.println("Program End");
	}
}
