package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.TshirtsPage;

public class TshirtsPageSteps extends BaseStep {

	WebDriver driver = GetDriver();
	TshirtsPage tp = PageFactory.initElements(driver, TshirtsPage.class);
	
	@Then("^Mouse hover on the first product displayed$")
	public void mouse_hover_on_the_first_product_displayed() throws Throwable {
		tp.Hover_Over_Product();

	}

	@Then("^More button will be displayed click on More button$")
	public void more_button_will_be_displayed_click_on_More_button() throws Throwable {
		tp.Click_More_Button_Product_One();

	}
	
	@Then("^User clicks on Add to Wishlist$")
	public void user_clicks_on_Add_to_Wishlist() throws Throwable {
	    tp.Click_wishlistProduct();
	}

	@Then("^Verify that error message is displayed - You must be logged in to manage your wishlist$")
	public void verify_that_error_message_is_displayed_You_must_be_logged_in_to_manage_your_wishlist() throws Throwable {
	    tp.Verify_wishlist_ErrorBox();
	}
}
