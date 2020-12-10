package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.ProductPage;

public class ProductPageSteps extends BaseStep {

	WebDriver driver = GetDriver();
	ProductPage prodp = PageFactory.initElements(driver, ProductPage.class);
	
	@Then("^Increase quantity to two select size L select color$")
	public void increase_quantity_to_two_select_size_L_select_color() throws Throwable {
		prodp.Click_IncreaseQuantity_Button();
		prodp.Select_Size("L");
		prodp.Select_Color();
	}

	@Then("^Click add to cart$")
	public void click_add_to_cart() throws Throwable {
		prodp.Click_AddToCart_Button();
	}

	@Then("^Click procees to checkout$")
	public void click_procees_to_checkout() throws Throwable {
		prodp.Click_ProceedToCheckout_Button();
	}
	
	@Then("^Make sure quantity is set to one Select size M Select color$")
	public void make_sure_quantity_is_set_to_one_Select_size_M_Select_color() throws Throwable {
		prodp.Enter_Quantity("1");
		prodp.Select_Size("M");

	}

}
