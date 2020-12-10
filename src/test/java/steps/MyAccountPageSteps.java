package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.MyAccountPage;

public class MyAccountPageSteps extends BaseStep {
	
	WebDriver driver = GetDriver();
	MyAccountPage myacc = PageFactory.initElements(driver, MyAccountPage.class);
	
	@Then("^Move your cursor over women's link$")
	public void move_your_cursor_over_women_s_link() throws Throwable {
		myacc.Hover_Over_Women_Button();
	}

	@Then("^Click on sub menu T-shirts$")
	public void click_on_sub_menu_T_shirts() throws Throwable {
		myacc.Click_Tshirts_Button();
	}
	
	@Then("^Validate user account is created \"([^\"]*)\" \"([^\"]*)\"$")
	public void validate_user_account_is_created(String FirstName, String LastName) throws Throwable {
		
		myacc.Assert_NameOnAccount(FirstName, LastName);
	    
	}
}
