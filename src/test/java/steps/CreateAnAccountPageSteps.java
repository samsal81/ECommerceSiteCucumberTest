package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import pages.CreateAnAccountPage;

public class CreateAnAccountPageSteps extends BaseStep {
	
	WebDriver driver = GetDriver();
	CreateAnAccountPage createacc = PageFactory.initElements(driver, CreateAnAccountPage.class);
	
	@Then("^User enters personal information \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_enters_personal_information(String FirstName, String LastName, String Password, String day, String month, String year, String aFirstName, String aLastName, String Company, String Address, String City, String State, String ZipCode, String Country, String alias) throws Throwable {

		createacc.Click_Mr_RadioButton();
	    createacc.Fill_FirstName_Field(FirstName);
	    createacc.Fill_LastName_Field(LastName);
	    createacc.Fill_Password_Field(Password);
	    createacc.SelectDay_Selection(day);
	    createacc.SelectMonth_Selection(month);
	    createacc.SelectYear_Selection(year);
	    createacc.Fill_Address_FirstName_Field(aFirstName);
	    createacc.Fill_Address_LastName_Field(aLastName);
	    createacc.Fill_Address_Company_Field(Company);
	    createacc.Fill_Address1_Field(Address);
	    createacc.Fill_City_Field(City);
	    createacc.Select_State_Field(State);
	    createacc.Fill_ZipCode_Field(ZipCode);
	    createacc.Select_Country_Field(Country);
	    createacc.Fill_AliasAddress_Field(alias);
	}
	
	@Then("^User clicks register button$")
	public void user_clicks_register_button() throws Throwable {
	    createacc.Click_Register_Button();
	}
	
	@Then("^User Leaves the mandatory fields \\(marked with \\*\\) blank and click Register button$")
	public void user_Leaves_the_mandatory_fields_marked_with_blank_and_click_Register_button() throws Throwable {
		
		createacc.Click_Register_Button();
	}

	@Then("^Verify that error has been displayed for the mandatory fields$")
	public void verify_that_error_has_been_displayed_for_the_mandatory_fields() throws Throwable {
	    createacc.VerifyErrorAlertForMandatoryFields();
	}

}
