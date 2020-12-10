package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.LoginPage;

public class LoginPageStep extends BaseStep {

	WebDriver driver = GetDriver();
	LoginPage login = PageFactory.initElements(driver, LoginPage.class);

	@Then("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" and click login$")
	public void user_enters_username_and_password_and_click_login(String username, String password) throws Throwable {

		login.Enter_EMail_Address(username);
		login.Enter_Password(password);
		login.Click_Signin_Button();

	}

	@Then("^User enters email address \"([^\"]*)\"$")
	public void user_enters_email_address(String arg1) throws Throwable {
		login.Fill_CreatAccountEmail_Field();
	}
	
	@Then("^User clicks Create an Account button$")
	public void user_clicks_Create_an_Account_button() throws Throwable {
	    login.Click_CreateAnAccount_Button();
	}
}
