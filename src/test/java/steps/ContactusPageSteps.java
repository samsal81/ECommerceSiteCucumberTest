package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.ContactUsPage;

public class ContactusPageSteps extends BaseStep {

	WebDriver driver = GetDriver();
	ContactUsPage contact = PageFactory.initElements(driver, ContactUsPage.class);

	@Then("^Get the page title and print it$")
	public void get_the_page_title_and_print_it() throws Throwable {

		System.out.println(contact.GetPageTitle());
	}

}
