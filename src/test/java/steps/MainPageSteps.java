package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;
import util.BrowserFactory;

public class MainPageSteps extends BaseStep {

	WebDriver driver;
	MainPage main;
	String expectedTitle;

	@Before
	public void setup() {

		driver = GetDriver();
		main = PageFactory.initElements(driver, MainPage.class);
		
	}

	@Given("^the user is on the website page$")
	public void the_user_is_on_the_website_page() {
		driver.get("http://automationpractice.com/index.php");

	}

	@When("^User clicks sign in button$")
	public void User_clicks_sign_in_button() {
		main.ClickOnSignInButton();

	}
	
	@When("^User is on the main page get the page title and print it$")
	public void user_is_on_the_main_page_get_the_page_title_and_print_it() throws Throwable {
		
		expectedTitle = main.GetPageTitle();
		System.out.println(expectedTitle);

	}
	
	@Then("^User clicks on first menu link contact us$")
	public void user_clicks_on_first_menu_link() throws Throwable {
		main.Click_ContactUS_Button();

	}
	
	@Then("^User navigates back to Home Page$")
	public void user_navigates_back_to_Home_Page() throws Throwable {
		driver.navigate().back();

	}

	@Then("^Get the page title and print it and verify that value matches the home page title$")
	public void get_the_page_title_and_print_it_and_verify_that_value_matches_the_home_page_title() throws Throwable {
		
		String actualTitle = main.GetPageTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	}
	
	@After
	public void tearDown() {
		BrowserFactory.CloseBrowser();
	}
}