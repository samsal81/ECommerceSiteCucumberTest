package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.OrderPage;
import pages.ProductPage;

public class OrderPageSteps extends BaseStep {

	WebDriver driver = GetDriver();
	OrderPage orderp = PageFactory.initElements(driver, OrderPage.class);
	ProductPage prodp = PageFactory.initElements(driver, ProductPage.class);
	
	@Then("^Complete the buy order process till payment$")
	public void complete_the_buy_order_process_till_payment() throws Throwable {
		orderp.Click_ProceedToCheckout();
		orderp.Click_ProceedToCheckout_Address_Page();
		orderp.Click_CheckBox_AgreeToTerms_Shipping_Page();
		orderp.Click_ProceedToCheckout_Shipping_Page();
		orderp.Click_PayByBankWire_Payment_Page();
		orderp.Click_IConfirmMyOrder_Page();
	}

	@Then("^Make sure that Product is ordered$")
	public void make_sure_that_Product_is_ordered() throws Throwable {
		orderp.Assert_Order_Confirmation();
	}
	
	@Then("^Change the quantity to two Verify that Total price is changing and reflecting correct price$")
	public void change_the_quantity_to_two() throws Throwable {
		prodp.TestTotalCalculation();
	}

}
